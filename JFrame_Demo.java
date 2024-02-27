import javax.swing.*;
import java.awt.*;

public class JFrame_Demo {
public static void main(String[] args) {
JFrame jf=new JFrame("It is My First Frame");
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setBounds(300,250,800,600);
Container c=jf.getContentPane();
c.setLayout(null);


jf.setTitle("My First Application");
ImageIcon myicon=new ImageIcon("C:\\MyJavaProgram\\download.jpeg");
jf.setIconImage(myicon.getImage());
jf.setResizable(false);
c.setBackground(Color.BLUE);


jf.setVisible(true);
}
}