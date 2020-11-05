package com.dyzcs.lc;

/**
 * Created by Administrator on 2020/11/5.
 */
public class LeetCode_242 {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        SolutionLC242 solutionLC242 = new SolutionLC242();
        System.out.println(solutionLC242.isAnagram(s, t));
    }
}

class SolutionLC242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int n = s.length();
        int[] arr = new int[129];
        for (int i = 0; i < n; i++) {
            arr[s.charAt(i)]++;
        }
        for (int i = 0; i < n; i++) {
            arr[t.charAt(i)]--;
        }
        for (int num : arr) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
}
