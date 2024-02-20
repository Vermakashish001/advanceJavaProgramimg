import java.swing.*;
public class TextAreaDemo{
    public static void main(String [] args){
        JFrame jf= new JFrame(title:"my text area");
        jf.setSize(width:800,height:700);
        jf.setLocationRelationTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c= jf.getContentPane();
        c.setLayout(null);

        jf.setVisible(true);
    }
}