package org.sharpsw.codility;

import java.util.HashMap;
import java.util.Map;

public class SixLeastDigitsFibonacci {
    public int solution(int N) {
        Map<Integer, Integer> valueMap = new HashMap<>();
        return extractSixLeastDigits(fibonacci(N, valueMap));
    }

    private int fibonacci(int number, Map<Integer, Integer> valueMap) {
        if(number == 0 || number == 1) {
            return number;
        } else if(valueMap.containsKey(number)) {
            return valueMap.get(number);
        } else {
            int calculatedValue = fibonacci(number - 1, valueMap) + fibonacci(number - 2, valueMap);
            valueMap.put(number, calculatedValue);
            return calculatedValue;
        }
    }

    private int extractSixLeastDigits(int value) {
        return retrieveNLeastDigits(value,6);
    }

    private int retrieveNLeastDigits(int value, int n) {
        return value % (int) Math.pow(10, n);
    }
}
