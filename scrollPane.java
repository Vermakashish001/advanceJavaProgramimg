import javax.swing.*;
import java.awt.*;

public class scrollPane{
    public static void main(String[] args){
        JFrame jf= new JFrame("Demo of Scroll Pane");

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(100,100,500,600);
        jf.setLayout(new FlowLayout());
        
        JTextArea ta = new JTextArea(5,20);
        ta.setBounds(100,100,300,50);
        ta.setFont(new Font("A",Font.BOLD,34));

        JScrollPane jsp = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        jf.add(jsp);

        jf.setVisible(true);
    }
}
