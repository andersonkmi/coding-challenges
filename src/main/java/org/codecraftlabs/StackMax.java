package org.codecraftlabs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class StackMax {
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
        return sortedValues.get(0);
    }
}
