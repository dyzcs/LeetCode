package com.dyzcs.lcci;

/**
 * Created by Administrator on 2020/11/3.
 *
 * @see <a href="https://leetcode-cn.com/problems/palindrome-permutation-lcci/">面试题 01.04. 回文排列</a>
 */
public class LCCI_0104 {
    public static void main(String[] args) {
        String s = "tactcoa";
        SolutionLCCI0104 solutionLCCI0104 = new SolutionLCCI0104();
        System.out.println(solutionLCCI0104.canPermutePalindrome1(s));
    }
}

class SolutionLCCI0104 {
    public boolean canPermutePalindrome1(String s) {
        int[] arr = new int[128];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                count++;
            }
            if (!(count == 0 || count == 1)) {
                return false;
            }
        }
        return true;
    }
}
