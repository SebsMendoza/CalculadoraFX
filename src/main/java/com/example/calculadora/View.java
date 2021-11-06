package com.example.calculadora;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class View extends VBox {
    private Label screen;
    final Controller control = new Controller();

    public View() {
        initView();
    }

    public void initView() {
        //Creamos los botones y pantalla: le damos tamaño a cada uno
        screen = new Label();
        screen.setPrefSize(250, 50);
        screen.setFont(new Font("Arial", 50));
        Button one = new Button("1");
        one.setPrefSize(50, 50);
        Button two = new Button("2");
        two.setPrefSize(50, 50);
        Button three = new Button("3");
        three.setPrefSize(50, 50);
        Button four = new Button("4");
        four.setPrefSize(50, 50);
        Button five = new Button("5");
        five.setPrefSize(50, 50);
        Button six = new Button("6");
        six.setPrefSize(50, 50);
        Button seven = new Button("7");
        seven.setPrefSize(50, 50);
        Button eight = new Button("8");
        eight.setPrefSize(50, 50);
        Button nine = new Button("9");
        nine.setPrefSize(50, 50);
        Button zero = new Button("0");
        zero.setPrefSize(50, 50);
        Button dot = new Button(".");
        dot.setPrefSize(50, 50);
        Button addition = new Button("+");
        addition.setPrefSize(50, 50);
        addition.setStyle("-fx-font-size: 20");
        Button subtract = new Button("-");
        subtract.setPrefSize(50, 50);
        Button multiply = new Button("*");
        multiply.setPrefSize(50, 50);
        Button divide = new Button("/");
        divide.setPrefSize(50, 50);
        Button equal = new Button("=");
        equal.setPrefSize(100, 100);
        equal.setStyle("-fx-font-size: 45");
        Button clear = new Button("c");
        clear.setPrefSize(50, 50);
        setStyle("-fx-font-weight:bold; -fx-font-size: 20");

        //Posicionando los botones
        GridPane keyboard = new GridPane();
        keyboard.add(seven, 1, 1);
        keyboard.add(eight, 2, 1);
        keyboard.add(nine, 3, 1);
        keyboard.add(multiply, 4, 1);
        keyboard.add(divide, 5, 1);
        keyboard.add(four, 1, 2);
        keyboard.add(five, 2, 2);
        keyboard.add(six, 3, 2);
        keyboard.add(addition, 4, 2);
        keyboard.add(subtract, 5, 2);
        keyboard.add(one, 1, 3);
        keyboard.add(two, 2, 3);
        keyboard.add(three, 3, 3);
        keyboard.add(equal, 4, 3, 2, 2);
        keyboard.add(clear, 1, 4);
        keyboard.add(zero, 2, 4);
        keyboard.add(dot, 3, 4);

        //Escuchadores de los botones
        one.setOnMouseClicked(e -> screen.setText(screen.getText() + "1"));
        two.setOnMouseClicked(e -> screen.setText(screen.getText() + "2"));
        three.setOnMouseClicked(e -> screen.setText(screen.getText() + "3"));
        four.setOnMouseClicked(e -> screen.setText(screen.getText() + "4"));
        five.setOnMouseClicked(e -> screen.setText(screen.getText() + "5"));
        six.setOnMouseClicked(e -> screen.setText(screen.getText() + "6"));
        seven.setOnMouseClicked(e -> screen.setText(screen.getText() + "7"));
        eight.setOnMouseClicked(e -> screen.setText(screen.getText() + "8"));
        nine.setOnMouseClicked(e -> screen.setText(screen.getText() + "9"));
        zero.setOnMouseClicked(e -> screen.setText(screen.getText() + "0"));
        dot.setOnMouseClicked(e -> screen.setText(screen.getText() + "."));
        clear.setOnMouseClicked(e -> {
            screen.setText("");
            control.setNum1("");
            control.setNum2("");
        });
        addition.setOnMouseClicked(e -> calcular("+"));
        subtract.setOnMouseClicked(e -> calcular("-"));
        multiply.setOnMouseClicked(e -> calcular("*"));
        divide.setOnMouseClicked(e -> calcular("/"));
        equal.setOnMouseClicked(e -> {
            control.setNum2(screen.getText());
            screen.setText("");
            screen.setText(control.calcular());
            control.setNum1(control.calcular());
        });

        this.getChildren().addAll(screen, keyboard);
    }

    private void calcular(String operator) {
        if (!screen.getText().equalsIgnoreCase(""))
            control.setNum1(screen.getText());
        screen.setText("");
        control.setOperador(operator);
    }

}
