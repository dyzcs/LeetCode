package com.dyzcs.lc;

import java.util.Arrays;

/**
 * Created by Administrator on 2020/11/5.
 */
public class LeetCode_344 {
    public static void main(String[] args) {
        char[] arr1 = {'h','e','l','l','o'};
        char[] arr2 = {'H','a','n','n','a','h'};
        SolutionLC344 solutionLC344 = new SolutionLC344();
        solutionLC344.reverseString(arr1);
        System.out.println(Arrays.toString(arr1));
        solutionLC344.reverseString1(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}

class SolutionLC344 {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
    }

    public void reverseString1(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            char c = s[i];
            s[i] = s[j];
            s[j] = c;
        }
    }
}
