package org.codecraftlabs;

public class LibraryFine {
    public int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int yearDelta = y1 - y2;
        int monthDelta = m1 - m2;
        int dayDelta = d1 - d2;

        return calculate(yearDelta, monthDelta, dayDelta);
    }

    private int calculate(int yearDelta, int monthDelta, int dayDelta) {
        if (yearDelta <= 0 && monthDelta <= 0 && dayDelta <= 0) {
            return 0;
        } else if (yearDelta == 0 && monthDelta == 0 && dayDelta >= 0) {
            return dayDelta * 15;
        } else if (yearDelta == 0 && monthDelta > 0) {
            return monthDelta * 500;
        } else if (yearDelta > 0) {
            return 10000;
        } else {
            return 0;
        }
    }
}
