import javax.swing.*;
import java.awt.*;
class Swing{
    public static void main(String[] args){
        JFrame frame = new JFrame("New Jframe");
        frame.setSize(400,400);
        // frame.setLocation(540,250);
        // frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.red);
        frame.add(panel);

        JLabel label = new JLabel("Hello World");
        panel.add(label, BorderLayout.NORTHWEST);
        JLabel label2 = new JLabel("Hello World");
        panel.add(label2, BorderLayout.SOUTHWEST);
    }
}