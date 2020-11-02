package com.dyzcs.lcof;

/**
 * Created by Administrator on 2020/10/10.
 *
 * @see <a href="https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/">剑指 Offer 12. 矩阵中的路径</a>
 */
public class Offer_12 {
    public static void main(String[] args) {
        char[][] arr1 = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word1 = "ABCCED";
        char[][] arr2 = {{'a', 'b'}, {'c', 'd'}};
        String word2 = "abcd";

        SolutionOffer12 solutionOffer12 = new SolutionOffer12();
        System.out.println(solutionOffer12.exist(arr1, word1));
        System.out.println(solutionOffer12.exist(arr2, word2));
    }
}

class SolutionOffer12 {
    // 回溯算法
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                // 从[i, j]这个坐标开始查找
//                if (dfs(board, words, i, j, 0)) {
//                    return true;
//                }
                if (dfs2(board, words, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, char[] words, int i, int j, int index) {
        // 边界判断，如果越界直接返回false。index表示查找到字符串word的第几个字符
        // 如果这个字符不等于board[i][j]，说明验证这个做标路径是走不通的，直接返回false
        if (i >= board.length || i < 0 || j >= board[0].length || j < 0
                || board[i][j] != words[index]) {
            return false;
        }
        // 如果word的每个字符都查找完了，直接返回true
        if (index == words.length - 1) {
            return true;
        }
        // 为了防止分支污染，把board数组复制一份
        char[][] newArr = copyArray(board);
        // 把newArr[i][j]置为特殊字符，表示已经被使用过（word中不能含有'.'）
        newArr[i][j] = '.';
        // 从当前做标的上下左右四个方向查找
        return dfs(newArr, words, i + 1, j, index + 1) || dfs(newArr, words, i - 1, j, index + 1)
                || dfs(newArr, words, i, j + 1, index + 1) || dfs(newArr, words, i, j - 1, index + 1);
    }

    private char[][] copyArray(char[][] board) {
        char[][] newArr = new char[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            System.arraycopy(board[i], 0, newArr[i], 0, board[0].length);
        }
        return newArr;
    }

    // 更为高效的回溯
    boolean dfs2(char[][] board, char[] word, int i, int j, int k) {
        if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[k]) return false;
        if (k == word.length - 1) return true;
        char tmp = board[i][j];
        board[i][j] = '/';
        boolean res = dfs2(board, word, i + 1, j, k + 1) || dfs2(board, word, i - 1, j, k + 1) ||
                dfs2(board, word, i, j + 1, k + 1) || dfs2(board, word, i, j - 1, k + 1);
        // 取消了元素复制
        board[i][j] = tmp;
        return res;
    }
}
