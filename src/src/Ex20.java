import javax.swing.*;
import java.awt.*;

public class Ex20 extends JFrame {
    public Ex20() {
        setTitle("BorderLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        contentPane.setLayout(new BorderLayout(30,20));

        add(new JButton("add"), BorderLayout.CENTER);
        add(new JButton("sub"), BorderLayout.NORTH);
        add(new JButton("mul"), BorderLayout.SOUTH);
        add(new JButton("div"), BorderLayout.EAST);
        add(new JButton("Calculate"), BorderLayout.WEST);

        setSize(300,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Ex20();
    }
}