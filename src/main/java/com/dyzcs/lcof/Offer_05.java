package com.dyzcs.lcof;

/**
 * Created by Administrator on 2020/10/6.
 *
 * @see <a href="https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/">剑指 Offer 05. 替换空格</a>
 */
public class Offer_05 {
    public static void main(String[] args) {
        String str = "We are happy.";
        SolutionOffer05 solutionOffer05 = new SolutionOffer05();
        String ret = solutionOffer05.replaceSpace02(str);
        System.out.println(ret);
    }
}

class SolutionOffer05 {
    // String内置函数
    public String replaceSpace01(String s) {
        return s.replaceAll(" ", "%20");
    }

    // 字符数组
    public String replaceSpace02(String s) {
        int length = s.length();
        char[] arr = new char[length * 3];
        int size = 0;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                arr[size++] = '%';
                arr[size++] = '2';
                arr[size++] = '0';
            } else {
                arr[size++] = c;
            }
        }
        return new String(arr, 0, size);
    }
}