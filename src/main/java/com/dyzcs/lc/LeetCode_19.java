package com.dyzcs.lc;

/**
 * Created by Administrator on 2020/10/18.
 *
 * @see <a href="https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/">19. 删除链表的倒数第N个节点</a>
 */
public class LeetCode_19 {
    public static void main(String[] args) {
        SolutionLC19.ListNode n1 = new SolutionLC19.ListNode(1);
        SolutionLC19.ListNode n2 = new SolutionLC19.ListNode(2);
        SolutionLC19.ListNode n3 = new SolutionLC19.ListNode(3);
        SolutionLC19.ListNode n4 = new SolutionLC19.ListNode(4);
        SolutionLC19.ListNode n5 = new SolutionLC19.ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        int n = 2;

        SolutionLC19 solutionLC19 = new SolutionLC19();
        SolutionLC19.ListNode listNode = solutionLC19.removeNthFromEnd(n1, n);
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }
}

class SolutionLC19 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode first = head;
        ListNode second = dummy;
        for (int i = 0; i < n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}