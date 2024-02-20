import javax.swing.*;
import java.awt.*;

public class CheckBoxButton{
    public static void main(String[] args){
        JFrame jf= new JFrame(" My Check Box Button");
        jf.setSize(800,700);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c= jf.getContentPane();
        c.setLayout(null);

        Font f = new Font("Arial",Font.BOLD,34); 
        JLable lbl= new JLable("Course completed....");
        lbl.setBounds(100,100,200,50);
        lbl.setFont(f);
        c.add(lbl);
        
        JCheckBox ckb=new JCheckBox("java...");
        ckb1.setBounds(150,200,200,50);
        ckb1.setFont(f);
        c.add(ckb1);

        JCheckBox ckb=new JCheckBox("C++...");
        ckb2.setBounds(250,300,200,50);
        ckb2.setFont(f);
        c.add(ckb2);

        JCheckBox ckb=new JCheckBox("HTML...");
        ckb3.setBounds(350,400,200,50);
        ckb2.setFont(f);
        c.add(ckb3);

        jf.setVisible(true);
    }
}