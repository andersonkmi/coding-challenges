package org.sharpsw.codility;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SmallestPositiveInteger {
    public int solution(int[] A) {
        Set<Integer> numbers = new TreeSet<>();
        for(int number:A) {
            numbers.add(number);
        }

        Set<Integer> filtered = numbers.stream().filter(item -> item > 0).collect(Collectors.toSet());
        int verifyNumber = 1;
        boolean found = false;

        while(!found) {
            if(!filtered.contains(verifyNumber)) {
                found = true;
            } else {
                verifyNumber++;
            }
        }
        return verifyNumber;
    }
}
