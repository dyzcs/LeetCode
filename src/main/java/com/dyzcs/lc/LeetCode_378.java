package com.dyzcs.lc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2020/11/5.
 */
public class LeetCode_378 {
    public static void main(String[] args) {
        SolutionLC378 solutionLC378 = new SolutionLC378();
        String s1 = "leetcode", s2 = "loveleetcode";
        System.out.println(solutionLC378.firstUniqChar(s1));
        System.out.println(solutionLC378.firstUniqChar(s2));
    }
}

class SolutionLC378 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return s.charAt(i);
            }
        }
        return -1;
    }
}
