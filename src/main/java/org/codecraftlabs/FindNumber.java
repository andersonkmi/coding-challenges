package org.codecraftlabs;

import java.util.List;

public class FindNumber {
    public String findNumber(List<Integer> arr, int k) {
        if(arr.contains(k)) {
            return "YES";
        }
        return "NO";
    }
}
