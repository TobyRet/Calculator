package application.controller;

import application.LaunchApp;
import application.model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;

public class CalculatorController {

    private Operation operation;
    private LaunchApp launchApp;
    private List<String> numbersToOperateOn = new ArrayList<String>();
    @FXML private Text display;

    public CalculatorController() {
    }

    @FXML
    private void initialize(){
    }

    @FXML
    public void oneButtonClicked(ActionEvent actionEvent) {
        if(display.getText().length() < 9) {
            display.setText("1");
        }
    }

    @FXML
    public void twoButtonClicked(ActionEvent actionEvent) {
        display.setText(append("2"));
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
    public void decimalButtonClicked(ActionEvent actionEvent) {
        if(!display.getText().contains(".")) {
            display.setText(append("."));
        }
    }

    @FXML
    public void crapButtonClicked(ActionEvent actionEvent) {
        display.setText(append("CRAP!"));
    }

    @FXML
    public void addButtonClicked(ActionEvent actionEvent) {
        numbersToOperateOn.add(display.getText());
        operation = new AddOperation();
        display.setText("");
    }

    @FXML
    public void subtractButtonClicked(ActionEvent actionEvent) {
//        numbersToOperateOn.add(display.getText());
//        operation = new SubtractOperation();
//        display.setText("");
    }

    @FXML
    public void multiplyButtonClicked(ActionEvent actionEvent) {
        numbersToOperateOn.add(display.getText());
        operation = new MultiplyOperation();
        display.setText("");
    }

    @FXML
    public void divideButtonClicked(ActionEvent actionEvent) {
        numbersToOperateOn.add(display.getText());
        operation = new DivideOperation();
        display.setText("");
    }

    @FXML
    public void equalsButtonClicked(ActionEvent actionEvent) {
        numbersToOperateOn.add(display.getText());
        display.setText(operation.execute(numbersToOperateOn));
        numbersToOperateOn.clear();
    }

    @FXML
    public void clearButtonClicked(ActionEvent actionEvent) {
        numbersToOperateOn.clear();
        clearDisplay();
    }

    public void setMainApp(LaunchApp launchApp) {
        this.launchApp = launchApp;
    }

    private String append(String value) {
        return display.getText() + value;
    }

    private void clearDisplay() {
        display.setText("");
    }


}
