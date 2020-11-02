package com.dyzcs.lcci;

/**
 * Created by Administrator on 2020/11/2.
 *
 * @see <a href="https://leetcode-cn.com/problems/string-to-url-lcci/">面试题 01.03. URL化</a>
 */
public class LCCI_0103 {
    public static void main(String[] args) {
        String s1 = "Mr John Smith    ";
        int l1 = 13;
        String s2 = "               ";
        int l2 = 5;

        SolutionLCCI0103 solutionLCCI0103 = new SolutionLCCI0103();
        System.out.println(solutionLCCI0103.replaceSpaces1(s1, l1));
        System.out.println(solutionLCCI0103.replaceSpaces2(s2, l2));
    }
}

class SolutionLCCI0103 {
    // java字符串
    public String replaceSpaces1(String S, int length) {
        return S.substring(0, length).replaceAll(" ", "%20");
    }

    // 字符数组
    public String replaceSpaces2(String S, int length) {
        char[] ch = new char[length * 3];
        int index = 0;
        for (int i = 0; i < length; i++) {
            char c = S.charAt(i);
            if (c == ' ') {
                ch[index++] = '%';
                ch[index++] = '2';
                ch[index++] = '0';
            } else {
                ch[index] = c;
                index++;
            }
        }
        return new String(ch, 0, index);
    }

    // 字符数组
    public String replaceSpaces3(String S, int length) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char ch = S.charAt(i);
            if (ch == ' ') {
                builder.append("%20");
                continue;
            }
            builder.append(ch);
        }
        return builder.toString();
    }
}
