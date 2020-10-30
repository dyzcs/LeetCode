package com.dyzcs.offer;

/**
 * Created by Administrator on 2020/10/17.
 *
 * @see <a href="https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/">剑指 Offer 25. 合并两个排序的链表</a>
 */
public class Offer_25 {
    public static void main(String[] args) {
        SolutionOffer25 solutionOffer25 = new SolutionOffer25();
        SolutionOffer25.ListNode l1 = new SolutionOffer25.ListNode(1);
        SolutionOffer25.ListNode node2 = new SolutionOffer25.ListNode(2);
        SolutionOffer25.ListNode node3 = new SolutionOffer25.ListNode(4);

        l1.next = node2;
        node2.next = node3;

        SolutionOffer25.ListNode l2 = new SolutionOffer25.ListNode(1);
        SolutionOffer25.ListNode node4 = new SolutionOffer25.ListNode(2);
        SolutionOffer25.ListNode node5 = new SolutionOffer25.ListNode(4);

        l2.next = node4;
        node4.next = node5;
        SolutionOffer25.ListNode listNode = solutionOffer25.mergeTwoLists(l1, l2);

        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }
}

class SolutionOffer25 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dum = new ListNode(0), cur = dum;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 != null ? l1 : l2;
        return dum.next;
    }
}