package org.sharpsw.leetcode;

import java.util.Stack;

public class Calc {
    public double evaluate(String expr) throws MissingNumberException {
        if(!isValidExpression(expr)) {
            return 0;
        }

        Stack<Double> numbers = new Stack<>();
        String[] tokens = expr.split(" ");

        for(int index = 0; index < tokens.length; index++) {
            if(Character.isDigit(tokens[index].charAt(0))) {
                numbers.push(Double.parseDouble(tokens[index]));
            } else {
                if(numbers.size() < 2) {
                    throw new MissingNumberException("Missing numbers for math operation");
                } else {
                    Double secondNumber = numbers.pop();
                    Double firstNumber = numbers.pop();
                    numbers.push(applyMathOperation(firstNumber, secondNumber, tokens[index]));
                }
            }
        }

        if(numbers.size() == 1) {
            return numbers.pop();
        }
        throw new ArithmeticException("Math expression not finished");
    }

    private Double applyMathOperation(Double firstNumber, Double secondNumber, String operation) {
        switch(operation) {
            case "+": return firstNumber + secondNumber;
            case "-": return firstNumber - secondNumber;
            case "/": return firstNumber / secondNumber;
            case "*": return firstNumber * secondNumber;
            default: return 0.0;
        }
    }

    private boolean isValidExpression(String expr) {
        if(expr == null || expr.isEmpty()) {
            return false;
        }

        if(expr.length() == 1 && (expr.charAt(0) == '+' || expr.charAt(0) == '-' || expr.charAt(0) == '/' || expr.charAt(0) == '*')) {
            return false;
        }
        return true;
    }

    public class MissingNumberException extends Exception {
        public MissingNumberException(String message) {
            super(message);
        }

        public MissingNumberException(String message, Throwable innerExc) {
            super(message, innerExc);
        }
    }
}
