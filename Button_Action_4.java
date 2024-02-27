import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class RedClass implements ActionListener
{
@Override
public void actionPerformed(ActionEvent e) {
Button_Action_4.c.setBackground(Color.RED);
}
}
class GreenClass implements ActionListener
{
@Override
public void actionPerformed(ActionEvent e) {
Button_Action_4.c.setBackground(Color.GREEN);
}

}
class YellowClass implements ActionListener {
@Override
public void actionPerformed(ActionEvent e) {
Button_Action_4.c.setBackground(Color.YELLOW);
}
}
class BlueClass implements ActionListener
{
@Override
public void actionPerformed(ActionEvent e) {
Button_Action_4.c.setBackground(Color.BLUE);
}
}
public class Button_Action_4 {
public static Container c;
public static void main(String[] args) {
JFrame jf=new JFrame("Anonymous Inner Class on Button");
jf.setBounds(100,100,900,700);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
c=jf.getContentPane();
jf.setLayout(null);
JButton btnRed,btneYellow, btnGreen, btnBlue;
Font f=new Font("Arial",Font.BOLD,34);
btnBlue=new JButton("Blue");
btnBlue.setBounds(100,100,150,50);
btnBlue.setFont(f);
c.add(btnBlue);
btnBlue.addActionListener(new BlueClass());
btneYellow=new JButton("Yellow");
btneYellow.setBounds(300,100,150,50);
btneYellow.setFont(f);
c.add(btneYellow);
btneYellow.addActionListener(new YellowClass());
btnGreen=new JButton("Green");
btnGreen.setBounds(100,200,150,50);
btnGreen.setFont(f);
c.add(btnGreen);
btnGreen.addActionListener(new GreenClass());
btnRed=new JButton("Red");
btnRed.setBounds(300,200,150,50);
btnRed.setFont(f);
c.add(btnRed);
btnRed.addActionListener(new RedClass());
jf.setVisible(true);
}
}