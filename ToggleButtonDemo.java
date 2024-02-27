import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToggleButtonDemo {
public static void main(String[] args) {
JFrame jf=new JFrame("My Toggle Button.");
jf.setSize(800,600);
jf.setLocationRelativeTo(null);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container c=jf.getContentPane();
c.setLayout(null);

JToggleButton jtb=new JToggleButton("OFF");
jtb.setBounds(300,300,200,50);
jtb.setFont(new Font("Arial",Font.BOLD,34));
c.add(jtb);
c.setBackground(Color.WHITE);

jtb.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
if(jtb.isSelected())
{
c.setBackground(Color.green);
jtb.setText("ON");
}
else
{
c.setBackground(Color.WHITE);
jtb.setText("OFF");
}
}
});
jf.setVisible(true);
}
}