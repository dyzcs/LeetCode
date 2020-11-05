package com.leetbook.binarysearch;

import java.util.Arrays;

/**
 * Created by Administrator on 2020/11/5.
 */
public class BS_05 {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        SolutionBS05 solutionBS05 = new SolutionBS05();
        System.out.println(Arrays.toString(solutionBS05.searchRange(nums, target)));
        System.out.println(Arrays.toString(solutionBS05.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)));
    }
}

class SolutionBS05 {
    public int[] searchRange(int[] nums, int target) {
        int[] targetRange = {-1, -1};
        int leftIdx = extremeInsertionIndex(nums, target, true);
        if (leftIdx == nums.length || nums[leftIdx] != target) {
            return targetRange;
        }
        targetRange[0] = leftIdx;
        targetRange[1] = extremeInsertionIndex(nums, target, false) - 1;

        return targetRange;
    }

    private int extremeInsertionIndex(int[] nums, int target, boolean left) {
        int low = 0, high = nums.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > target || (left && target == nums[mid])) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
