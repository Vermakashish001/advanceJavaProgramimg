import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame {
    JTextField txt;
    Container c;

    MyFrame() {
        setTitle("My Frame");
        c = getContentPane();
        c.setLayout(null);
        txt = new JTextField();
        txt.setBounds(50, 50, 150, 20);
        txt.setFont(new Font("Arial", Font.PLAIN, 16)); 
        c.add(txt);
        txt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                String s = txt.getText();
                txt.setText(s.toUpperCase());
                System.out.println("Text field filled with: " + txt.getText());
            }
        });
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
