import javax.swing.*;
import java.awt.*;

class MyFrame5 extends JFrame{
    JButton b1 = new JButton("Botton 1");
    JButton b2 = new JButton("Botton 2");
    JButton b3 = new JButton("Botton 3");
    JButton b4 = new JButton("Botton 4");
    JButton b5 = new JButton("Botton 5");

    MyFrame5(){
        setTitle("grid Layout");
        setBounds(100,100,800,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        Container c = getContentPane();
        GridLayout gl=new GridLayout(2,5);
        c.setLayout(gl);
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);

        setVisible(true);

    }
}

public class GridLayoutDemo{
    public static void main(String[] args) {
        new MyFrame5();
    }
}