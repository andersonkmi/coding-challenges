package org.codecraftlabs.hackerrank;


public class MinAbsDifference {
    public int minimumAbsoluteDifference(int[] arr) {
        int minimumAbsDiff = 0;
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int difference = Math.abs(arr[i] - arr[j]);

                if (j == 1) {
                    minimumAbsDiff = difference;
                } else if (difference < minimumAbsDiff) {
                    minimumAbsDiff = difference;
                }
            }
        }
        return minimumAbsDiff;
    }
}
