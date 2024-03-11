import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//interface MouseLister
// mouseEntered(),mouseClicked(),mousePressed(),
// mouseReleased(),addMouseListener(), mouseExited()
class MyFrame7 extends JFrame implements MouseListener
{
JTextArea ta;
JButton btn;

MyFrame7() {
setBounds(100, 100, 600, 500);
setLocationRelativeTo(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
Container c = getContentPane();
c.setLayout(null);

ta = new JTextArea();
ta.setBounds(10, 200, 400, 600);
ta.setFont(new Font("Arial", Font.BOLD, 30));
c.add(ta);

btn=new JButton("It is Buttone Area");
btn.setBounds(50, 50, 300, 100);
btn.setFont(new Font("Arial", Font.BOLD, 30));
c.add(btn);
btn.addMouseListener(this);

setVisible(true);

}

@Override
public void mouseClicked(MouseEvent e) {

}
@Override
public void mousePressed(MouseEvent e) {

}
@Override
public void mouseReleased(MouseEvent e) {

}
@Override
public void mouseEntered(MouseEvent e) {
ta.setText("Mouse entered in Button Area");
ta.setBackground(Color.YELLOW);
}
@Override
public void mouseExited(MouseEvent e) {
ta.setText("Mouse Exit in Button Area");
ta.setBackground(Color.RED);
}
}
public class MouseEventTest {
public static void main(String[] args) {
new MyFrame7();
}
}