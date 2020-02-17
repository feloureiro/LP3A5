import javax.swing.*;
import java.awt.*;

public class Application {
    public static void main(String[] args) {
        JFrame window = new JFrame("Calculadora");


        JTextField addX = new JTextField(10);
        JTextField addY = new JTextField(10);
        JButton equals = new JButton(" = ");
        JLabel result = new JLabel("Result");

        equals.addActionListener(new ButtonAction(addX, addY, result));

        JPanel panel = new JPanel();

        JButton add = new JButton(" + ");
        add.addActionListener(new ChangeCount("+"));
        JButton minus = new JButton(" - ");
        minus.addActionListener(new ChangeCount("-"));
        JButton times = new JButton(" * ");
        times.addActionListener(new ChangeCount("*"));
        JButton divide = new JButton(" / ");
        divide.addActionListener(new ChangeCount( "/"));

        panel.add(addX);
        panel.add(add);
        panel.add(minus);
        panel.add(times);
        panel.add(divide);
        panel.add(addY);
        panel.add(equals);
        panel.add(result);
        panel.add(new JLabel("\n"));

        window.add(panel);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setPreferredSize(new Dimension(800, 100));
        window.pack();
        window.setVisible(true);
    }
}
