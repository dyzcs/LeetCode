package com.dyzcs.lc;

/**
 * Created by Administrator on 2020/11/5.
 */
public class LeetCode_704 {
    public static void main(String[] args) {

    }
}

class SolutionLC704 {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
