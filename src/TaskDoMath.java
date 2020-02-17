import javax.swing.*;
import java.math.BigInteger;

public class TaskDoMath implements Runnable {

    private JTextField x;
    private JTextField y;
    private JLabel result;

    public TaskDoMath(JTextField x, JTextField y, JLabel result) {
        this.x = x;
        this.y = y;
        this.result = result;
    }

    @Override
    public void run() {
        long xLong;
        long yLong;
        BigInteger resultLong = new BigInteger("0");
        switch (ButtonAction.type) {

            case "+" :
                xLong = Long.parseLong(this.x.getText());
                yLong = Long.parseLong(this.y.getText());

                for(int i = 0; i < xLong; i++) {
                    resultLong = resultLong.add(new BigInteger("1"));
                }
                for(int j = 0; j < yLong; j++) {
                    resultLong = resultLong.add(new BigInteger("1"));
                }

                result.setText(resultLong.toString());
                break;
            case "-" :
                xLong = Long.parseLong(this.x.getText());
                yLong = Long.parseLong(this.y.getText());

                for(int i = 0; i < xLong; i++) {
                    resultLong = resultLong.add(new BigInteger("1"));
                }
                for(int j = 0; j < yLong; j++) {
                    resultLong = resultLong.add(new BigInteger("-1"));
                }
                result.setText(resultLong.toString());
                break;
            case "*" :
                xLong = Long.parseLong(this.x.getText());
                yLong = Long.parseLong(this.y.getText());

                for(int i = 0; i < xLong; i++) {
                    for(int j = 0; j < yLong; j++) {
                        resultLong = resultLong.add(new BigInteger("1"));
                    }
                }
                result.setText(resultLong.toString());
                break;
            case "/" :
                xLong = Long.parseLong(this.x.getText());
                yLong = Long.parseLong(this.y.getText());
                long resultDiv = 0;
                resultLong.add(new BigInteger(""+xLong));
                for(long i = 1; xLong > 0; i++) {
                    resultDiv = i;
                    xLong -= yLong;
                    resultLong = resultLong.add(new BigInteger("-"+yLong));
                }
                result.setText(resultDiv+ "");
                break;
        }
    }
}
