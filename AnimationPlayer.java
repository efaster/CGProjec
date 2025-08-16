import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimationPlayer extends JPanel implements ActionListener {
    private static final int WIDTH = 600;
    private static final int HEIGHT = 600;
    private static final int FPS = 24;
    private static final int DELAY = 100; 
    private int currentFrame = 0;
    private final Timer timer;

    // public AnimationPlayer() {
    //     setPreferredSize(new Dimension(WIDTH, HEIGHT));
    //     timer = new Timer(1000 / FPS, this); // 41ms per frame
    //     timer.start();
    // }
    public AnimationPlayer() {
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    timer = new Timer(DELAY, this);
    timer.start();
}


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        MyFrames.drawFrame((Graphics2D) g, currentFrame);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        currentFrame++;
        if (currentFrame >= MyFrames.TOTAL_FRAMES) {
            // currentFrame = 0;
            timer.stop(); // 🛑 หยุด animation
        }
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Stickman Animation (2 poses)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(new AnimationPlayer());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
