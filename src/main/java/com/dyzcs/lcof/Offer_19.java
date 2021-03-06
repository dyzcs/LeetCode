package com.dyzcs.lcof;

/**
 * Created by Administrator on 2020/10/13.
 *
 * @see <a href="https://leetcode-cn.com/problems/zheng-ze-biao-da-shi-pi-pei-lcof/">剑指 Offer 19. 正则表达式匹配</a>
 */
public class Offer_19 {
    public static void main(String[] args) {
        String[][] arr = {{"aa", "a"}, {"aa", "a*"}, {"ab", ".*"}, {"aab", "c*a*b"}, {"mississippi", "mis*is*p*."}};
        SolutionOffer19 solutionOffer19 = new SolutionOffer19();
        for (String[] strs : arr) {
            System.out.println(solutionOffer19.isMatch(strs[0], strs[1]));
        }
    }
}

class SolutionOffer19 {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        boolean[][] f = new boolean[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                //分成空正则和非空正则两种
                if (j == 0) {
                    f[i][j] = i == 0;
                } else {
                    //非空正则分为两种情况 * 和 非*
                    if (p.charAt(j - 1) != '*') {
                        if (i > 0 && (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.')) {
                            f[i][j] = f[i - 1][j - 1];
                        }
                    } else {
                        //碰到 * 了，分为看和不看两种情况
                        //不看
                        if (j >= 2) {
                            f[i][j] |= f[i][j - 2];
                        }
                        //看
                        if (i >= 1 && j >= 2 && (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.')) {
                            f[i][j] |= f[i - 1][j];
                        }
                    }
                }
            }
        }
        return f[n][m];
    }
}