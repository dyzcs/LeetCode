package com.dyzcs.lcof;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by Administrator on 2020/10/7.
 *
 * @see <a href="https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/">剑指 Offer 09. 用两个栈实现队列</a>
 */
public class Offer_09 {
    public static void main(String[] args) {
        CQueue queue = new CQueue();
        queue.appendTail(12);
        queue.appendTail(13);
        queue.appendTail(14);
        queue.appendTail(15);
        for (int i = 0; i < 4; i++) {
            System.out.println(queue.deleteHead());
        }
    }

    /**
     * 双栈模拟队列
     */
    static class CQueue {
        Deque<Integer> stack1;
        Deque<Integer> stack2;

        public CQueue() {
            stack1 = new LinkedList<>();
            stack2 = new LinkedList<>();
        }

        public void appendTail(int value) {
            stack1.push(value);
        }

        public int deleteHead() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            if (stack2.isEmpty()) {
                return -1;
            } else {
                return stack2.pop();
            }
        }
    }
}
