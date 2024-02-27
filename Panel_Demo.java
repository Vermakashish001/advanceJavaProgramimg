/*
Component :

1. Heavy Weight Component-> it can not be added to any other component
JFRame, JDialog etc

2. Light Weight COmponent -> it can be added with any other component
e.g. JButton, JLabal

Containr -> It is component which may contain some
other light weight component;
e.g. Container, JPanel

JPanel -> It is light weight component
-> It is a Container
*/

import javax.swing.*;
import java.awt.*;

public class Panel_Demo {
public static void main(String[] args) {
JFrame jf=new JFrame();
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setBounds(100,100,800,700);

Container c=jf.getContentPane();
c.setLayout(null);

JPanel jp=new JPanel();
jp.setBounds(10,10,200,300);
c.add(jp);
jp.setBackground(Color.YELLOW);
jp.setLayout(null);

JPanel jp2=new JPanel();
jp2.setBounds(100,100,100,200);
jp2.setBackground(Color.BLUE);
jp2.setLayout(null);
jp.add(jp2);

JButton btn=new JButton("Button 1");
btn.setBounds(0,0,100,50);
c.add(btn);







jf.setVisible(true);
}
}