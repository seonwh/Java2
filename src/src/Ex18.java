import javax.swing.*;
import java.awt.*;

public class Ex18 extends JFrame {
    public Ex18() {
        setTitle("ContentPane과 JFrame 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setBackground(Color.ORANGE);
        getContentPane().setLayout(new FlowLayout());

        add(new JButton("OK"));
        add(new JButton("Cancel"));
        add(new JButton("Ignore"));

        setSize(300,150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Ex18();
    }
}
