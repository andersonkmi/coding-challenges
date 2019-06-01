package org.codecraftlabs;

public class ApplesAndOranges {
    public int[] countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        calculateLandingDistance(a, apples);
        calculateLandingDistance(b, oranges);

        int totalApples = calculateFruitsInsideHouseBoundaries(s, t, apples);
        int totalOranges = calculateFruitsInsideHouseBoundaries(s, t, oranges);

        return new int[]{totalApples, totalOranges};
    }

    private void calculateLandingDistance(int treeLocation, int[] fruitLandingLocation) {
        for(int index = 0; index < fruitLandingLocation.length; index++) {
            fruitLandingLocation[index] += treeLocation;
        }
    }

    private int calculateFruitsInsideHouseBoundaries(int start, int end, int[] fruits) {
        int total = 0;
        for (int fruit : fruits) {
            if (fruit >= start && fruit <= end) {
                total++;
            }
        }
        return total;
    }
}
