import javax.swing.*;
import java.awt.*;

public class BoderLayoutDemo{
    public static void main(String[] args) {
        JFrame jf = new JFrame("Border Layout");
        jf.setBounds(100, 100, 800, 600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.setLocationRelativeTo(null);
        Container c = jf.getContentPane();

        BorderLayout bl = new BorderLayout(10,5);
        //bl.setVgap(15);
       // bl.setHgap(20);
       
        c.setLayout(bl);
        JButton b1 = new JButton("North");
        JButton b2 = new JButton("South");
        JButton b3 = new JButton("East");
        JButton b4 = new JButton("West");
        JButton b5 = new JButton("Center");

        //c.add(b1, BorderLayout.NORTH);
        //c.add(b2, BorderLayout.SOUTH);
        //c.add(b3, BorderLayout.EAST);
        //c.add(b4, BorderLayout.WEST);
        //c.add(b5, BorderLayout.CENTER);

        c.add(b1, BorderLayout.PAGE_START);
        c.add(b2, BorderLayout.PAGE_END);
        c.add(b3, BorderLayout.LINE_START);
        c.add(b4, BorderLayout.LINE_END);
        c.add(b5, BorderLayout.CENTER);


        Font f = new Font("Arial", Font.PLAIN, 16); // Define the font here
        // Set the font for button b1

        jf.setVisible(true);
    }
}
