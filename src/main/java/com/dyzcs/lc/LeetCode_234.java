package com.dyzcs.lc;

/**
 * Created by Administrator on 2020/10/23.
 *
 * @see <a href="https://leetcode-cn.com/problems/palindrome-linked-list/">234. 回文链表</a>
 */
public class LeetCode_234 {
    public static void main(String[] args) {
        SolutionLC234.ListNode n1 = new SolutionLC234.ListNode(1);
        SolutionLC234.ListNode n2 = new SolutionLC234.ListNode(2);
        SolutionLC234.ListNode n3 = new SolutionLC234.ListNode(2);
        SolutionLC234.ListNode n4 = new SolutionLC234.ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        SolutionLC234 solutionLC234 = new SolutionLC234();
        System.out.println(solutionLC234.isPalindrome(n1));
    }
}

class SolutionLC234 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    // 使用hash判断回文
    public boolean isPalindrome(ListNode head) {
        long hash1 = 0, hash2 = 0, h = 1;
        long seed = (long) (1e9 + 7);
        ListNode p = head;
        while (p != null) {
            hash1 = hash1 * seed + p.val;
            hash2 = hash2 + h * p.val;
            h *= seed;
            p = p.next;
        }
        return hash1 == hash2;
    }
}