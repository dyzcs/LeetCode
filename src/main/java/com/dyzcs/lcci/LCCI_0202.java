package com.dyzcs.lcci;

/**
 * Created by Administrator on 2020/11/4.
 *
 * @see <a href="https://leetcode-cn.com/problems/kth-node-from-end-of-list-lcci/">面试题 02.02. 返回倒数第 k 个节点</a>
 */
public class LCCI_0202 {
    public static void main(String[] args) {
        SolutionLCCI0202 solutionLCCI0202 = new SolutionLCCI0202();
        SolutionLCCI0202.ListNode l1 = new SolutionLCCI0202.ListNode(1);
        SolutionLCCI0202.ListNode l2 = new SolutionLCCI0202.ListNode(2);
        SolutionLCCI0202.ListNode l3 = new SolutionLCCI0202.ListNode(3);
        SolutionLCCI0202.ListNode l4 = new SolutionLCCI0202.ListNode(4);
        SolutionLCCI0202.ListNode l5 = new SolutionLCCI0202.ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        int k = 2;

        System.out.println(solutionLCCI0202.kthToLast(l1, k));
    }
}

class SolutionLCCI0202 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public int kthToLast(ListNode head, int k) {
        ListNode first = head;
        ListNode second = head;
        while (k-- > 0) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        return second.val;
    }
}
