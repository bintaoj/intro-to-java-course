package com.cbfacademy.operators;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        double resultAdd = add(3.0, 4.5);
        System.out.println("Addition result: " + resultAdd);

        double resultSubtract = subtract(8.0, 4.5);
        System.out.println("Subtraction result: " + resultSubtract);

    }

    public static double add(double operand1, double operand2) {
        //throw new RuntimeException("Not implemented");
        return operand1 + operand2;

    }

    public static double subtract(double operand1, double operand2) {
        //throw new RuntimeException("Not implemented");
        return operand1 - operand2;
    }

    public static double multiply(double operand1, double operand2) {
        //throw new RuntimeException("Not implemented");
        return operand1 * operand2;
    }

    public static Boolean areEqual(double operand1, double operand2) {
        //throw new RuntimeException("Not implemented");
        return operand1 == operand2;
    }

    public static Boolean isLessThan(double operand1, double operand2) {
        //throw new RuntimeException("Not implemented");
        return operand1 < operand2;
    }

    public static Boolean isMoreThan(double operand1, double operand2) {
        //throw new RuntimeException("Not implemented");
        return operand1 > operand2;
    }
}
