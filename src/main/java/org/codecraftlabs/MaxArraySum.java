package org.codecraftlabs;

import java.util.ArrayList;
import java.util.List;

public class MaxArraySum {
    public int maxSubsetSum(int[] arr) {
        List<String> values = new ArrayList<>();
        process(arr, 0, "", values);
        values.forEach(System.out::println);
        return 0;
    }

    private void process(int[] numbers, int index, String combination, List<String> combinations) {

    }

    public static void main(String[] args) {
        MaxArraySum service = new MaxArraySum();
        int[] items = {3, 7, 4, 6, 5};
        service.maxSubsetSum(items);
    }
}
