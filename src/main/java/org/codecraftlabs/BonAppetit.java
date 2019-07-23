package org.codecraftlabs;

import java.util.List;
import java.util.stream.Collectors;

public class BonAppetit {
    public void bonAppetit(List<Integer> bill, int k, int b) {
        Integer notShared = bill.get(k);
        int shared = calculateShare(bill, notShared);
        if (b > shared) {
            System.out.println(b - shared);
        } else {
            System.out.println("Bon Appetit");
        }
    }

    private Integer calculateShare(List<Integer> bill, Integer notShared) {
        int total = bill.stream().collect(Collectors.summingInt(Integer::intValue));
        total = total - notShared;
        return total / 2;
    }
}
