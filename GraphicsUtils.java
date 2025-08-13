import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.util.*;
import java.util.Queue;

public class GraphicsUtils {

    // ตั้ง Anti-Aliasing ให้กับ Graphics2D (ควรเรียกใช้ก่อนวาดเสมอ)
    public static void enableAntialiasing(Graphics2D g) {
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
    }

    // 🔷 วาดเส้นตรง แบบเรียบเนียน
    public static void drawLine(Graphics2D g, int x1, int y1, int x2, int y2, Color color, float strokeWidth) {
        enableAntialiasing(g);
        g.setColor(color);
        g.setStroke(new BasicStroke(strokeWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g.drawLine(x1, y1, x2, y2);
    }

    // 🔵 วาดวงกลม / วงรี แบบ smooth
    public static void drawCircle(Graphics2D g, int centerX, int centerY, int radius, Color color, float strokeWidth) {
        enableAntialiasing(g);
        g.setColor(color);
        g.setStroke(new BasicStroke(strokeWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g.drawOval(centerX - radius, centerY - radius, radius * 2, radius * 2);
    }

    // 🔴 ถมวงกลม แบบ smooth (ปกติ fillOval ทำได้ดีอยู่แล้ว)
    public static void fillCircle(Graphics2D g, int centerX, int centerY, int radius, Color color) {
        enableAntialiasing(g);
        g.setColor(color);
        g.fillOval(centerX - radius, centerY - radius, radius * 2, radius * 2);
    }

    // 🔶 วาดเส้นโค้ง Bezier Cubic แบบ smooth และละเอียดมากขึ้น
    public static void drawCubicCurve(Graphics2D g, int x1, int y1, int ctrl1X, int ctrl1Y,
                                      int ctrl2X, int ctrl2Y, int x2, int y2,
                                      Color color, float strokeWidth) {
        enableAntialiasing(g);
        g.setColor(color);
        g.setStroke(new BasicStroke(strokeWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

        CubicCurve2D curve = new CubicCurve2D.Float(x1, y1, ctrl1X, ctrl1Y, ctrl2X, ctrl2Y, x2, y2);
        g.draw(curve);
    }

    // 🟪 เมธอดใหม่ — วาดเส้นโค้ง Quadratic Bezier (ใช้ 1 control point) สำหรับเส้นโค้งที่ละเอียด
    public static void drawQuadCurve(Graphics2D g, int x1, int y1, int ctrlX, int ctrlY, int x2, int y2,
                                     Color color, float strokeWidth) {
        enableAntialiasing(g);
        g.setColor(color);
        g.setStroke(new BasicStroke(strokeWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

        QuadCurve2D curve = new QuadCurve2D.Float(x1, y1, ctrlX, ctrlY, x2, y2);
        g.draw(curve);
    }

    // 🟩 ถมรูปร่างใดๆ แบบเป๊ะ (ไม่มีขอบขาว)
    public static void fillShape(Graphics2D g, Shape shape, Color color) {
        enableAntialiasing(g);
        g.setColor(color);
        g.fill(shape);
    }

    // 🟨 วาดรูปร่างพร้อมขอบ แบบ smooth
    public static void drawShape(Graphics2D g, Shape shape, Color color, float strokeWidth) {
        enableAntialiasing(g);
        g.setColor(color);
        g.setStroke(new BasicStroke(strokeWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g.draw(shape);
    }

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
