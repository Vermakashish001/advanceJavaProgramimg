import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuBar extends JFrame implements ActionListener {
    JMenuBar menubar;
    JMenu file, edit;
    JMenuItem f1, f2, f3;
    JMenuItem e1, e2, e3;
    JTextArea ta;

    MenuBar() {
        setLayout(null);
        ta = new JTextArea();
        ta.setLineWrap(true);
        ta.setBounds(10, 10, 850, 750);
        ta.setFont(new Font("Arial", Font.PLAIN, 30));
        add(ta);

        menubar = new JMenuBar();
        file = new JMenu("File");
        f1 = new JMenuItem("New");
        f2 = new JMenuItem("Open");
        f3 = new JMenuItem("Close");

        file.add(f1);
        file.add(f2);
        file.add(f3);

        edit = new JMenu("Edit");
        e1 = new JMenuItem("Cut");
        e2 = new JMenuItem("Copy");
        e3 = new JMenuItem("Paste");

        edit.add(e1);
        edit.add(e2);
        edit.add(e3);

        menubar.add(file);
        menubar.add(edit);
        setJMenuBar(menubar);
    }

    public void actionPerformed(ActionEvent e) {
        // Add your action events here
    }

    public static void main(String[] args) {
        MenuBar f = new MenuBar();
        f.setTitle("My Notepad");
        f.setSize(900, 800);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
