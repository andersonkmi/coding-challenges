package org.codecraftlabs;

import java.util.List;
import java.util.stream.Collectors;

public class PickingNumbers {
    public int pickingNumbers(List<Integer> numbers) {
        // Extract the distinct values and create the pairs
        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());

        // Iterate and create the sets
        int maxSize = 0;
        for (Integer currentValue : distinctNumbers) {
            int size = (int) numbers.stream().filter(item -> item.equals(currentValue) || item.equals(currentValue + 1)).count();
            if (size > maxSize) {
                maxSize = size;
            }
        }
        return maxSize;
    }

}
