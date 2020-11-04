package com.dyzcs.lcci;

/**
 * Created by Administrator on 2020/11/4.
 *
 * @see <a href="https://leetcode-cn.com/problems/delete-middle-node-lcci/">面试题 02.03. 删除中间节点</a>
 */
public class LCCI_0203 {
    public static void main(String[] args) {

    }
}

class SolutionLCCI0203 {
    static class ListNode {
        int val;
        SolutionLCCI0202.ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
