package com.dyzcs.lcci;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2020/11/2.
 *
 * @see <a href="https://leetcode-cn.com/problems/check-permutation-lcci/">面试题 01.02. 判定是否互为字符重排</a>
 */
public class LCCI_0102 {
    public static void main(String[] args) {
        String s11 = "abc", s21 = "bca";
        String s12 = "abc", s22 = "bad";
        String s13 = "abcs", s23 = "csba";

        SolutionLCCI_0102 solutionLCCI_0102 = new SolutionLCCI_0102();
        System.out.println(solutionLCCI_0102.CheckPermutation1(s11, s21));
        System.out.println(solutionLCCI_0102.CheckPermutation2(s12, s22));
        System.out.println(solutionLCCI_0102.CheckPermutation2(s13, s23));
    }
}

class SolutionLCCI_0102 {
    // 使用set
    public boolean CheckPermutation1(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int size = s1.length();
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for (int i = 0; i < size; i++) {
            set1.add(s1.charAt(i));
            set2.add(s2.charAt(i));
        }
        return set1.equals(set2);
    }

    // 使用set
    public boolean CheckPermutation2(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public boolean CheckPermutation3(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int size = s1.length();
        int[] arr = new int[128];
        for (int i = 0; i < size; i++) {
            arr[s1.charAt(i) - '0']++;
            arr[s2.charAt(i) - '0']--;
        }
        for (int num : arr) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
}
