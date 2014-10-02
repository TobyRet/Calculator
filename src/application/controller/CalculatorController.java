package application.controller;

import application.LaunchApp;
import application.model.Calculator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class CalculatorController {

    private Calculator calculator ;

    @FXML
    private Text display;

    @FXML
    private void initialize(){

    }

    private LaunchApp launchApp;

    @FXML
    public void oneButtonClicked(ActionEvent actionEvent) {
        display.setText("1");
    }

    @FXML
    public void twoButtonClicked(ActionEvent actionEvent) {
        display.setText(append("2"));
    }

    private String append(String value) {
        return display.getText() + value;
    }

    @FXML
    public void threeButtonClicked(ActionEvent actionEvent) {
        display.setText(append("3"));
    }

    @FXML
    public void fourButtonClicked(ActionEvent actionEvent) {
        display.setText(append("4"));
    }

    @FXML
    public void fiveButtonClicked(ActionEvent actionEvent) {
        display.setText(append("5"));
    }

    @FXML
    public void sixButtonClicked(ActionEvent actionEvent) {
        display.setText(append("6"));
    }

    @FXML
    public void sevenButtonClicked(ActionEvent actionEvent) {
        display.setText(append("7"));
    }

    @FXML
    public void eightButtonClicked(ActionEvent actionEvent) {
        display.setText(append("8"));
    }

    @FXML
    public void nineButtonClicked(ActionEvent actionEvent) {
        display.setText(append("9"));
    }

    @FXML
    public void zeroButtonClicked(ActionEvent actionEvent) {
        display.setText(append("0"));
    }

    @FXML
    public void addButtonClicked(ActionEvent actionEvent) {
        display.setText("add some shit");
    }

    @FXML
    public void equalsButtonClicked(ActionEvent actionEvent) {
        display.setText("equals some shit");
    }

    public CalculatorController() {
        this.calculator = new Calculator();
    }

    public void setMainApp(LaunchApp launchApp) {
        this.launchApp = launchApp;
    }


}
