package com.dyzcs.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2020/10/17.
 *
 * @see <a href="https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/">剑指 Offer 32 - I. 从上到下打印二叉树</a>
 */
public class Offer_32_1 {
    public static void main(String[] args) {
        SolutionOffer32_1.TreeNode n1 = new SolutionOffer32_1.TreeNode(3);
        SolutionOffer32_1.TreeNode n2 = new SolutionOffer32_1.TreeNode(9);
        SolutionOffer32_1.TreeNode n3 = new SolutionOffer32_1.TreeNode(20);
        SolutionOffer32_1.TreeNode n4 = new SolutionOffer32_1.TreeNode(15);
        SolutionOffer32_1.TreeNode n5 = new SolutionOffer32_1.TreeNode(37);

        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;

        SolutionOffer32_1 solutionOffer32_1 = new SolutionOffer32_1();
        int[] ints = solutionOffer32_1.levelOrder(n1);
        System.out.println(Arrays.toString(ints));
    }
}

class SolutionOffer32_1 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int[] levelOrder(TreeNode root) {
        if (root == null) return new int[0];
        Queue<TreeNode> queue = new LinkedList<TreeNode>() {{
            add(root);
        }};
        ArrayList<Integer> ans = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            ans.add(node.val);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        int[] arr = new int[ans.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }
}
