package com.deng.lc;

/**
 * Created by Administrator on 2020/10/24.
 *
 * @see <a href="https://leetcode-cn.com/problems/video-stitching/">1024. 视频拼接</a>
 */
public class LeetCode_1024 {
    public static void main(String[] args) {
        int[][] arr1 = {{0, 2}, {4, 6}, {8, 10}, {1, 9}, {1, 5}, {5, 9}};
        int t1 = 10;

        int[][] arr2 = {{0, 1}, {1, 2}};
        int t2 = 5;

        int[][] arr3 = {{0, 1}, {6, 8}, {0, 2}, {5, 6}, {0, 4}, {0, 3},
                {6, 7}, {1, 3}, {4, 7}, {1, 4}, {2, 5}, {2, 6}};
        int t3 = 10;

        int[][] arr4 = {{0, 4}, {2, 8}};
        int t4 = 5;

        SolutionLC1024 solutionLC1024 = new SolutionLC1024();
        System.out.println(solutionLC1024.videoStitching1(arr1, t1));
        System.out.println(solutionLC1024.videoStitching1(arr2, t2));
        System.out.println(solutionLC1024.videoStitching1(arr3, t3));
        System.out.println(solutionLC1024.videoStitching1(arr4, t4));
    }
}

class SolutionLC1024 {
    // 动态规划
    public int videoStitching1(int[][] clips, int T) {
        return 0;
    }
}