package com.deng.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2020/10/14.
 *
 * @see <a href="https://leetcode-cn.com/problems/find-common-characters/">1002. 查找常用字符</a>
 */
public class LeetCode_1002 {
    public static void main(String[] args) {
        String[] arr1 = {"bella", "label", "roller"};
        String[] arr2 = {"cool", "lock", "cook"};
        SolutionLC1002 solutionLC1002 = new SolutionLC1002();

        List<String> ls1 = solutionLC1002.commonChars(arr1);
        System.out.println(Arrays.toString(ls1.toArray()));

        List<String> ls2 = solutionLC1002.commonChars(arr2);
        System.out.println(Arrays.toString(ls2.toArray()));
    }
}

class SolutionLC1002 {
    public List<String> commonChars(String[] A) {
        int[] minfreq = new int[26];
        Arrays.fill(minfreq, Integer.MAX_VALUE);
        for (String word : A) {
            int[] freq = new int[26];
            int length = word.length();
            for (int i = 0; i < length; i++) {
                char ch = word.charAt(i);
                ++freq[ch - 'a'];
            }
            for (int i = 0; i < 26; i++) {
                minfreq[i] = Math.min(minfreq[i], freq[i]);
            }
        }
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minfreq[i]; j++) {
                ans.add(String.valueOf((char) (i + 'a')));
            }
        }
        return ans;
    }
}