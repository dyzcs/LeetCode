package com.dyzcs.lcci;

/**
 * Created by Administrator on 2020/11/4.
 *
 * @see <a href="https://leetcode-cn.com/problems/partition-list-lcci/">面试题 02.04. 分割链表</a>
 */
public class LCCI_0204 {
    public static void main(String[] args) {

    }
}

class SolutionLCCI0204 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }

        // 左链表虚拟头节点
        ListNode leftOne = new ListNode(-1);
        ListNode left = leftOne;
        // 右链表虚拟头节点
        ListNode rightOne = new ListNode(-1);
        ListNode right = rightOne;

        // 因为有断开操作，所以需要记录下一个遍历的节点
        ListNode next;
        while (head != null) {
            next = head.next;

            // 值小于x的节点都接在左链表，其他接在右链表
            if (head.val < x) {
                left.next = head;
                left = left.next;
            } else {
                right.next = head;
                right = right.next;
            }

            // 断开操作
            head.next = null;

            head = next;
        }

        // 将右链表接在左链表的尾部
        left.next = rightOne.next;
        return leftOne.next;
    }
}
