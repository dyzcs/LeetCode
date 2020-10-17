package com.deng.offer;

/**
 * Created by Administrator on 2020/10/17.
 *
 * @see <a href="https://leetcode-cn.com/problems/shu-de-zi-jie-gou-lcof/">剑指 Offer 26. 树的子结构</a>
 */
public class Offer_26 {
    public static void main(String[] args) {
        SolutionOffer26.TreeNode n11 = new SolutionOffer26.TreeNode(1);
        SolutionOffer26.TreeNode n12 = new SolutionOffer26.TreeNode(2);
        SolutionOffer26.TreeNode n13 = new SolutionOffer26.TreeNode(3);

        n11.left = n12;
        n11.right = n13;

        SolutionOffer26.TreeNode n21 = new SolutionOffer26.TreeNode(1);
        n21.left = new SolutionOffer26.TreeNode(3);

        SolutionOffer26 solutionOffer26 = new SolutionOffer26();
        boolean subStructure = solutionOffer26.isSubStructure(n11, n21);
        System.out.println(subStructure);
    }
}

class SolutionOffer26 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A != null && B != null) && (recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
    }

    private boolean recur(TreeNode a, TreeNode b) {
        if (b == null) {
            return true;
        }
        if (a == null || a.val != b.val) {
            return false;
        }
        return recur(a.left, b.left) && recur(a.right, b.right);
    }
}