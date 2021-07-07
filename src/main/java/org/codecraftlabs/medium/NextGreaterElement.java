package org.codecraftlabs.medium;

public class NextGreaterElement {
    public int[] nextLargerElement(int[] items) {
        int[] results = new int[items.length];
        for (int index = 0; index < items.length; index++) {
            int nextValue = findNextGreaterValue(items[index], index + 1, items);
            results[index] = nextValue;
        }
        return results;
    }

    private int findNextGreaterValue(int reference, int start, int[] array) {
        for (int position = start; position < array.length; position++) {
            if (array[position] > reference) {
                return array[position];
            }
        }
        return -1;
    }

    private int findValue(int reference, int[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] > reference) {
                return array[index];
            }
        }
        return -1;
    }
}
