package org.codecraftlabs;

public class CountingValleys {
    public int countingValleys(int n, String s) {
        int level = 0;
        int valleyCounter = 0;
        int goingDown = 0;
        for (int pos = 0; pos < n; pos++) {
            if (s.charAt(pos) == 'D') {
                level--;
                if (level == -1) {
                    goingDown = 1;
                }
            } else {
                level++;
                if (level == 0 && goingDown == 1) {
                    valleyCounter++;
                    goingDown = 0;
                }
            }
        }
        return valleyCounter;
    }
}
