package org.sharpsw.leetcode;

public class LengthLastWord {
    public int lengthOfLastWord(String s) {
        if(s == null) {
            throw new IllegalArgumentException("Input argument cannot be null");
        }

        String[] words = s.split("\\s+");
        if(words.length > 0) {
            return words[words.length - 1].length();
        }
        return 0;
    }
}
