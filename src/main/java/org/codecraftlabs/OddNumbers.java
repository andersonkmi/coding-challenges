package org.codecraftlabs;

import java.util.ArrayList;
import java.util.List;

public class OddNumbers {
    public List<Integer> oddNumbers(int l, int r) {
        List<Integer> result = new ArrayList<>();
        for(int position = l; position <= r; position++) {
            if(position % 2 == 1) {
                result.add(position);
            }
        }
        return result;
    }
}
