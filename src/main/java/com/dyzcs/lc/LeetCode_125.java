package com.dyzcs.lc;

/**
 * Created by Administrator on 2020/11/5.
 */
public class LeetCode_125 {
    public static void main(String[] args) {
        SolutionLC125 solutionLC125 = new SolutionLC125();
        System.out.println(solutionLC125.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(solutionLC125.isPalindrome("race a car"));
    }
}

class SolutionLC125 {
    public boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                builder.append(c);
            }
        }
        String str = builder.toString().toLowerCase();
        return builder.reverse().toString().toLowerCase().equals(str);
    }
}
