package org.codecraftlabs.hackerrank;


import java.util.Arrays;

public class MinAbsDifference {
    public int minimumAbsoluteDifference(int[] arr) {
        Arrays.sort(arr);
        int minimumAbsDiff = Integer.MAX_VALUE;
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            if (Math.abs(arr[i] - arr[i + 1]) < minimumAbsDiff) {
                minimumAbsDiff = Math.abs(arr[i] - arr[i + 1]);
            }

        }
        return minimumAbsDiff;
    }
}
