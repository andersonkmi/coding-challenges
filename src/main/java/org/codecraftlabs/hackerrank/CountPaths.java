package org.codecraftlabs.hackerrank;

public class CountPaths {
    public int count(boolean[][] grid, int row, int col) {
        if (row == grid.length - 1 || col == grid[0].length - 1) {
            return 1;
        }

        if(isAtEnd(grid, row, col)) {
            return 1;
        }

        return count(grid, row + 1, col) + count(grid, row, col + 1);
    }

    private boolean isAtEnd(boolean[][] grid, int row, int col) {
        int cols = grid.length;
        int rows = grid[0].length;

        if(row == rows - 1 && col == cols - 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        CountPaths paths = new CountPaths();
        boolean[][] grid = new boolean[3][3];

        int total = paths.count(grid, 0, 0);
        System.out.println(total);
    }
}
