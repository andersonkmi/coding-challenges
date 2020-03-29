package org.sharpsw.codility;

import java.util.ArrayList;
import java.util.List;

public class StringUtil {
    public String mkString(List<String> items, String delimiter) {
        if (items == null || items.isEmpty()) {
            return "";
        }

        if (delimiter == null) {
            return "";
        }

        StringBuilder buffer = new StringBuilder();
        items.forEach(item -> {
            buffer.append(item).append(delimiter);
        });

        String partialResult = buffer.toString();
        return removeTrailingChars(partialResult, delimiter);
    }

    public String mkString(List<String> items, String start, String delimiter, String end) {
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

    public static void main (String[] args) throws Exception {
        StringUtil util = new StringUtil();
        List<String> teste = new ArrayList<>();
        teste.add("item 1");
        teste.add("item 2");
        teste.add("item 3");
        String value = util.mkString(teste, ", ");
        System.out.println(value);

        String value2 = util.mkString(teste, "[", ", ", "]");
        System.out.println(value2);
    }
}
