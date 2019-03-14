package org.codecraftlabs.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinMaxRiddle {
    public long[] riddle(long[] arr) {

        List<Long> result = new ArrayList<>();
        for(int iteration = 0; iteration < arr.length; iteration++) {
            List<long[]> items = splitArray(iteration + 1, arr);

            List<Long> minimums = new ArrayList<>();
            for(long[] item : items) {
                minimums.add(findMinimum(item));
            }
            Collections.sort(minimums);
            result.add(minimums.get(minimums.size() - 1));
        }
        return result.stream().mapToLong(l -> l).toArray();
    }

    private long findMinimum(long[] numbers) {
        List<Long> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        Collections.sort(list);
        return list.get(0);
    }

    private List<long[]> splitArray(int chunks, long[] array) {
        int iterations = array.length - chunks + 1;
        List<long[]> result = new ArrayList<>();

        int startPos = 0;
        for(int iteration = 0; iteration < iterations; iteration++) {
            int counter = 0;

            long[] elements = new long[chunks];
            int pos = startPos;
            while(counter < chunks) {
                elements[counter] = array[pos];
                counter++;
                pos++;
            }
            startPos++;
            result.add(elements);
        }
        return result;
    }
}
