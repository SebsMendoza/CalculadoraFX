package com.example.calculadora;

public class Controller {
    final Modelo model = new Modelo();
    private String num1, num2, operator;

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public void setOperador(String operator) {
        this.operator = operator;
    }

    public String calcular() {
        return String.valueOf(model.operation(Double.parseDouble(num1), Double.parseDouble(num2), operator));
    }
}
