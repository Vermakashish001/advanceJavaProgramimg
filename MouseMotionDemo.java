import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyFrame8 extends JFrame implements MouseListener {
    JTextArea ta;
    JButton btn;

    MyFrame8() {
        setBounds(100, 100, 600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        ta = new JTextArea();
        ta.setBounds(10, 200, 400, 600);
        ta.setFont(new Font("Arial", Font.BOLD, 30));
        c.add(ta);

        btn = new JButton("It is Button Area");
        btn.setBounds(50, 50, 300, 100);
        btn.setFont(new Font("Arial", Font.BOLD, 30));
        c.add(btn);
        
        this.addMouseListener(this);

        setVisible(true);
    }


}

public class MouseMotionDemo{
    public static void main(String[] args) {
        new MyFrame8();
    }
}
