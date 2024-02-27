import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame2 extends JFrame implements ActionListener
{
Container c;
JButton btnRed,btneYellow, btnGreen, btnBlue;
MyFrame2()
{
c=this.getContentPane();
c.setLayout(null);
Font f=new Font("Arial",Font.BOLD,34);
btnBlue=new JButton("Blue");
btnBlue.setBounds(100,100,150,50);
btnBlue.setFont(f);
c.add(btnBlue);
btnBlue.addActionListener(this);

btneYellow=new JButton("Yellow");
btneYellow.setBounds(300,100,150,50);
btneYellow.setFont(f);
c.add(btneYellow);
btneYellow.addActionListener(this);

btnGreen=new JButton("Green");
btnGreen.setBounds(100,200,150,50);
btnGreen.setFont(f);
c.add(btnGreen);
btnGreen.addActionListener(this);

btnRed=new JButton("Red");
btnRed.setBounds(300,200,150,50);
btnRed.setFont(f);
c.add(btnRed);
btnRed.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
if(btnGreen==e.getSource())
{
c.setBackground(Color.GREEN);
}
if(btnRed==e.getSource())
c.setBackground(Color.RED);
if(btneYellow==e.getSource())
c.setBackground(Color.YELLOW);
if(btnBlue==e.getSource())
c.setBackground(Color.BLUE);
}
}
public class Button_Action_2 {
public static void main(String[] args) {
MyFrame2 f=new MyFrame2();

f.setBounds(100,100,800,600);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

f.setVisible(true); //
}
}