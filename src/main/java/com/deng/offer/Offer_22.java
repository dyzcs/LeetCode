package com.deng.offer;

/**
 * Created by Administrator on 2020/10/14.
 *
 * @see <a href="https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/">剑指 Offer 22. 链表中倒数第k个节点</a>
 */
public class Offer_22 {
    public static void main(String[] args) {
        SolutionOffer22 solutionOffer22 = new SolutionOffer22();
        SolutionOffer22.ListNode node1 = new SolutionOffer22.ListNode(1);
        SolutionOffer22.ListNode node2 = new SolutionOffer22.ListNode(2);
        SolutionOffer22.ListNode node3 = new SolutionOffer22.ListNode(3);
        SolutionOffer22.ListNode node4 = new SolutionOffer22.ListNode(4);
        SolutionOffer22.ListNode node5 = new SolutionOffer22.ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        SolutionOffer22.ListNode kthFromEnd = solutionOffer22.getKthFromEnd(node1, 2);
        System.out.println(kthFromEnd.val);
    }
}

class SolutionOffer22 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode former = head, later = head;
        for (int i = 0; i < k; i++) {
            if (former == null) {
                return null;
            }
            former = former.next;
        }
        while (former != null) {
            former = former.next;
            later = later.next;
        }
        return later;
    }
}