import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator extends JFrame implements ActionListener
{
    Container c;
    JLabel lblno1, lblno2, lblresult;
    JTextField jtf1, jtf2;
    JButton btnadd, btnsub, btnmul, btndiv, btnmod;
    Calculator()
    {
        setTitle("My Calculator");
        setSize(800,800);
        setLocation(400,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        c=getContentPane();
        c.setLayout(null);
        Font f=new Font("Verdana",Font.BOLD,30);

        // label no 1
        lblno1=new JLabel("First Number : ");
        lblno1.setBounds(100,100,300,50);
        c.add(lblno1);
        lblno1.setFont(f);

        // label no 2
        lblno2=new JLabel("Second Number : ");
        lblno2.setBounds(100,170,300,50);
        c.add(lblno2);
        lblno2.setFont(f);

        // Text Field 1
        jtf1=new JTextField("0");
        jtf1.setBounds(400,100,300,50);
        c.add(jtf1);
        jtf1.setFont(f);

        // Text Field 2
        jtf2=new JTextField("0");
        jtf2.setBounds(400,170,300,50);
        c.add(jtf2);
        jtf2.setFont(f);

        // add
        btnadd=new JButton("+");
        btnadd.setBounds(100,250,100,50);
        btnadd.setFont(f);
        c.add(btnadd);
        btnadd.addActionListener(this);

        //sub
        btnsub=new JButton("-");
        btnsub.setBounds(250,250,100,50);
        btnsub.setFont(f);
        c.add(btnsub);
        btnsub.addActionListener(this);

        // Mul
        btnmul=new JButton("*");
        btnmul.setBounds(400,250,100,50);
        btnmul.setFont(f);
        c.add(btnmul);
        btnmul.addActionListener(this);

        // Div
        btndiv=new JButton("/");
        btndiv.setBounds(550,250,100,50);
        btndiv.setFont(f);
        c.add(btndiv);
        btndiv.addActionListener(this);

        // Mod
        btnmod=new JButton("%");
        btnmod.setBounds(700,250,100,50);
        btnmod.setFont(f);
        c.add(btnmod);
        btnmod.addActionListener(this);

        // label result
        lblresult=new JLabel("Result : ");
        lblresult.setBounds(200,350,300,50);
        c.add(lblresult);
        lblresult.setFont(f);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try{
            int x = Integer.parseInt(jtf1.getText());
            int y = Integer.parseInt(jtf2.getText());
            int z = 0;
            if(btnadd==e.getSource()){
                z= x+y;
                lblresult.setText("Result:"+z);
            }
            if(btnsub==e.getSource()){
                z= x-y;
                lblresult.setText("Result:"+z);
            }
            if(btnmul==e.getSource()){
                z= x*y;
                lblresult.setText("Result:"+z);
            }
            if(btndiv==e.getSource()){
                z= x/y;
                lblresult.setText("Result:"+z);
            }
            if(btnmod==e.getSource()){
                z= x%y;
                lblresult.setText("Result:"+z);
            }
        }
        catch(ArithmeticException ex){
            lblresult.setText("Invalid value: / by Zero");
        }
        catch(NumberException ex){
            lblresult.setText("invalid value: / by str");
        }
    }
}

public class My_Calculator {
    public static void main(String[] args) {
        Calculator c=new Calculator();
    }
}
