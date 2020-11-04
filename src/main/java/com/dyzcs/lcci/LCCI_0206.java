package com.dyzcs.lcci;

/**
 * Created by Administrator on 2020/11/4.
 */
public class LCCI_0206 {
    public static void main(String[] args) {

    }
}

class SolutionLCCI0206 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
