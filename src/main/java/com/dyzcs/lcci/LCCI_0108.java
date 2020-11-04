package com.dyzcs.lcci;

import java.util.Arrays;

/**
 * Created by Administrator on 2020/11/4.
 *
 * @see <a href="https://leetcode-cn.com/problems/zero-matrix-lcci/">面试题 01.08. 零矩阵</a>
 */
public class LCCI_0108 {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] arr2 = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        SolutionLCCI0108 solutionLCCI0108 = new SolutionLCCI0108();
        solutionLCCI0108.setZeroes(arr1);
        for (int[] tmp : arr1) {
            System.out.println(Arrays.toString(tmp));
        }

        solutionLCCI0108.setZeroes(arr2);
        for (int[] tmp : arr2) {
            System.out.println(Arrays.toString(tmp));
        }
    }
}

class SolutionLCCI0108 {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.arraycopy(matrix[i], 0, arr[i], 0, n);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    setZero(arr, i, j);
                }
            }
        }

        for (int i = 0; i < m; i++) {
            System.arraycopy(arr[i], 0, matrix[i], 0, n);
        }
    }

    private void setZero(int[][] arr, int row, int column) {
        for (int i = 0; i < arr.length; i++) {
            if (i == row) {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = 0;
                }
            }
        }

        for (int j = 0; j < arr[0].length; j++) {
            if (j == column) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i][j] = 0;
                }
            }
        }
    }
}
