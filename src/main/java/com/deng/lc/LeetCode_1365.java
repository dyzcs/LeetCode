package com.deng.lc;

import java.util.Arrays;

/**
 * Created by Administrator on 2020/10/26.
 *
 * @see <a href="https://leetcode-cn.com/problems/how-many-numbers-are-smaller-than-the-current-number/">1365. 有多少小于当前数字的数字</a>
 */
public class LeetCode_1365 {
    public static void main(String[] args) {
        int[] arr1 = {8, 1, 2, 2, 3};
        int[] arr2 = {6, 5, 4, 8};
        int[] arr3 = {7, 7, 7, 7};

        SolutionLC1365 solutionLC1365 = new SolutionLC1365();
        int[] rets1 = solutionLC1365.smallerNumbersThanCurrent1(arr1);
        System.out.println(Arrays.toString(rets1));
        int[] rets2 = solutionLC1365.smallerNumbersThanCurrent2(arr2);
        System.out.println(Arrays.toString(rets2));
        int[] rets3 = solutionLC1365.smallerNumbersThanCurrent3(arr3);
        System.out.println(Arrays.toString(rets3));
    }
}

class SolutionLC1365 {
    // 暴力
    public int[] smallerNumbersThanCurrent1(int[] nums) {
        int n = nums.length;
        int[] ret = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int num : nums) {
                if (num < nums[i]) {
                    cnt++;
                }
            }
            ret[i] = cnt;
        }
        return ret;
    }

    public int[] smallerNumbersThanCurrent2(int[] nums) {
        return null;
    }

    public int[] smallerNumbersThanCurrent3(int[] nums) {
        return null;
    }
}