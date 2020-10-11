package com.deng.offer;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Created by Administrator on 2020/10/11.
 *
 * @see <a href="https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/">剑指 Offer 15. 二进制中1的个数</a>
 */
public class Offer_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = scanner.nextInt();
        scanner.close();
        SolutionOffer15 solutionOffer15 = new SolutionOffer15();
        System.out.println(solutionOffer15.hammingWeight2(n));
    }
}

class SolutionOffer15 {
    // 按位计算
    public int hammingWeight1(int n) {
        int res = 0;
        while (n != 0) {
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }

    // 位运算公式，n & (n - 1) = 将 n 从最后一个 1 之后全变为 0
    public int hammingWeight2(int n) {
        int res = 0;
        while (n != 0) {
            n &= (n - 1);
            res++;
        }
        return res;
    }
}
