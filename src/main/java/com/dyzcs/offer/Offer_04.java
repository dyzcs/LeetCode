package com.dyzcs.offer;

/**
 * Created by Administrator on 2020/10/6.
 *
 * @see <a href="https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/">剑指 Offer 04. 二维数组中的查找</a>
 */
public class Offer_04 {
    public static void main(String[] args) {
        int[][] arr = {{1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        SolutionOffer04 solutionOffer04 = new SolutionOffer04();
        boolean flag1 = solutionOffer04.findNumberIn2DArray(arr, 5);
        System.out.println(flag1);
        boolean flag2 = solutionOffer04.findNumberIn2DArray(arr, 20);
        System.out.println(flag2);
    }
}

class SolutionOffer04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0;
        int col = cols - 1;
        while (row < rows && col >= 0) {
            if (target == matrix[row][col]) {
                return true;
            } else if (target < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
