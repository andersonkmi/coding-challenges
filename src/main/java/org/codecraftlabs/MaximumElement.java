package org.codecraftlabs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class MaximumElement {
    static class StackMax {
        private Stack<Long> values = new Stack<>();
        private List<Long> sortedValues = new ArrayList<>();

        public void push(long value) {
            values.push(value);
            sortedValues.add(value);
            Collections.reverse(sortedValues);
        }

        public void pop() {
            Long popValue = values.pop();
            sortedValues.remove(popValue);
        }

        public Long getMaxValue() {
            if (sortedValues.isEmpty()) {
                return 0L;
            }
            return sortedValues.get(0);
        }
    }

    private static void main(String[] args) {
        StackMax service = new StackMax();
        String[] lines = args[0].split("\\r?\\n");
        int line = 0;
        while(line < lines.length) {
            String currentLine = args[line].trim();
            if (currentLine.startsWith("1")) {
                String[] items = currentLine.split(" ");
                service.push(Long.parseLong(items[1]));
            } else if (currentLine.startsWith("2")) {
                service.pop();
            } else if (currentLine.startsWith("3")) {
                System.out.println(service.getMaxValue());
            }
            line++;
        }
    }
}
