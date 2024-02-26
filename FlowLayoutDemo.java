import javax.swing.*;
import java.awt.*;

class Flow_Layout extends JFrame{
    JButton btn1,btn2,btn3,btn4,btn5,btn6;
    Container c ;
    Flow_Layout(){
        btn1 = new JButton("Button 1");
        btn2 = new JButton("Button 2");
        btn3 = new JButton("Button 3");
        btn4 = new JButton("Button 4");
        btn5 = new JButton("Button 5");
        btn6 = new JButton("Button 6");

        setBounds(100,100,600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.CENTER));

        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);
        c.add(btn6);

        setVisible(true);
    }
}

public class FlowLayoutDemo{
    public static void main(String[] args){
        new Flow_Layout();
    }
}
