package com.dyzcs.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Administrator on 2020/10/17.
 *
 * @see <a href="https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/">剑指 Offer 32 - III. 从上到下打印二叉树 III</a>
 */
public class Offer_32_3 {
    public static void main(String[] args) {
        SolutionOffer32_3.TreeNode n1 = new SolutionOffer32_3.TreeNode(3);
        SolutionOffer32_3.TreeNode n2 = new SolutionOffer32_3.TreeNode(9);
        SolutionOffer32_3.TreeNode n3 = new SolutionOffer32_3.TreeNode(20);
        SolutionOffer32_3.TreeNode n4 = new SolutionOffer32_3.TreeNode(15);
        SolutionOffer32_3.TreeNode n5 = new SolutionOffer32_3.TreeNode(37);

        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;

        SolutionOffer32_3 solutionOffer32_3 = new SolutionOffer32_3();
        List<List<Integer>> lists = solutionOffer32_3.levelOrder(n1);
        for (List<Integer> list : lists) {
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

class SolutionOffer32_3 {
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
        if(root != null) queue.add(root);
        while(!queue.isEmpty()) {
            LinkedList<Integer> tmp = new LinkedList<>();
            for(int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                if(res.size() % 2 == 0) tmp.addLast(node.val); // 偶数层 -> 队列头部
                else tmp.addFirst(node.val); // 奇数层 -> 队列尾部
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            res.add(tmp);
        }
        return res;
    }
}