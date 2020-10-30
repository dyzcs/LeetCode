package com.dyzcs.lc;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2020/10/29.
 *
 * @see <a href="https://leetcode-cn.com/problems/sum-root-to-leaf-numbers/">129. 求根到叶子节点数字之和</a>
 */
public class LeetCode_129 {
    public static void main(String[] args) {
        SolutionLC129.TreeNode t1 = new SolutionLC129.TreeNode(4);
        SolutionLC129.TreeNode t2 = new SolutionLC129.TreeNode(9);
        SolutionLC129.TreeNode t3 = new SolutionLC129.TreeNode(0);
        SolutionLC129.TreeNode t4 = new SolutionLC129.TreeNode(5);
        SolutionLC129.TreeNode t5 = new SolutionLC129.TreeNode(1);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;

        SolutionLC129 solutionLC129 = new SolutionLC129();
        System.out.println(solutionLC129.sumNumbers2(t1));
    }
}

class SolutionLC129 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // 深度优先搜索
    public int sumNumbers1(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int prevSum) {
        if (root == null) {
            return 0;
        }
        int sum = prevSum * 10 + root.val;
        if (root.left == null && root.right == null) {
            return sum;
        } else {
            return dfs(root.left, sum) + dfs(root.right, sum);
        }
    }

    // 广度优先搜索
    public int sumNumbers2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        Queue<Integer> numQueue = new LinkedList<>();
        nodeQueue.offer(root);
        numQueue.offer(root.val);
        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.poll();
            Integer num = numQueue.poll();
            TreeNode left = node.left, right = node.right;
            if (left == null && right == null) {
                sum += num;
            } else {
                if (left != null) {
                    nodeQueue.offer(left);
                    numQueue.offer(num * 10 + left.val);
                }
                if (right != null) {
                    nodeQueue.offer(right);
                    numQueue.offer(num * 10 + right.val);
                }
            }
        }
        return sum;
    }
}
