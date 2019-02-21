package org.sharpsw.leetcode;

public class LongestSubstringExercise {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        StringBuilder buffer = new StringBuilder();

        int index = 0;
        int start = 0;
        while(index < s.length()) {
            char character = s.charAt(index);

            if(buffer.indexOf(String.valueOf(character)) != -1) {
                index = s.indexOf(String.valueOf(character), start) + 1;
                start = index;
                buffer = new StringBuilder();
            } else {
                index++;
                buffer.append(character);
                maxLength = buffer.length() > maxLength ? buffer.length() : maxLength;
            }
        }
        return maxLength;
    }
}
