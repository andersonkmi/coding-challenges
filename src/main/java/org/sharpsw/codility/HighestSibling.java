package org.sharpsw.codility;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HighestSibling {
    public int solution(int N) {
        // write your code in Java SE 8
        String convertedNumber = convertNumber(N);
        List<Integer> digits = splitNumberDigits(convertedNumber);
        return recreateNumber(digits);
    }

    private String convertNumber(int number) {
        return String.valueOf(number);
    }

    private List<Integer> splitNumberDigits(String number) {
        return number.chars().mapToObj(i -> (char) i).map(item -> Integer.parseInt(String.valueOf(item))).sorted(Collections.reverseOrder()).collect(Collectors.toList());
    }

    private int recreateNumber(List<Integer> digits) {
        StringBuilder buffer = new StringBuilder();
        digits.forEach(buffer::append);
        return Integer.parseInt(buffer.toString());
    }
}
