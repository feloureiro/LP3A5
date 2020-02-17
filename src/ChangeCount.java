import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeCount implements ActionListener {

    String newType;

    public ChangeCount(String newType){
        this.newType = newType;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ButtonAction.type = newType;
    }
}
