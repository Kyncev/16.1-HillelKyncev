package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Додавання: " +
                calculator.add(10, 5));

        System.out.println("Віднімання: " + calculator.subtract(10, 3));

        System.out.println("Множення: " + calculator.multiply(4, 5));

        System.out.println("Ділення: " + calculator.divide(20, 4));
    }
}