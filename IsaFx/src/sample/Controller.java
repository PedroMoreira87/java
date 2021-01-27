package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label lblMsg;

    @FXML
    public void pressButton(ActionEvent event){
        lblMsg.setText("Te amo pra sempre!! =) S2");
    }
}
