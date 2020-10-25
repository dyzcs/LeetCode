package com.deng.lc;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Administrator on 2020/10/25.
 *
 * @see <a href="https://leetcode-cn.com/problems/hand-of-straights/">846. 一手顺子</a>
 */
public class LeetCode_846 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 6, 2, 3, 4, 7, 8};
        int W1 = 4;

        int[] arr2 = {1, 2, 3, 4, 5};
        int W2 = 4;

        SolutionLC846 solutionLC846 = new SolutionLC846();
        System.out.println(solutionLC846.isNStraightHand(arr1, W1));
        System.out.println(solutionLC846.isNStraightHand(arr2, W2));
    }
}

class SolutionLC846 {
    public boolean isNStraightHand(int[] hand, int W) {
        TreeMap<Integer, Integer> count = new TreeMap<>();
        for (int card : hand) {
            count.put(card, count.getOrDefault(card, 1) + 1);
        }
        while (count.size() > 0) {
            int first = count.firstKey();
            for (int card = first; card < first + W; card++) {
                if (!count.containsKey(card)) {
                    return false;
                }
                int c = count.get(card);
                if (c == 1) {
                    count.remove(card);
                } else {
                    count.replace(card, c - 1);
                }
            }
        }
        return true;
    }
}
