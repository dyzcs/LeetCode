package com.deng.offer;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by Administrator on 2020/10/6.
 *
 * @see <a href="https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/">剑指 Offer 06. 从尾到头打印链表</a>
 */
public class Offer_06 {
    public static void main(String[] args) {
        SolutionOffer06.ListNode node1 = new SolutionOffer06.ListNode(1);
        SolutionOffer06.ListNode node2 = new SolutionOffer06.ListNode(3);
        SolutionOffer06.ListNode node3 = new SolutionOffer06.ListNode(2);
        node1.next = node2;
        node2.next = node3;

        SolutionOffer06 solutionOffer06 = new SolutionOffer06();
        int[] ints = solutionOffer06.reversePrint_02(node1);
        System.out.println(Arrays.toString(ints));
    }
}

class SolutionOffer06 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    // 借助Stack
    public int[] reversePrint_01(ListNode head) {
        Deque<ListNode> deque = new LinkedList<>();
        while (head != null) {
            deque.add(head);
            head = head.next;
        }
        int size = deque.size();
        int[] arr = new int[size];
        while (!deque.isEmpty()) {
            arr[--size] = deque.pop().val;
        }

        return arr;
    }

    // 双指针 + 使用数组
    public int[] reversePrint_02(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int[] arr = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            arr[i] = head.val;
            head = head.next;
        }
        return arr;
    }
}
