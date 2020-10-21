package com.deng.lc;

/**
 * Created by Administrator on 2020/10/21.
 *
 * @see <a href="https://leetcode-cn.com/problems/long-pressed-name/">925. 长按键入</a>
 */
public class LeetCode_925 {
    public static void main(String[] args) {
        String[][] arr =
                {{"alex", "aaleex"}, {"saeed", "ssaaedd"}, {"leelee", "lleeelee"}, {"laiden", "laiden"}};
        SolutionLC925 solutionLC925 = new SolutionLC925();
        for (String[] tmp : arr) {
            boolean longPressedName = solutionLC925.isLongPressedName(tmp[0], tmp[1]);
            System.out.println(longPressedName);
        }
    }
}

class SolutionLC925 {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                return false;
            }
        }
        return i == name.length();
    }
}