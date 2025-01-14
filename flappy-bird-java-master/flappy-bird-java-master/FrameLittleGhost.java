import javax.swing.*;

public class FrameLittleGhost {
    public static void main(String[] args) throws Exception {
        int frameWidth = 360;
        int frameHeight = 640;

        JFrame frame = new JFrame("Fly away, Little Ghost");
		frame.setSize(frameWidth, frameHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LittleGhost littleGhost = new LittleGhost();
        frame.add(littleGhost);
        frame.pack();
        littleGhost.requestFocus();
        frame.setVisible(true);

    }
}
