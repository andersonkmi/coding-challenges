package org.codecraftlabs;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PickingNumbers {
    public int pickingNumbers(List<Integer> numbers) {
        // Sort the list first
        Collections.sort(numbers);

        // Extract the distinct values and create the pairs
        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());

        // Iterate and create the sets
        int maxSize = 0;
        for(int index = 0; index < distinctNumbers.size(); index++) {
            Integer currentValue = distinctNumbers.get(index);

            List<Integer> selectedValues = numbers.stream().filter(item -> item == currentValue ||
                                                                           item == (currentValue + 1)).collect(Collectors.toList());
            if (selectedValues.size() > maxSize) {
                maxSize = selectedValues.size();
            }
        }
        return maxSize;
    }
}
