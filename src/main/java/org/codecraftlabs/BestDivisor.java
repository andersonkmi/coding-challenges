package org.codecraftlabs;

import java.util.ArrayList;
import java.util.List;

public class BestDivisor {
    public String getNumber(long value) {
        List<String> divisors = getAllDivisors(value);
        String bestDivisor = getBestDivisor(divisors);
        return bestDivisor;
    }

    private List<String> getAllDivisors(long value) {
        List<String> divisors = new ArrayList<>();

        for (long start = value; start > 0; start--) {
            if (value % start == 0) {
                System.out.println("Adding: " + start);
                divisors.add(String.valueOf(start));
            }
        }
        return divisors;
    }

    private String getBestDivisor(List<String> values) {
        String bestDivisor = "";
        long currentMaxValue = 0;

        for (String value : values) {
            char[] digits = value.toCharArray();
            long sum = 0;
            for (int index = 0; index < digits.length; index++) {
                sum += Long.parseLong(String.valueOf(digits[index]));
            }

            if (sum >= currentMaxValue) {
                currentMaxValue = sum;
                bestDivisor = value;
            }
        }

        return bestDivisor;
    }
}
