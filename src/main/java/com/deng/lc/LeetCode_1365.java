package com.deng.lc;

import java.util.Arrays;
import java.util.Comparator;

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

    // 快速排序
    public int[] smallerNumbersThanCurrent2(int[] nums) {
        int n = nums.length;
        int[][] data = new int[n][2];
        for (int i = 0; i < n; i++) {
            data[i][0] = nums[i];
            data[i][1] = i;
        }
//        for (int[] ints : data) {
//            System.out.print(Arrays.toString(ints));
//        }
        Arrays.sort(data, Comparator.comparingInt(o -> o[0]));
//        System.out.println();
//        for (int[] ints : data) {
//            System.out.print(Arrays.toString(ints));
//        }
//        System.out.println();

        int[] ret = new int[n];
        int prev = -1;
        for (int i = 0; i < n; i++) {
            if (prev == -1 || data[i][0] != data[i - 1][0]) {
                prev = i;
            }
            ret[data[i][1]] = prev;
        }
        return ret;
    }

    // 计数排序
    public int[] smallerNumbersThanCurrent3(int[] nums) {
        int[] cnt = new int[101];
        int n = nums.length;
        for (int num : nums) {
            cnt[num]++;
        }
        for (int i = 1; i <= 100; i++) {
            cnt[i] += cnt[i - 1];
        }
        int[] ret = new int[n];
        for (int i = 0; i < n; i++) {
            ret[i] = nums[i] == 0 ? 0 : cnt[nums[i] - 1];
        }
        return ret;
    }
}