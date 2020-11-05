package com.leetbook.binarysearch;

/**
 * Created by Administrator on 2020/11/5.
 */
public class BS_00 {
    public static void main(String[] args) {
        SolutionBS00 solutionBS00 = new SolutionBS00();
        int[] nums1 = {-1, 0, 3, 5, 9, 12};
        int target1 = 9;
        System.out.println(solutionBS00.search(nums1, target1));
        int[] nums2 = {-1, 0, 3, 5, 9, 12};
        int target2 = 2;
        System.out.println(solutionBS00.search(nums2, target2));
        System.out.println(solutionBS00.search(new int[]{5}, 5));
    }
}

class SolutionBS00 {
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