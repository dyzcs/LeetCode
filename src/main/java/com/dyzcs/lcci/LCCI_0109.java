package com.dyzcs.lcci;

/**
 * Created by Administrator on 2020/11/4.
 *
 * @see <a href="https://leetcode-cn.com/problems/string-rotation-lcci/">面试题 01.09. 字符串轮转</a>
 */
public class LCCI_0109 {
    public static void main(String[] args) {
        SolutionLCCI0109 solutionLCCI0109 = new SolutionLCCI0109();
        String s11 = "waterbottle", s21 = "erbottlewat";
        String s12 = "aa", s22 = "aba";
        System.out.println(solutionLCCI0109.isFlipedString(s11, s21));
        System.out.println(solutionLCCI0109.isFlipedString(s12, s22));
    }
}

class SolutionLCCI0109 {
    public boolean isFlipedString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        return (s2 + s2).contains(s1);
    }
}
