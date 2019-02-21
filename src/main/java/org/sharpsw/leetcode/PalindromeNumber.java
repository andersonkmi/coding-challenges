package org.sharpsw.leetcode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }

        StringBuilder buffer = new StringBuilder();
        String convertedNumber = convertToString(x);
        for(int index = convertedNumber.length() - 1; index >= 0; index--) {
            buffer.append(convertedNumber.charAt(index));
        }

        long reverted = Long.valueOf(buffer.toString());
        return x == reverted;
    }

    private String convertToString(int number) {
        return Integer.toString(number);
    }
}
