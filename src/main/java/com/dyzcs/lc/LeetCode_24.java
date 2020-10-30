package com.dyzcs.lc;

/**
 * Created by Administrator on 2020/10/13.
 *
 * @see <a href="https://leetcode-cn.com/problems/swap-nodes-in-pairs/">24. 两两交换链表中的节点</a>
 */
public class LeetCode_24 {
    public static void main(String[] args) {
        SolutionLC24 solutionLC24 = new SolutionLC24();
        SolutionLC24.ListNode node1 = new SolutionLC24.ListNode(1);
        SolutionLC24.ListNode node2 = new SolutionLC24.ListNode(2);
        SolutionLC24.ListNode node3 = new SolutionLC24.ListNode(3);
        SolutionLC24.ListNode node4 = new SolutionLC24.ListNode(4);
        SolutionLC24.ListNode node5 = new SolutionLC24.ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        SolutionLC24.ListNode listNode = solutionLC24.swapPairs2(node1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}

class SolutionLC24 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    // 递归调用
    public ListNode swapPairs1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = head.next;
        head.next = swapPairs1(newHead.next);
        newHead.next = head;
        return newHead;
    }

    // 双指针调用
    public ListNode swapPairs2(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode temp = dummyHead;
        while (temp.next != null && temp.next.next != null) {
            ListNode node1 = temp.next;
            ListNode node2 = temp.next.next;
            temp.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            temp = node1;
        }
        return dummyHead.next;
    }
}