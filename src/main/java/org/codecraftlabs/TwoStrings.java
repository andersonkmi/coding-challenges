package org.codecraftlabs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TwoStrings {
    public String twoStrings(String s1, String s2) {
        Map<Character, Integer> charMap = new HashMap<>();

        for (int index = 0; index < s1.length(); index++) {
            charMap.put(s1.charAt(index), charMap.getOrDefault(s1.charAt(index), 0));
        }

        Set<Character> keys = charMap.keySet();

        for (int index = 0; index < s2.length(); index++) {
            if (keys.contains(s2.charAt(index))) {
                return "YES";
            }
        }

        return "NO";
    }
}
