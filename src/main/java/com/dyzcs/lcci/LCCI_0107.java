package com.dyzcs.lcci;

import java.util.Arrays;

/**
 * Created by Administrator on 2020/11/4.
 */
public class LCCI_0107 {
    public static void main(String[] args) {
        SolutionLCCI0107 solutionLCCI0107 = new SolutionLCCI0107();
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr2 = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        solutionLCCI0107.rotate(arr1);
        for (int[] tmp : arr1) {
            System.out.println(Arrays.toString(tmp));
        }

        solutionLCCI0107.rotate(arr2);
        for (int[] tmp : arr2) {
            System.out.println(Arrays.toString(tmp));
        }
    }
}

class SolutionLCCI0107 {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        // 1.以对角线(左上-右下)为轴进行旋转
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        // 2.每一行按照中心点进行旋转
        int mid = len >> 1;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < mid; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][len - j - 1];
                matrix[i][len - j - 1] = tmp;
            }
        }
    }
}