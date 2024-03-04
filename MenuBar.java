import javax.swing.JFrame;
import java.awt.Container;

public class MenuBar{
    public static void main(String args[]){
        JFrame f = new JFrame("my Menu Bar");
        f.setSize(700,500);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = f.getContentPane();


        
        f.setVisible(true);
    }
}
