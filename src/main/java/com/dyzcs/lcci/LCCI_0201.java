package com.dyzcs.lcci;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2020/11/4.
 *
 * @see <a href="https://leetcode-cn.com/problems/remove-duplicate-node-lcci/">面试题 02.01. 移除重复节点</a>
 */
public class LCCI_0201 {
    public static void main(String[] args) {
        SolutionLCCI0201 solutionLCCI0201 = new SolutionLCCI0201();
        // 1, 2, 3, 3, 2, 1
        SolutionLCCI0201.ListNode l1 = new SolutionLCCI0201.ListNode(1);
        SolutionLCCI0201.ListNode l2 = new SolutionLCCI0201.ListNode(2);
        SolutionLCCI0201.ListNode l3 = new SolutionLCCI0201.ListNode(3);
        SolutionLCCI0201.ListNode l4 = new SolutionLCCI0201.ListNode(3);
        SolutionLCCI0201.ListNode l5 = new SolutionLCCI0201.ListNode(2);
        SolutionLCCI0201.ListNode l6 = new SolutionLCCI0201.ListNode(1);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;

        SolutionLCCI0201.ListNode listNode = solutionLCCI0201.removeDuplicateNodes(l1);
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
        // 1, 1, 1, 1, 2
    }
}

class SolutionLCCI0201 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) {
            return head;
        }
        Set<Integer> set = new HashSet<>();
        set.add(head.val);
        ListNode pos = head;
        while (pos.next != null) {
            ListNode cur = pos.next;
            if (set.add(cur.val)) {
                pos = pos.next;
            } else {
                pos.next = pos.next.next;
            }
        }
        // 帮助jvm gc
        pos.next = null;
        return head;
    }
}