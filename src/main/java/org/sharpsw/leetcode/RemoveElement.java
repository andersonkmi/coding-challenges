package org.sharpsw.leetcode;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int currentLength = nums.length;
        int index = 0;

        while(index < currentLength) {
            if(nums[index] == val) {
                swapNumbers(nums, index, currentLength);
                currentLength--;
            } else {
                index++;
            }
        }
        return currentLength;
    }

    private void swapNumbers(int[] numbers, int start, int end) {
        int position = start;
        while(position < end - 1) {
            numbers[position] = numbers[position + 1];
            position++;
        }
    }
}
