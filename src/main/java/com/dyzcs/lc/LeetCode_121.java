package com.dyzcs.lc;

/**
 * Created by Administrator on 2020/11/8.
 */
public class LeetCode_121 {
    public static void main(String[] args) {
        SolutionLC121 solutionLC121 = new SolutionLC121();
        System.out.println(solutionLC121.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(solutionLC121.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}

class SolutionLC121 {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}
