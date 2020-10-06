package com.deng.offer;

/**
 * Created by Administrator on 2020/10/6.
 *
 * @see <a href="https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/">剑指 Offer 07. 重建二叉树</a>
 */
public class Offer_07 {
    public static void main(String[] args) {
        SolutionOffer07 solutionOffer07 = new SolutionOffer07();
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        SolutionOffer07.TreeNode treeNode = solutionOffer07.buildTree(preorder, inorder);
    }
}

class SolutionOffer07{
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return null;
    }
}