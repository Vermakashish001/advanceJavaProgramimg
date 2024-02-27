import javax.swing.*;
import java.awt.*;

public class JList_Demo {
public static void main(String[] args) {
JFrame jf=new JFrame();
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setBounds(100,100,800,700);
Container c=jf.getContentPane();
c.setLayout(null);

String []item={
"Samosa", "Pizza", "Juice",
"Panner", "Fried RICE", "Tea",
"Dosa", "Idle", "Soup",
"Corn Soup"
};
jf.setVisible(true);

JList list=new JList(item);
list.setVisibleRowCount(4);

list.setFont(new Font("Verdana",Font.BOLD,30));
JPanel jp=new JPanel();
jp.setBounds(10,10,500,400);
jp.add(new JScrollPane(list));
jf.add(jp);
jf.revalidate();


}
}