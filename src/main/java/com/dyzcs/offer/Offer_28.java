package com.dyzcs.offer;

/**
 * Created by Administrator on 2020/10/17.
 *
 * @see <a href="https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/">剑指 Offer 28. 对称的二叉树</a>
 */
public class Offer_28 {
    public static void main(String[] args) {
        SolutionOffer28.TreeNode n1 = new SolutionOffer28.TreeNode(1);
        SolutionOffer28.TreeNode n2 = new SolutionOffer28.TreeNode(2);
        SolutionOffer28.TreeNode n3 = new SolutionOffer28.TreeNode(3);
        SolutionOffer28.TreeNode n4 = new SolutionOffer28.TreeNode(4);
        SolutionOffer28.TreeNode n5 = new SolutionOffer28.TreeNode(5);
        SolutionOffer28.TreeNode n6 = new SolutionOffer28.TreeNode(6);
        SolutionOffer28.TreeNode n7 = new SolutionOffer28.TreeNode(7);

        n1.left = n2;
        n2.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;

        SolutionOffer28 solutionOffer28 = new SolutionOffer28();
        boolean symmetric = solutionOffer28.isSymmetric(n1);
        System.out.println(symmetric);
    }
}

class SolutionOffer28 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        return root == null || recur(root.left, root.right);
    }

    private boolean recur(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null || left.val != right.val) {
            return false;
        }
        return recur(left.left, right.right) && recur(left.right, right.left);
    }
}