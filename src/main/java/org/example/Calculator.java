package org.example;

import jdk.dynalink.Operation;

public class Calculator {
    public int calculate(Operation operation, int a, int b){
        if(operation==Operation.ADD){
            return a + b;
        } else if(operation==Operation.SUBTRACT){
            return a-b;
        } else if (operation==Operation.MULTIPLY) {
            return a*b;
        } else if (operation==Operation.DIVIDE) {
            return a / b;
        } else
            throw new UnsupportedOperationException("Operation unsupported");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }

        return a / b;
    }
    public enum Operation{
        ADD, SUBTRACT, MULTIPLY, DIVIDE;
    }
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2,2));
    }

}