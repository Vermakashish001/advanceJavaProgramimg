import javax.swing.*;
import java.awt.*;

public class Radio_Button{
    public static void main(String[] args){
        JFrame jf= new JFrame("Radio Button");
        jf.setSize(800,700);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c= jf.getContentPane();
        c.setLayout(null);

        Font f = new Font("Arial",Font.BOLD,34); 

        JRadioButton rbtnFemale = new JRadioButton("Female");
        rbtnFemale.setBounds(200,200,200,50);
        rbtnFemale.setFont(f);
        rbtnFemale.setForeground(Color.blue);
        rbtnFemale.setBorder(BorderFactory.createLineBorder(Color.RED, 5)); // Add border
        c.add(rbtnFemale);

        JRadioButton rbtnMale = new JRadioButton("Male");
        rbtnMale.setBounds(200,300,200,50);
        rbtnMale.setFont(f);
        rbtnMale.setForeground(Color.blue);
        rbtnMale.setBorder(BorderFactory.createLineBorder(Color.RED, 5)); // Add border
        c.add(rbtnMale);

        JRadioButton rbtnOther = new JRadioButton("Other");
        rbtnOther.setBounds(200,400,200,50);
        rbtnOther.setFont(f);
        rbtnOther.setForeground(Color.blue);
        rbtnOther.setBorder(BorderFactory.createLineBorder(Color.RED, 5)); // Add border
        c.add(rbtnOther);

        ButtonGroup gender = new ButtonGroup();
        gender.add(rbtnMale);
        gender.add(rbtnFemale);
        gender.add(rbtnOther);

        rbtnFemale.setSelected(true);
        jf.setVisible(true);
    }
}
