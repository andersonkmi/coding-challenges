package org.codecraftlabs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DivisibleSumPairs {
    public int divisibleSumPairs(int n, int k, int[] ar) {
        List<Integer> sums = new ArrayList<>();

        for(int idx1 = 0; idx1 < n; idx1++) {
            for(int idx2 = idx1 + 1; idx2 < n; idx2++) {
                sums.add(ar[idx1] + ar[idx2]);
            }
        }

        return sums.stream().filter(p -> p % k == 0).collect(Collectors.toList()).size();
    }
}
