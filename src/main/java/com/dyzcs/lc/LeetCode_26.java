package com.dyzcs.lc;

import java.util.Arrays;

/**
 * Created by Administrator on 2020/11/5.
 */
public class LeetCode_26 {
    public static void main(String[] args) {
        SolutionLC26 solutionLC26 = new SolutionLC26();
        System.out.println(solutionLC26.removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(solutionLC26.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}

class SolutionLC26 {
    // 双指针原地删除排序数组中的重复元素
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}