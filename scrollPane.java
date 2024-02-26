import javax.swing.*;
import java.awt.*;

public class scrollPane{
    public static void main(String[] args){
        JFrame jf= new JFrame("Demo of Scroll Pane");

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(100,100,500,600);
        jf.setLayout(new FlowLayout());
        
        JTextArea ta = new JTextArea(5,20);
        ta.setFont(new Font("Arial",Font.BOLD,34));

        JScrollPane jsp = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jf.add(jsp);

        String []s={
            "tea","samosha","momos","pizza","coffee","Noodles","Burger","Rice","Panner","chicken","fish"
        };
        JList<String>list=new JList<>(s);
        JScrollPane jsp2 = new JScrollPane(list, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jf.add(jsp2);
        jsp2.setBounds(500,500,200,50);

        jf.setVisible(true);
    }
}
