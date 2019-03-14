package org.codecraftlabs.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class MinMaxRiddle {
    public long[] riddle(long[] arr) {
        splitArray(1, arr);
        return null;
    }

    private List<long[]> splitArray(int chunks, long[] array) {
        int iterations = array.length - chunks + 1;
        List<long[]> result = new ArrayList<>();

        for(int iteration = 0; iteration < iterations; iteration++) {
            int startPos = 0;
            int counter = 0;

            long[] elements = new long[chunks];
            for(int pos = startPos; pos < chunks; pos++) {
                elements[counter] = array[pos];
                counter++;
            }
            startPos++;
            result.add(elements);
        }
        return result;
    }

    public static void main(String[] args) {
        MinMaxRiddle service = new MinMaxRiddle();
        long[] elements = {1, 2, 3, 4};
        long[] res = service.riddle(elements);
    }
}
