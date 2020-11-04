package com.dyzcs.lcci;

/**
 * Created by Administrator on 2020/11/4.
 *
 * @see <a href="https://leetcode-cn.com/problems/sum-lists-lcci/">面试题 02.05. 链表求和</a>
 */
public class LCCI_0205 {
    public static void main(String[] args) {

    }
}

class SolutionLCCI0205 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //虚拟头节点
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        //进位
        int carry = 0;
        while (l1 != null || l2 != null || carry > 0) {
            int i = l1 == null ? 0 : l1.val;
            int j = l2 == null ? 0 : l2.val;
            //相加之和(包含进位的)
            int sum = i + j + carry;
            temp.next = new ListNode(sum % 10);
            //更新进位的值
            carry = sum / 10;

            temp = temp.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return dummy.next;
    }
}