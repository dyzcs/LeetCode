package com.dyzcs.lcof;

/**
 * Created by Administrator on 2020/10/14.
 */
public class Offer_24 {
    public static void main(String[] args) {
        SolutionOffer24.ListNode node1 = new SolutionOffer24.ListNode(1);
        SolutionOffer24.ListNode node2 = new SolutionOffer24.ListNode(2);
        SolutionOffer24.ListNode node3 = new SolutionOffer24.ListNode(3);
        SolutionOffer24.ListNode node4 = new SolutionOffer24.ListNode(4);
        SolutionOffer24.ListNode node5 = new SolutionOffer24.ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        SolutionOffer24 solutionOffer24 = new SolutionOffer24();
        SolutionOffer24.ListNode listNode = solutionOffer24.reverseList(node1);

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}

class SolutionOffer24 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        //新链表
        ListNode newHead = null;
        while (head != null) {
            //先保存访问的节点的下一个节点，保存起来
            //留着下一步访问的
            ListNode temp = head.next;
            //每次访问的原链表节点都会成为新链表的头结点，
            //其实就是把新链表挂到访问的原链表节点的
            //后面就行了
            head.next = newHead;
            //更新新链表
            newHead = head;
            //重新赋值，继续访问
            head = temp;
        }
        //返回新链表
        return newHead;
    }
}
