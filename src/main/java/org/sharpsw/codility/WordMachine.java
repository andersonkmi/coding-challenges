package org.sharpsw.codility;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class WordMachine {
    private static final String POP = "POP";
    private static final String DUP = "DUP";
    private static final String ADD = "+";
    private static final String SUBTRACT = "-";

    public int solution(String S) {
        int result = -1;

        if(S == null || S.isEmpty()) {
            return result;
        }

        List<String> elements = splitTokens(S);
        Stack<Integer> numbers = new Stack<>();

        for(String item: elements) {
            if(isValidToken(item)) {
                if(isValidNumber(item)) {
                    numbers.push(Integer.parseInt(item));
                } else {
                    if(item.equals(POP) || item.equals(DUP)) {
                        performUnaryOperation(numbers, item);
                    } else if (item.equals(ADD) || item.equals(SUBTRACT)) {
                        if(!performArithmeticOperation(numbers, item)) {
                            return -1;
                        }
                    }
                }
            } else {
                return -1;
            }
        }

        result = numbers.pop();
        return result;
    }

    private void performUnaryOperation(Stack<Integer> numbers, String type) {
        if(type.equals(POP) && numbers.size() > 0) {
            numbers.pop();
        } else {
            Integer topMost = numbers.peek();
            numbers.push(topMost);
        }
    }

    private boolean performArithmeticOperation(Stack<Integer> numbers, String type) {
        if(numbers.size() >= 2) {
            Integer topMost = numbers.pop();
            Integer secondTopMost = numbers.pop();

            int opResult;
            if(type.equals(ADD)) {
                opResult = topMost + secondTopMost;
            } else {
                opResult = topMost - secondTopMost;
            }
            numbers.push(opResult);
            return true;
        } else {
            return false;
        }
    }

    private List<String> splitTokens(String initialInput) {
        String[] items = initialInput.split(" ");
        return Arrays.asList(items);
    }

    private boolean isValidToken(String item) {
        return isValidNumber(item) || isValidOperation(item);
    }

    private boolean isValidNumber(String item) {
        try {
            Integer.parseInt(item);
            return true;
        } catch (NumberFormatException exception) {
            return false;
        }
    }

    private boolean isValidOperation(String item) {
        if(item.equals(ADD) ||
           item.equals(SUBTRACT) ||
           item.equals(POP) ||
           item.equals(DUP)) {
            return true;
        }

        return false;
    }
}
