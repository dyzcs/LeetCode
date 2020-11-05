package com.leetbook.binarysearch;

/**
 * Created by Administrator on 2020/11/5.
 */
public class BS_03 {
    public static void main(String[] args) {
        SolutionBS03 solutionBS03 = new SolutionBS03();
        int[] nums = {4,5,6,7,0,1,2};
        int target1 = 0;
        int target2 = 3;
        System.out.println(solutionBS03.search(nums, target1));
        System.out.println(solutionBS03.search(nums, target2));
    }
}

class SolutionBS03 {
    public int search(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) {
            return -1;
        }
        if (n == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[0] <= nums[mid]) {
                if (nums[0] <= target && target <= nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[n - 1]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}