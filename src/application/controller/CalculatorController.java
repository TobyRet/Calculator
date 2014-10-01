package application.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorController implements Initializable {

    @FXML
    private Text display;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void oneAction(ActionEvent actionEvent) {

    }

    public void twoAction(ActionEvent actionEvent) {

    }

    public void threeAction(ActionEvent actionEvent) {

    }

    public void setDisplay(Text display) {
        this.display = display;
    }
}
