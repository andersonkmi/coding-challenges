package org.codecraftlabs;

import java.util.LinkedList;
import java.util.List;

public class SumCombinations {
    public List<String> combineSum(int[] numbers) {
        List<String> result = new LinkedList<>();
        process(numbers, 0, 0, "{", result);
        return result;
    }

    private void process(int[] numbers, int index, int sum, String output, List<String> result) {
        if (index == numbers.length) {
            result.add(output + " } = " + sum);
        } else {
            process(numbers, index + 1, sum + numbers[index], output + " " + numbers[index], result);
            process(numbers, index + 1, sum, output, result);
        }
    }
}
