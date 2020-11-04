package com.dyzcs.lcci;

/**
 * Created by Administrator on 2020/11/4.
 *
 * @see <a href="https://leetcode-cn.com/problems/compress-string-lcci/">面试题 01.06. 字符串压缩</a>
 */
public class LCCI_0106 {
    public static void main(String[] args) {
        String s1 = "aabcccccaaa";
        String s2 = "abbccd";
        SolutionLCCI0106 solutionLCCI0106 = new SolutionLCCI0106();
        System.out.println(solutionLCCI0106.compressString(s1));
        System.out.println(solutionLCCI0106.compressString(s2));
    }
}

class SolutionLCCI0106 {
    public String compressString(String S) {
        int len1 = S.length();
        StringBuilder builder = new StringBuilder();
        char[] arr = S.toCharArray();
        int idx = 0;
        while (idx < len1) {
            int count = 1;
            while (idx + 1 < len1 && arr[idx] == arr[idx + 1]) {
                count++;
                idx++;
            }
            builder.append(arr[idx]).append(count);
            idx++;
        }
        String tmp = builder.toString();
        return tmp.length() >= len1 ? S : tmp;
    }
}
