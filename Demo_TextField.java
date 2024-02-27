import javax.swing.*;
import java.awt.*;

public class Demo_TextField {
public static void main(String[] args) {
JFrame jf=new JFrame("Demo ot TextFields...");
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setBounds(300,250,800,600);
Container c=jf.getContentPane();
c.setLayout(null);
JTextField txt=new JTextField();

txt.setSize(200,50);
txt.setLocation(100,250);
c.add(txt);

txt.setFont(new Font("Arial",Font.ITALIC,34));
txt.setText("My Text Box 1");
txt.setBackground(Color.YELLOW);
txt.setForeground(Color.RED);

txt.setEditable(false);

jf.setVisible(true);
}

}