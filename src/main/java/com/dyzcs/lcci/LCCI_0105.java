package com.dyzcs.lcci;

/**
 * Created by Administrator on 2020/11/3.
 *
 * @see <a href="https://leetcode-cn.com/problems/one-away-lcci/">面试题 01.05. 一次编辑</a>
 */
public class LCCI_0105 {
    public static void main(String[] args) {
        String first1 = "pale", second1 = "ple";
        String first2 = "pales", second2 = "pal";

        SolutionLCCI0105 solutionLCCI0105 = new SolutionLCCI0105();
        System.out.println(solutionLCCI0105.oneEditAway(first1, second1));
        System.out.println(solutionLCCI0105.oneEditAway(first2, second2));
    }
}

class SolutionLCCI0105 {
    public boolean oneEditAway(String first, String second) {
        if (first == null || second == null) {
            return false;
        }
        int len1 = first.length();
        int len2 = second.length();
        if (Math.abs(len1 - len2) > 1) {
            return false;
        }
        if (len2 > len1) {
            return oneEditAway(second, first);
        }

        for (int i = 0; i < len2; i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return first.substring(i + 1).equals(second.substring(len1 == len2 ? i + 1 : i));
            }
        }
        return true;
    }
}
