package org.codecraftlabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClosestNumbers {
    public int[] closestNumbers(int[] arr) {
        // Step 1 - sort the incoming array
        Arrays.sort(arr);

        // Step 2 - find all the deltas for between each element
        List<Integer> deltas = new ArrayList<>();
        for (int index = 0; index < arr.length - 1; index++) {
            deltas.add(arr[index + 1] - arr[index]);
        }
        Collections.sort(deltas);
        int smallest = deltas.get(0);

        // Step 3 - find the pairs with the matching delta
        List<Integer> numbers = new ArrayList<>();
        for (int index = 0; index < arr.length - 1; index++) {
            if (arr[index + 1] - arr[index] == smallest) {
                numbers.add(arr[index]);
                numbers.add(arr[index + 1]);
            }
        }

        return numbers.stream().mapToInt(i->i).toArray();
    }
}
