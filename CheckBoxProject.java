import javax.swing.*;
import java.awt.*;

public class CheckBoxProject{
    public static void main(String[] args){
        JFrame jf= new JFrame(" My Check Box Button");
        jf.setSize(800,700);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c= jf.getContentPane();
        c.setLayout(null);

        Font f = new Font("Arial",Font.BOLD,34); 

        JCheckBox ckb1=new JCheckBox("Pizza - 250");
        ckb1.setBounds(150,200,300,50); 
        ckb1.setFont(f);
        c.add(ckb1);

        JCheckBox ckb2=new JCheckBox("Burger - 450");
        ckb2.setBounds(150,250,300,50); 
        ckb2.setFont(f);
        c.add(ckb2);

        JCheckBox ckb3=new JCheckBox("Momos - 350");
        ckb3.setBounds(150,300,300,50); 
        ckb3.setFont(f);
        c.add(ckb3);

        JCheckBox ckb4=new JCheckBox("Noodles - 150");
        ckb4.setBounds(150,350,300,50);
        ckb4.setFont(f);
        c.add(ckb4);

        JButton btn = new JButton("Bill Amount");
        btn.setBounds(150,400,250,45);
        btn.setFont(f);
        c.add(btn);

        jf.setVisible(true);
    }
}
