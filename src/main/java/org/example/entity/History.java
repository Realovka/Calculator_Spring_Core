package org.example.entity;


public class History {
    private Double firstNumber;
    private Double secondNumber;
    private String operation;
    private Double result;

    public History(Double firstNumber, Double secondNumber, String operation, Double result) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operation = operation;
        this.result = result;
    }

    public Double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(Double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public Double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(Double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "History{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                ", operation='" + operation + '\'' +
                ", result=" + result +
                '}';
    }
}
