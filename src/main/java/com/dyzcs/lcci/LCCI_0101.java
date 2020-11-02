package com.dyzcs.lcci;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2020/11/2.
 *
 * @see <a href="https://leetcode-cn.com/problems/is-unique-lcci/">面试题 01.01. 判定字符是否唯一</a>
 */
public class LCCI_0101 {
    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "abc";
        String s3 = "yuopxo";
        SolutionLCCI0101 solutionLCCI0101 = new SolutionLCCI0101();
        System.out.println(solutionLCCI0101.isUnique1(s1));
        System.out.println(solutionLCCI0101.isUnique2(s2));
        System.out.println(solutionLCCI0101.isUnique3(s3));
    }
}

class SolutionLCCI0101 {
    // HashSet
    public boolean isUnique1(String astr) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < astr.length(); i++) {
            set.add(astr.charAt(i));
        }
        return set.size() == astr.length();
    }

    // 使用数组
    public boolean isUnique2(String astr) {
        int[] arr = new int[128];
        for (int i = 0; i < astr.length(); i++) {
            if (arr[astr.charAt(i)] != '0') {
                return false;
            }
            arr[astr.charAt(i)]++;
        }
        return true;
    }

    // 使用位运算
    public boolean isUnique3(String astr) {
        long bits = 0;
        int size = astr.length();
        for (int i = 0; i < size; i++) {
            int move = astr.charAt(i) - 'A';
            if ((bits & (1L << move)) != 0) {
                return false;
            } else {
                bits |= (1L << move);
            }
        }
        return true;
    }
}