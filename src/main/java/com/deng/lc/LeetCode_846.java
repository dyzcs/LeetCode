package com.deng.lc;

/**
 * Created by Administrator on 2020/10/25.
 *
 * @see <a href="https://leetcode-cn.com/problems/hand-of-straights/">846. 一手顺子</a>
 */
public class LeetCode_846 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 6, 2, 3, 4, 7, 8};
        int W1 = 4;

        int[] arr2 = {1, 2, 3, 4, 5};
        int W2 = 4;

        SolutionLC846 solutionLC846 = new SolutionLC846();
        System.out.println(solutionLC846.isNStraightHand(arr1, W1));
        System.out.println(solutionLC846.isNStraightHand(arr2, W2));
    }
}

class SolutionLC846 {
    public boolean isNStraightHand(int[] hand, int W) {
        return false;
    }
}
