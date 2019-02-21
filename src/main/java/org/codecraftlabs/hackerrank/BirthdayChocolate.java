package org.codecraftlabs.hackerrank;

import java.util.List;

public class BirthdayChocolate {
    public int birthday(List<Integer> s, int d, int m) {
        int result = 0;
        int index = 0;

        while(index + m <= s.size()) {
            int total = 0;

            int counter = 0;
            while(counter < m) {
                int position = index + counter;
                total += s.get(position);
                counter++;
            }

            if(total == d) {
                result++;
            }
            index++;
        }
        return result;
    }
}
