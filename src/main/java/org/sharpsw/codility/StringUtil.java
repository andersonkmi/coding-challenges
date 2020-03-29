package org.sharpsw.codility;

import java.util.Collection;

public class StringUtil <T>{
    public String mkString(Collection<T> items, String delimiter) {
        if (items == null || items.isEmpty()) {
            return "";
        }

        if (delimiter == null) {
            return "";
        }

        StringBuilder buffer = new StringBuilder();
        items.forEach(item -> {
            buffer.append(item.toString()).append(delimiter);
        });

        String partialResult = buffer.toString();
        return removeTrailingChars(partialResult, delimiter);
    }

    public String mkString(Collection<T> items, String start, String delimiter, String end) {
        String partialResult = mkString(items, delimiter);
        return start + partialResult + end;
    }

    private String removeTrailingChars(String original, String delimiters) {
        return removeTrailingCharacters(original, delimiters.length());
    }

    private String removeTrailingCharacters(String input, int position) {
        if (position == 0) {
            return input;
        }

        String newValue = input.substring(0, input.length() - 1);
        return removeTrailingCharacters(newValue, position - 1);
    }
}
