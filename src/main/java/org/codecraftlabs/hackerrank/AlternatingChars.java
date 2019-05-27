package org.codecraftlabs.hackerrank;

public class AlternatingChars {
    public int alternatingCharacters(String input) {
        int numDeletes = 0;
        char current = '-';

        for (int index = 0; index < input.length(); index++) {
            char position = input.charAt(index);
            if (position == current) {
                numDeletes++;
            }

            current = position;
        }

        return numDeletes;
    }
}
