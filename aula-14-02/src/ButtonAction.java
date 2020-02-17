import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAction implements ActionListener {

    private JTextField x;
    private JTextField y;
    private JLabel result;
    public static String type;

    public ButtonAction(JTextField x, JTextField y, JLabel result) {
        this.x = x;
        this.y = y;
        this.result = result;
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        TaskDoMath doMath = new TaskDoMath(x, y, result);
        Thread threadDoMath = new Thread(doMath);
        threadDoMath.start();
    }
}
