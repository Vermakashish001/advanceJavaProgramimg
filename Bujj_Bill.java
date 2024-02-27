import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Food extends JFrame
{
JCheckBox ckb1,ckb2, ckb3,ckb4;
JLabel lblamount;
Food()
{
JFrame jf=new JFrame("Food Menu");
jf.setSize(1000,1000);
jf.setLocationRelativeTo(null);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container c=jf.getContentPane();
c.setLayout(null);

Font f=new Font("Arial",Font.BOLD,34);
JLabel lbl=new JLabel("Food Menu..........");
lbl.setBounds(100,100,500,50);
lbl.setFont(f);
c.add(lbl);

ckb1=new JCheckBox("Pizza....: 250");
ckb1.setBounds(150,200,500,50);
ckb1.setFont(f);
c.add(ckb1);

ckb2=new JCheckBox("Samosa....: 20");
ckb2.setBounds(150,300,500,50);
ckb2.setFont(f);
c.add(ckb2);

ckb3=new JCheckBox("Chilly Paneer....: 350");
ckb3.setBounds(150,400,500,50);
ckb3.setFont(f);
c.add(ckb3);

ckb4=new JCheckBox("Fried Rice ... : 220");
ckb4.setBounds(150,500,500,50);
ckb4.setFont(f);
c.add(ckb4);

JButton btnamount=new JButton("Bill amout ");
btnamount.setBounds(150,570,200,50);
btnamount.setFont(f);
c.add(btnamount);

btnamount.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
float amout=0;
if(ckb1.isSelected())
amout=amout+250;
if(ckb2.isSelected())
amout=amout+20;
if(ckb3.isSelected())
amout=amout+350;
if(ckb4.isSelected())
amout=amout+220;

lblamount.setText("Bill Amount : "+amout);
}
});

lblamount=new JLabel("Bill Amount : ");
lblamount.setBounds(100,680,500,50);
lblamount.setFont(f);
lblamount.setForeground(Color.RED);
c.add(lblamount);
jf.setVisible(true);
}
}
public class Bujj_Bill {
public static void main(String[] args) {
Food t= new Food();
}
}