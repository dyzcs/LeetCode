package com.dyzcs.offer;

/**
 * Created by Administrator on 2020/10/12.
 *
 * @see <a href="https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/">剑指 Offer 18. 删除链表的节点</a>
 */
public class Offer_18 {
    public static void main(String[] args) {
        SolutionOffer18.ListNode node1 = new SolutionOffer18.ListNode(4);
        SolutionOffer18.ListNode node2 = new SolutionOffer18.ListNode(5);
        SolutionOffer18.ListNode node3 = new SolutionOffer18.ListNode(1);
        SolutionOffer18.ListNode node4 = new SolutionOffer18.ListNode(9);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        SolutionOffer18 solutionOffer18 = new SolutionOffer18();
        SolutionOffer18.ListNode node = solutionOffer18.deleteNode(node1, 5);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}

class SolutionOffer18 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    // 通过改变指向删除节点
    public ListNode deleteNode(ListNode head, int val) {
        // 空链表
        if (head == null) {
            return null;
        }
        // 至少有一个节点
        boolean find = false;   // false表示没找到目标节点，true表示找到了该节点
        // 新增头节点
        ListNode phead = new ListNode(-1);
        phead.next = head;
        // slow指向要删除节点的前驱，quick指向要删除的节点
        ListNode slow = phead, quick = phead.next;
        while (quick != null) {
            if (quick.val == val) {
                find = true;
                break;
            }
            slow = slow.next;
            quick = quick.next;
        }
        // 如果没找到就不用删，返回原链表
        if (!find) {
            return head;
        }
        // 找到了就要删除，改变前驱节点指向
        slow.next = quick.next;
        return phead.next;
    }
}
