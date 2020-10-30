package com.dyzcs.offer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2020/10/10.
 *
 * @see <a href="https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/">剑指 Offer 13. 机器人的运动范围</a>
 */
public class Offer_13 {
    public static void main(String[] args) {
        int m = 2, n = 3, k = 1;
        SolutionOffer13 solutionOffer13 = new SolutionOffer13();
        System.out.println(solutionOffer13.movingCount(m, n, k));
    }
}

class SolutionOffer13 {
    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        int res = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 0, 0});
        while (queue.size() > 0) {
            int[] x = queue.poll();
            int i = x[0], j = x[1], si = x[2], sj = x[3];
            if (i < 0 || i >= m || j < 0 || j >= n || k < si + sj || visited[i][j]) {
                continue;
            }
            visited[i][j] = true;
            res++;
            queue.add(new int[]{i + 1, j, (i + 1) % 10 != 0 ? si + 1 : si - 8, sj});
            queue.add(new int[]{i, j + 1, si, (j + 1) % 10 != 0 ? sj + 1 : sj - 8});
        }
        return res;
    }
}