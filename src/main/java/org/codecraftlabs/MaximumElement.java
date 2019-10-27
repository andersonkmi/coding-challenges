package org.codecraftlabs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class MaximumElement {
    public void solution(String[] args) {
        List<Long> sortedNumbers = new ArrayList<>();
        Stack<Long> numbers = new Stack<>();

        String[] lines = args[0].split("\\r?\\n");
        int line = 0;
        while(line < lines.length) {
            String currentLine = args[line].trim();
            if (currentLine.startsWith("1")) {
                String[] items = currentLine.split(" ");
                numbers.push(Long.parseLong(items[1]));
                sortedNumbers.add(Long.parseLong(items[1]));
                Collections.sort(sortedNumbers);
            } else if (currentLine.startsWith("2")) {
                Long lastNumber = numbers.peek();
                sortedNumbers.remove(lastNumber);
                Collections.sort(sortedNumbers);
                numbers.pop();
            } else if (currentLine.startsWith("3")) {
                Collections.reverse(sortedNumbers);
                System.out.println(sortedNumbers.get(0));
            }
            line++;
        }
    }
}
