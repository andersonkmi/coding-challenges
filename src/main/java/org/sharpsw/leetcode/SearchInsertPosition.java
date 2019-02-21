package org.sharpsw.leetcode;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0) {
            return 0;
        }

        int index = 0;
        while(index < nums.length && nums[index] < target) {
            index++;
        }
        return index;
    }
}
