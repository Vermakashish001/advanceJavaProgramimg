import javax.swing.*;
import java.awt.*;

public class Label_Demo {
public static void main(String[] args) {
JFrame jf=new JFrame("Label Demo..!");
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setBounds(300,250,800,600);
Container c=jf.getContentPane();
c.setLayout(null);

ImageIcon img=new ImageIcon("C:\\MyJavaProgram\\download.png");

JLabel label=new JLabel("My label....",img,JLabel.RIGHT);
label.setLocation(100,100);
label.setSize(img.getIconWidth(),img.getIconHeight());
//label.setBounds(100,100,200,50);
c.add(label);

//Font f=new Font("Verdana",Font.BOLD,32);
label.setFont(new Font("Verdana",Font.BOLD,32));
label.setForeground(Color.RED);
label.setBackground(Color.YELLOW);
label.setOpaque(true);




jf.setVisible(true);
}
}