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
}