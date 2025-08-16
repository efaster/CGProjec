import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.*;
import java.util.Queue;

public class GraphicsUtilsPolygonOnly {

    public static void enableAntialiasing(Graphics2D g) {
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
    }

    // วาดเส้นตรง
    public static void drawLine(Graphics2D g, int x1, int y1, int x2, int y2, Color color, float strokeWidth) {
        enableAntialiasing(g);
        g.setColor(color);
        g.setStroke(new BasicStroke(strokeWidth));
        int[] xs = {x1, x2};
        int[] ys = {y1, y2};
        g.drawPolyline(xs, ys, 2);
    }

    // วาดวงกลมโดยประมาณด้วย Polygon
    public static void drawCircle(Graphics2D g, int cx, int cy, int radius, Color color, float strokeWidth) {
        enableAntialiasing(g);
        g.setColor(color);
        g.setStroke(new BasicStroke(strokeWidth));
        Polygon poly = new Polygon();
        int sides = 60; // fix ค่าด้านให้เนียนพอ
        for (int i = 0; i < sides; i++) {
            double angle = 2 * Math.PI * i / sides;
            int x = cx + (int)(radius * Math.cos(angle));
            int y = cy + (int)(radius * Math.sin(angle));
            poly.addPoint(x, y);
        }
        g.drawPolygon(poly);
    }

    // ถมวงกลม
    public static void fillCircle(Graphics2D g, int cx, int cy, int radius, Color color) {
        enableAntialiasing(g);
        g.setColor(color);
        Polygon poly = new Polygon();
        int sides = 60;
        for (int i = 0; i < sides; i++) {
            double angle = 2 * Math.PI * i / sides;
            int x = cx + (int)(radius * Math.cos(angle));
            int y = cy + (int)(radius * Math.sin(angle));
            poly.addPoint(x, y);
        }
        g.fillPolygon(poly);
    }

    // วาด Quadratic Bezier
    public static void drawQuadCurve(Graphics2D g, int x1, int y1, int ctrlX, int ctrlY, int x2, int y2,
                                     Color color, float strokeWidth) {
        enableAntialiasing(g);
        g.setColor(color);
        g.setStroke(new BasicStroke(strokeWidth));
        int segments = 60;
        int[] xs = new int[segments + 1];
        int[] ys = new int[segments + 1];

        for (int i = 0; i <= segments; i++) {
            double t = i / (double)segments;
            double xt = (1 - t) * (1 - t) * x1 + 2 * (1 - t) * t * ctrlX + t * t * x2;
            double yt = (1 - t) * (1 - t) * y1 + 2 * (1 - t) * t * ctrlY + t * t * y2;
            xs[i] = (int)xt;
            ys[i] = (int)yt;
        }
        g.drawPolyline(xs, ys, xs.length);
    }

    // วาด Cubic Bezier
    public static void drawCubicCurve(Graphics2D g, int x1, int y1, int ctrl1X, int ctrl1Y,
                                      int ctrl2X, int ctrl2Y, int x2, int y2,
                                      Color color, float strokeWidth) {
        enableAntialiasing(g);
        g.setColor(color);
        g.setStroke(new BasicStroke(strokeWidth));
        int segments = 60;
        int[] xs = new int[segments + 1];
        int[] ys = new int[segments + 1];

        for (int i = 0; i <= segments; i++) {
            double t = i / (double)segments;
            double xt = Math.pow(1 - t, 3) * x1
                      + 3 * Math.pow(1 - t, 2) * t * ctrl1X
                      + 3 * (1 - t) * t * t * ctrl2X
                      + Math.pow(t, 3) * x2;
            double yt = Math.pow(1 - t, 3) * y1
                      + 3 * Math.pow(1 - t, 2) * t * ctrl1Y
                      + 3 * (1 - t) * t * t * ctrl2Y
                      + Math.pow(t, 3) * y2;
            xs[i] = (int)xt;
            ys[i] = (int)yt;
        }
        g.drawPolyline(xs, ys, xs.length);
    }

    // Flood Fill (เหมือนเดิม)
    public static void floodFill(BufferedImage image, int x, int y, Color targetColor, Color replacementColor, int tolerance) {
        int width = image.getWidth();
        int height = image.getHeight();

        if (x < 0 || y < 0 || x >= width || y >= height) return;

        int targetRGB = targetColor.getRGB();
        int replacementRGB = replacementColor.getRGB();

        if (colorCloseEnough(targetRGB, replacementRGB, tolerance)) return;

        int startRGB = image.getRGB(x, y);
        if (!colorCloseEnough(startRGB, targetRGB, tolerance)) return;

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));

        while (!queue.isEmpty()) {
            Point p = queue.poll();
            int px = p.x;
            int py = p.y;

            if (px < 0 || py < 0 || px >= width || py >= height) continue;

            int currentRGB = image.getRGB(px, py);
            if (!colorCloseEnough(currentRGB, targetRGB, tolerance)) continue;

            image.setRGB(px, py, replacementRGB);

            queue.add(new Point(px + 1, py));
            queue.add(new Point(px - 1, py));
            queue.add(new Point(px, py + 1));
            queue.add(new Point(px, py - 1));
        }
    }

    private static boolean colorCloseEnough(int rgb1, int rgb2, int tolerance) {
        int r1 = (rgb1 >> 16) & 0xFF;
        int g1 = (rgb1 >> 8) & 0xFF;
        int b1 = rgb1 & 0xFF;

        int r2 = (rgb2 >> 16) & 0xFF;
        int g2 = (rgb2 >> 8) & 0xFF;
        int b2 = rgb2 & 0xFF;

        return Math.abs(r1 - r2) <= tolerance &&
               Math.abs(g1 - g2) <= tolerance &&
               Math.abs(b1 - b2) <= tolerance;
    }
}
