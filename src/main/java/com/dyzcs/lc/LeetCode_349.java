package com.dyzcs.lc;

import java.util.Arrays;

/**
 * Created by Administrator on 2020/11/2.
 *
 * @see <a href="https://leetcode-cn.com/problems/intersection-of-two-arrays/">349. 两个数组的交集</a>
 */
public class LeetCode_349 {
    public static void main(String[] args) {
        int[] nums11 = {1, 2, 2, 1}, nums21 = {2, 2};
        int[] nums12 = {4, 9, 5}, nums22 = {9, 4, 9, 8, 4};
        SolutionLC349 solutionLC349 = new SolutionLC349();
        int[] ret1 = solutionLC349.intersection(nums11, nums21);
        System.out.println(Arrays.toString(ret1));

        int[] ret2 = solutionLC349.intersection(nums12, nums22);
        System.out.println(Arrays.toString(ret2));
    }
}

class SolutionLC349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int length1 = nums1.length, length2 = nums2.length;
        int[] intersection = new int[length1 + length2];
        int index = 0, index1 = 0, index2 = 0;
        while (index1 < length1 && index2 < length2) {
            int num1 = nums1[index1], num2 = nums2[index2];
            if (num1 == num2) {
                // 保证加入元素的唯一性
                if (index == 0 || num1 != intersection[index - 1]) {
                    intersection[index++] = num1;
                }
                index1++;
                index2++;
            } else if (num1 < num2) {
                index1++;
            } else {
                index2++;
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);
    }
}