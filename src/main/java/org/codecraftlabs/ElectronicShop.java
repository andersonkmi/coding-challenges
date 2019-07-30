package org.codecraftlabs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ElectronicShop {
    public int getMoneySpent(int[] keyboards, int[] drives, int b) {
        List<Integer> totalCombinations = new ArrayList<>();

        // Perform price combinations
        for(int i = 0; i < keyboards.length; i++) {
            for(int j = 0; j < drives.length; j++) {
                int total = keyboards[i] + drives[j];
                if (total <= b) {
                    totalCombinations.add(total);
                }
            }
        }

        // Verify if the combination list is empty
        if (totalCombinations.isEmpty()) {
            return -1;
        }

        Collections.sort(totalCombinations);
        return totalCombinations.get(totalCombinations.size() - 1);
    }
}
