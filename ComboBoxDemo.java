import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxDemo {
public static void main(String[] args) {
JFrame jf=new JFrame("My Combo Box...");
jf.setSize(800,600);
jf.setLocationRelativeTo(null);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container c=jf.getContentPane();
c.setLayout(null);

String values[]={"Parle - G", "Soap","Coca","Juice","Samosa"};

JComboBox jcb=new JComboBox(values);
jcb.setBounds(100,200,300,50);
c.add(jcb);
jcb.setFont(new Font("Arial",Font.BOLD,30));

jcb.addItem("Gulab Jamun");
jcb.addItem("Kalakanad");

jcb.setEditable(false);

//jcb.setSelectedItem("Kalakanad");
jcb.setSelectedIndex(3);

JLabel lbl=new JLabel("");
lbl.setBounds(500,200,200,50);
lbl.setFont(new Font("Verdana",Font.ITALIC,36));
lbl.setForeground(Color.RED);
c.add(lbl);

JButton btn=new JButton("Show It");
btn.setBounds(200,300,200,50);
btn.setFont(new Font("Verdana",Font.ITALIC,30));
c.add(btn);

btn.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {

//lbl.setText(jcb.getSelectedItem().toString());
lbl.setText(String.valueOf(jcb.getSelectedIndex()));
}
});



jf.setVisible(true);
}
}