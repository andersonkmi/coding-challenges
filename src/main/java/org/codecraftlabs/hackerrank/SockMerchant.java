package org.codecraftlabs.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class SockMerchant {
    public int sockMerchant(int n, int[] ar) {
        if (n == 0) {
            return 0;
        }

        return countPairs(ar);
    }

    private int countPairs(int[] numbers) {
        int counter = 0;

        List<Integer> items = new ArrayList<>();

        for (int number : numbers) {
            int position = items.indexOf(number);
            if (position == -1) {
                items.add(number);
            } else {
                counter++;
                items.remove(position);
            }
        }

        return counter;
    }
}
