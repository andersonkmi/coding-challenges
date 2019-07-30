package org.codecraftlabs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ElectronicShop {
    public int getMoneySpent(int[] keyboards, int[] drives, int b) {
        List<Integer> totalCombinations = new ArrayList<>();

        // Perform price combinations
        for (int keyboard : keyboards) {
            for (int drive : drives) {
                int total = keyboard + drive;
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
