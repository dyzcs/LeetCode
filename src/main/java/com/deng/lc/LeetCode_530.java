package com.deng.lc;

/**
 * Created by Administrator on 2020/10/12.
 *
 * @see <a href="https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/">530. 二叉搜索树的最小绝对差</a>
 */
public class LeetCode_530 {
    public static void main(String[] args) {
        SolutionLC530.TreeNode node1 = new SolutionLC530.TreeNode(1);
        SolutionLC530.TreeNode node2 = new SolutionLC530.TreeNode(3);
        SolutionLC530.TreeNode node3 = new SolutionLC530.TreeNode(2);

        node1.right = node2;
        node2.left = node3;

        SolutionLC530 solutionLC530 = new SolutionLC530();
        System.out.println(solutionLC530.getMinimumDifference(node1));
    }
}

class SolutionLC530 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int pre;
    int ans;

    public int getMinimumDifference(TreeNode root) {
        ans = Integer.MAX_VALUE;
        pre = -1;
        dfs(root);
        return ans;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        if (pre != -1) {
            ans = Math.min(ans, root.val - pre);
        }
        pre = root.val;
        dfs(root.right);
    }
}