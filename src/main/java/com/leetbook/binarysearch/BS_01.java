package com.leetbook.binarysearch;

/**
 * Created by Administrator on 2020/11/5.
 */
public class BS_01 {
    public static void main(String[] args) {
        SolutionBS01 solutionBS01 = new SolutionBS01();
        System.out.println(solutionBS01.mySqrt(4));
        System.out.println(solutionBS01.mySqrt(8));
    }
}

class SolutionBS01 {
    public int mySqrt(int x) {
        int left = 0, right = x, ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
