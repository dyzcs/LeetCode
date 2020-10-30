package com.dyzcs.offer;

/**
 * Created by Administrator on 2020/10/17.
 *
 * @see <a href="https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/">剑指 Offer 27. 二叉树的镜像</a>
 */
public class Offer_27 {
    public static void main(String[] args) {
        SolutionOffer27.TreeNode node1 = new SolutionOffer27.TreeNode(4);
        SolutionOffer27.TreeNode node2 = new SolutionOffer27.TreeNode(2);
        SolutionOffer27.TreeNode node3 = new SolutionOffer27.TreeNode(7);
        SolutionOffer27.TreeNode node4 = new SolutionOffer27.TreeNode(1);
        SolutionOffer27.TreeNode node5 = new SolutionOffer27.TreeNode(3);
        SolutionOffer27.TreeNode node6 = new SolutionOffer27.TreeNode(6);
        SolutionOffer27.TreeNode node7 = new SolutionOffer27.TreeNode(9);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        SolutionOffer27 solutionOffer27 = new SolutionOffer27();
        SolutionOffer27.TreeNode treeNode = solutionOffer27.mirrorTree(node1);
        System.out.println(treeNode);
    }
}

class SolutionOffer27 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "{" + val + ", left=" + left + ", right=" + right + '}';
        }
    }

    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode tmp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(tmp);
        return root;
    }
}