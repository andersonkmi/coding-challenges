package org.codecraftlabs;

import java.util.ArrayList;
import java.util.List;

public class TwoCharacters {
    public int alternate(String s) {
        List<char[]> pairs = createPairs(s);
        return extractAndMeasure(s, pairs);
    }

    private List<char[]> createPairs(String value) {
        int[] count = new int[256];

        // Get the distinct chars
        for (int position = 0; position < value.length(); position++) {
            count[(int) value.charAt(position)]++;
        }

        List<Character> distinctChars = new ArrayList<>();
        for (int index = 0; index < 256; index++) {
            if (count[index] >= 1) {
                char character = (char) index;
                distinctChars.add(character);
            }
        }

        // Create pairs with the distinct chars
        List<char[]> pairs = new ArrayList<>();
        for (int i = 0; i < distinctChars.size() - 1; i++) {
            for (int j = i + 1; j < distinctChars.size(); j++) {
                char[] pair = {distinctChars.get(i), distinctChars.get(j)};
                pairs.add(pair);
            }
        }
        return pairs;
    }

    private int extractAndMeasure(String value, List<char[]> pairs) {
        int maxSize = 0;
        for (char[] item : pairs) {
            StringBuilder buffer = new StringBuilder();
            for (int index = 0; index < value.length(); index++) {
                if (value.charAt(index) == item[0] || value.charAt(index) == item[1]) {
                    buffer.append(value.charAt(index));
                }
            }

            // Validates the resulting string
            String result = buffer.toString();
            if (isAlternate(result)) {
                int currentSize = buffer.toString().length();
                if (currentSize > maxSize) {
                    maxSize = currentSize;
                }
            }
        }
        return maxSize;
    }

    private boolean isAlternate(String value) {
        for (int i = 0; i < value.length() - 2; i++) {
            if (value.charAt(i) != value.charAt(i + 2))
            {
                return false;
            }
        }

        return true;
    }
}
