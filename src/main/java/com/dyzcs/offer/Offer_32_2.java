package com.dyzcs.offer;

import java.util.*;

/**
 * Created by Administrator on 2020/10/17.
 *
 * @see <a href="https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/">剑指 Offer 32 - II. 从上到下打印二叉树 II</a>
 */
public class Offer_32_2 {
    public static void main(String[] args) {
        SolutionOffer32_2.TreeNode n1 = new SolutionOffer32_2.TreeNode(3);
        SolutionOffer32_2.TreeNode n2 = new SolutionOffer32_2.TreeNode(9);
        SolutionOffer32_2.TreeNode n3 = new SolutionOffer32_2.TreeNode(20);
        SolutionOffer32_2.TreeNode n4 = new SolutionOffer32_2.TreeNode(15);
        SolutionOffer32_2.TreeNode n5 = new SolutionOffer32_2.TreeNode(37);

        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;

        SolutionOffer32_2 solutionOffer32_2 = new SolutionOffer32_2();
        List<List<Integer>> lists = solutionOffer32_2.levelOrder(n1);
        for (List<Integer> list : lists) {
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}


class SolutionOffer32_2 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root != null) queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            res.add(tmp);
        }
        return res;
    }
}