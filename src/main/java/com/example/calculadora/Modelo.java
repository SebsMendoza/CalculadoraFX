package com.example.calculadora;

public class Modelo {

    public double operation(double num1, double num2, String operator) {
        switch (operator) {
            case "+": {
                return num1 + num2;
            }
            case "-": {
                return num1 - num2;
            }
            case "*": {
                return num1 * num2;
            }
            case "/": {
                return num2 == 0 ? 0 : num1 / num2;
            }
            default:
                return 0;
        }
    }
}