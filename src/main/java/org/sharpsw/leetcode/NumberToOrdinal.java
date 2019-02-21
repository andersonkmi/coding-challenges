package org.sharpsw.leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberToOrdinal {

    public String numberToOrdinal(Integer number) {
        if(number == 0) {
            return "0";
        }

        String suffix = getOrdinalSuffix(number);
        StringBuilder buffer = new StringBuilder();
        buffer.append(number).append(suffix);
        return buffer.toString();
    }

    private String getOrdinalSuffix(Integer number) {
        if(isFinishedBetween11And19(number)) {
            return "th";
        }

        Integer digit = number % 10;
        if(digit == 1) {
            return "st";
        } else if(digit == 2) {
            return "nd";
        } else if(digit == 3) {
            return "rd";
        }
        return "th";
    }

    private boolean isFinishedBetween11And19(Integer number) {
        String expression = "1[1-9]$";
        String strNum = Integer.toString(number);
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(strNum);
        return matcher.find();
    }
}
