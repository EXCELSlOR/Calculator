package org.example.calculator;

public class Model {

    public enum Operation {
        addition, subtraction, multiplication, division
    }

    private double firstNumber;

    private double secondNumber;

    private Operation operation;

    double calculate() {
        return 0;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
