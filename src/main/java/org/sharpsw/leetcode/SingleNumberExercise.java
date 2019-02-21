package org.sharpsw.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberExercise {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for(Integer num: nums) {
            if(numbers.containsKey(num)) {
                numbers.put(num, numbers.get(num) + 1);
            } else {
                numbers.put(num, 1);
            }
        }
        return numbers.entrySet().stream().filter(p -> p.getValue() == 1).findFirst().get().getKey();
    }
}
