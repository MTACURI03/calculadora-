import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new calcu();
                frame.setSize(800,600);
                frame.setVisible(true);
            }
        });

    }
}
