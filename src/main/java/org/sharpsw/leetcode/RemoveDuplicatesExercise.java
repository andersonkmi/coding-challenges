package org.sharpsw.leetcode;

/**
 * Description:
 * Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveDuplicatesExercise {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }

        int position = 1;
        int previous = nums[0];
        int currentLength = nums.length;

        while(position < currentLength) {
            if(nums[position] == previous) {
                // decrease length
                currentLength--;

                // swap elements
                moveElements(nums, position, currentLength);
            } else {
                previous = nums[position];
                position++;
            }
        }
        return currentLength;
    }

    private void moveElements(int[] nums, int start, int length) {
        int position = start;
        while(position < length) {
            nums[position] = nums[position + 1];
            position++;
        }
    }
}
