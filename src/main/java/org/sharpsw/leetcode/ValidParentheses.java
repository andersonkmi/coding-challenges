package org.sharpsw.leetcode;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String input) {
        if(input.isEmpty()) {
            return true;
        }

        Stack<String> items = new Stack<>();

        for(int index = 0; index < input.length(); index++) {
            if(input.charAt(index) == '(' || input.charAt(index) == '[' || input.charAt(index) == '{') {
                items.push(String.valueOf(input.charAt(index)));
            } else {
                if(input.charAt(index) == ')') {
                    if(!validate(items, "(")) {
                        return false;
                    }
                } else if(input.charAt(index) == ']') {
                    if(!validate(items, "[")) {
                        return false;
                    }
                } else if(input.charAt(index) == '}') {
                    if(!validate(items, "{")) {
                        return false;
                    }
                }
            }
        }

        if(items.size() == 0) {
            return true;
        }

        return false;
    }

    private boolean validate(Stack<String> items, String expectedChar) {
        if(!items.isEmpty() && items.peek().equals(expectedChar)) {
            items.pop();
            return true;
        } else {
            return false;
        }
    }
}
