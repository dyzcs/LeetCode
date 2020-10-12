package com.deng.offer;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Created by Administrator on 2020/10/12.
 *
 * @see <a href="https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/">剑指 Offer 17. 打印从1到最大的n位数</a>
 */
public class Offer_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = scanner.nextInt();
        scanner.close();
        SolutionOffer17 solutionOffer17 = new SolutionOffer17();
        int[] ints = solutionOffer17.printNumbers2(n);
        for (int num : ints) {
            System.out.println(num);
        }
    }
}

class SolutionOffer17 {
    public int[] printNumbers1(int n) {
        int[] arr = new int[(int) Math.pow(10, n) - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    int[] res;
    int nine = 0, count = 0, start, n;
    char[] num, loop = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public int[] printNumbers2(int n) {
        this.n = n;
        res = new int[(int) Math.pow(10, n) - 1];
        num = new char[n];
        start = n - 1;
        dfs(0);
        return res;
    }

    void dfs(int x) {
        if (x == n) {
            String s = String.valueOf(num).substring(start);
            if (!s.equals("0")) res[count++] = Integer.parseInt(s);
            if (n - start == nine) start--;
            return;
        }
        for (char i : loop) {
            if (i == '9') nine++;
            num[x] = i;
            dfs(x + 1);
        }
        nine--;
    }
}
