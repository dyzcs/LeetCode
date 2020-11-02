package com.dyzcs.lcof;

import java.io.BufferedInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Administrator on 2020/10/8.
 *
 * @see <a href="https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/">剑指 Offer 10- I. 斐波那契数列</a>
 */
public class Offer_10_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = scanner.nextInt();
        scanner.close();
        SolutionOffer10_1 solutionOffer10_1 = new SolutionOffer10_1();
        System.out.println(solutionOffer10_1.fib(n));
    }
}

class SolutionOffer10_1 {
    Map<Integer, Integer> map = new HashMap<>();

    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        }

        int ret = (fib(n - 1) + fib(n - 2)) % 1000000007;
        map.put(n, ret);

        return ret;
    }
}