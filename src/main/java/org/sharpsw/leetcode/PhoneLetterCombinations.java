package org.sharpsw.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneLetterCombinations {
    public List<String> letterCombinations(String digits) {
        Map<Integer, List<String>> numberToLetters = fillMap();
        List<List<String>> items = retrieveLetterLists(digits, numberToLetters);

        List<String> results = new ArrayList<>();
        if(!items.isEmpty()) {
            results.addAll(items.remove(0));
            for (List<String> item : items) {
                results = performCombinations(results, item);
            }
        }
        return results;
    }

    private List<List<String>> retrieveLetterLists(String digits, Map<Integer, List<String>> values) {
        List<List<String>> items = new ArrayList<>();
        int position = 0;
        while(position < digits.length()) {
            Integer number = Integer.valueOf(String.valueOf(digits.charAt(position)));
            if(number > 1 && number < 10) {
                items.add(values.get(number));
            }
            position++;
        }
        return items;
    }

    private List<String> performCombinations(List<String> set1, List<String> set2) {
        List<String> elements = new ArrayList<>();
        set1.forEach(item -> set2.stream().map(item2 -> item + item2).forEach(elements::add));
        return elements;
    }

    private Map<Integer, List<String>> fillMap() {
        Map<Integer, List<String>> numberToLetters = new HashMap<>();

        List<String> num2 = new ArrayList<>();
        num2.add("a");
        num2.add("b");
        num2.add("c");
        numberToLetters.put(2, num2);

        List<String> num3 = new ArrayList<>();
        num3.add("d");
        num3.add("e");
        num3.add("f");
        numberToLetters.put(3, num3);

        List<String> num4 = new ArrayList<>();
        num4.add("g");
        num4.add("h");
        num4.add("i");
        numberToLetters.put(4, num4);

        List<String> num5 = new ArrayList<>();
        num5.add("j");
        num5.add("k");
        num5.add("l");
        numberToLetters.put(5, num5);

        List<String> num6 = new ArrayList<>();
        num6.add("m");
        num6.add("n");
        num6.add("o");
        numberToLetters.put(6, num6);

        List<String> num7 = new ArrayList<>();
        num7.add("p");
        num7.add("q");
        num7.add("r");
        num7.add("s");
        numberToLetters.put(7, num7);

        List<String> num8 = new ArrayList<>();
        num8.add("t");
        num8.add("u");
        num8.add("v");
        numberToLetters.put(8, num8);

        List<String> num9 = new ArrayList<>();
        num9.add("w");
        num9.add("x");
        num9.add("y");
        num9.add("z");
        numberToLetters.put(9, num9);

        return numberToLetters;
    }
}
