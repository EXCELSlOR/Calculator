package org.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    Model model = new Model();

    @FXML
    private TextField display;

    @FXML
    private void inputDigitAction(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        display.setText(display.getText() + value);
    }

    @FXML
    private void inputOperationAction(ActionEvent event) {
        model.setFirstNumber(Double.parseDouble(display.getText()));
        String value = ((Button)event.getSource()).getText();
        switch (value){
            case "+":
                model.setOperation(Model.Operation.addition);
                break;
            case "-":
                model.setOperation(Model.Operation.subtraction);
                break;
            case "*":
                model.setOperation(Model.Operation.multiplication);
                break;
            case "/":
                model.setOperation(Model.Operation.division);
                break;
        }
    }
}