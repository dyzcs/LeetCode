package com.dyzcs.offer;

import java.io.BufferedInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Administrator on 2020/10/8.
 *
 * @see <a href="https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/">剑指 Offer 10- II. 青蛙跳台阶问题</a>
 */
public class Offer_10_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = scanner.nextInt();
        scanner.close();
        SolutionOffer10_2 solutionOffer10_2 = new SolutionOffer10_2();
        System.out.println(solutionOffer10_2.numWays(n));
    }
}

class SolutionOffer10_2 {
    Map<Integer, Integer> map = new HashMap<>();

    public int numWays(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int ret = (numWays(n - 1) + numWays(n - 2)) % 1000000007;
        map.put(n, ret);
        return ret;
    }
}
