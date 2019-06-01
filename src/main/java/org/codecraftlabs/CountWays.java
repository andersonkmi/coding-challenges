package org.codecraftlabs;

public class CountWays {
    public int countWays(int steps, int maxsteps) {
        if(steps < 0) {
            return 0;
        } else if (steps == 0) {
            return 1;
        } else {
            int total = 0;
            for(int index = 1; index <= maxsteps; index++) {
                total += countWays(steps - index, maxsteps);
            }
            return total;
        }
    }
}
