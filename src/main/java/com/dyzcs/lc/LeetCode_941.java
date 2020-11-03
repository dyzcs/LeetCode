package com.dyzcs.lc;

/**
 * Created by Administrator on 2020/11/3.
 *
 * @see <a href="https://leetcode-cn.com/problems/valid-mountain-array/">941. 有效的山脉数组</a>
 */
public class LeetCode_941 {
    public static void main(String[] args) {
        SolutionLC941 solutionLC941 = new SolutionLC941();
        int[] arr1 = {2, 1};
        System.out.println(solutionLC941.validMountainArray(arr1));
        int[] arr2 = {3, 5, 5};
        System.out.println(solutionLC941.validMountainArray(arr2));
        int[] arr3 = {0, 3, 2, 1};
        System.out.println(solutionLC941.validMountainArray(arr3));
    }
}

class SolutionLC941 {
    public boolean validMountainArray(int[] A) {
        int N = A.length;
        int i = 0;

        while (i + 1 < N && A[i] < A[i + 1]) {
            i++;
        }
        if (i == 0 || i == N - 1) {
            return false;
        }
        while (i + 1 < N && A[i] > A[i + 1]) {
            i++;
        }
        return i == N - 1;
    }
}