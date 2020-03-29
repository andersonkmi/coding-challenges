package org.codecraftlabs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxArraySum {
    public int maxSubsetSum(int[] arr) {
        List<String> values = new ArrayList<>();
        process(arr, 0, "", values);
        values.forEach(System.out::println);
        return 0;
    }

    private void process(int[] numbers, int index, String combination, List<String> combinations) {

    }

    public Map<Integer, List<Integer>> createMap(int length) {
        Map<Integer, List<Integer>> results = new HashMap<>();
        for (int val = 0; val < length; val++) {
            List<Integer> values = listItems(val, length);
            if (!values.isEmpty()) {
                results.put(val, listItems(val, length));
            }
        }
        return results;
    }

    private List<Integer> listItems(int currentValue, int length) {
        List<Integer> validPositions = new ArrayList<>();
        int position = currentValue;
        while (position < length) {
            if (position - currentValue >= 2) {
                validPositions.add(position);
            }
            position++;
        }
        return validPositions;
    }

    public static void main(String[] args) {
        MaxArraySum service = new MaxArraySum();
        int length = 6;
        Map<Integer, List<Integer>> items = service.createMap(length);
        System.out.println(items);
    }
}
