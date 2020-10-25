package com.deng.lc;

/**
 * Created by Administrator on 2020/10/25.
 *
 * @see <a href="https://leetcode-cn.com/problems/longest-mountain-in-array/">845. 数组中的最长山脉</a>
 */
public class LeetCode_845 {
    public static void main(String[] args) {
        int[] arr1 = {2,1,4,7,3,2,5};
        int[] arr2 = {2,2,2};

        SolutionLC845 solutionLC845 = new SolutionLC845();
        System.out.println(solutionLC845.longestMountain(arr1));
        System.out.println(solutionLC845.longestMountain(arr2));
    }
}

class SolutionLC845 {
    public int longestMountain(int[] A) {
        return 0;
    }
}