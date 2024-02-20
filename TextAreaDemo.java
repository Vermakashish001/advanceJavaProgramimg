import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaDemo{
    public static void main(String [] args){
        JFrame jf= new JFrame("my text area");
        jf.setSize(800,700);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c= jf.getContentPane();
        c.setLayout(null);

        JTextArea txtarea= new JTextArea("this my adv java class");
        txtarea.setBounds(100,100,400,300);
        c.add(txtarea);
        txtarea.setFont(new Font("Vardana",Font.ITALIC,30));
        txtarea.setForeground(Color.blue);
        txtarea.setBackground(Color.black);
        txtarea.setLineWrap(true);
        //txtarea.setEnabled(false);
        Font f= new Font("Vardana",Font.BOLD,30);
        JLabel lblWordCount=new JLabel("Words: 0");
        lblWordCount.setBounds(100,500,200,50);
        lblWordCount.setFont(f);
        lblWordCount.setForeground(Color.blue);
        c.add(lblWordCount);

        JLabel lblCharCount=new JLabel("Chars: 0");
        lblCharCount.setBounds(100,600,200,50);
        lblCharCount.setFont(f);
        lblCharCount.setForeground(Color.blue);
        c.add(lblCharCount);

        JButton btnCount = new JButton("Count Words and Chars");
        btnCount.setBounds(100, 400, 200, 50);
        c.add(btnCount);
        btnCount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = txtarea.getText();
                int words = text.split("\\s+").length;
                int chars = text.length();
                lblWordCount.setText("Words: " + words);
                lblCharCount.setText("Chars: " + chars);
            }
        });

        jf.setVisible(true);

    }
}
