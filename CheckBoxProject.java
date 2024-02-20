import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        btn.setBounds(150,400,300,50);
        btn.setFont(f);
        c.add(btn);

        JLabel totalAmount = new JLabel("Total Amount: ");
        totalAmount.setBounds(150,450,300,50);
        totalAmount.setFont(f);
        c.add(totalAmount);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int total = 0;
                if (ckb1.isSelected()) {
                    total += 250;
                }
                if (ckb2.isSelected()) {
                    total += 450;
                }
                if (ckb3.isSelected()) {
                    total += 350;
                }
                if (ckb4.isSelected()) {
                    total += 150;
                }
                totalAmount.setText("Total Amount: " + total);
            }
        });

        jf.setVisible(true);
    }
}
