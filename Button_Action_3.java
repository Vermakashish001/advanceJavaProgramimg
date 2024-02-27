import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Button_Action_3 {
public static void main(String[] args) {
JFrame jf=new JFrame("Anonymous Inner Class on Button");
jf.setBounds(100,100,900,700);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container c=jf.getContentPane();
jf.setLayout(null);
JButton btn=new JButton("Click It");
btn.setBounds(100,100,150,30);
c.add(btn);
btn.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
c.setBackground(Color.BLUE);
}
});
jf.setVisible(true);
}
}