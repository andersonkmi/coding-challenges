package org.codecraftlabs.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class MaxSubarraySum {
    public int find(int[] numbers, List<Integer> resultingArray) {
        if (numbers == null) {
            return 0;
        }

        OptionalInt currentMaxOptional = Arrays.stream(numbers).max();
        int currentMax = currentMaxOptional.isPresent() ? currentMaxOptional.getAsInt() : 0;

        if (currentMax < 0) {
            resultingArray.add(currentMax);
            return currentMax;
        }

        int maxSoFar = 0;
        int maxEndingHere = 0;
        int previousMax = 0;

        for(int num: numbers) {
            maxEndingHere += num;
            maxEndingHere = Integer.max(maxEndingHere, 0);

            if(maxEndingHere == 0) {
                resultingArray.clear();
            }

            maxSoFar = Integer.max(maxSoFar, maxEndingHere);

            if ((previousMax <= maxSoFar) || (maxEndingHere >= maxSoFar)) {
                resultingArray.add(num);
            } else {
                resultingArray.clear();
            }

            previousMax = maxSoFar;
        }

        return maxSoFar;
    }
}