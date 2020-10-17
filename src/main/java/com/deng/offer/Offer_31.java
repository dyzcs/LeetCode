package com.deng.offer;

import java.util.Stack;

/**
 * Created by Administrator on 2020/10/17.
 *
 * @see <a href="https://leetcode-cn.com/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof/">剑指 Offer 31. 栈的压入、弹出序列</a>
 */
public class Offer_31 {
    public static void main(String[] args) {
        int[] pushed = {1, 2, 3, 4, 5}, popped = {4, 5, 3, 2, 1};
        SolutionOffer31 solutionOffer31 = new SolutionOffer31();
        boolean b = solutionOffer31.validateStackSequences(pushed, popped);
        System.out.println(b);
    }
}

class SolutionOffer31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (int num : pushed) {
            stack.push(num);
            while (!stack.isEmpty() && stack.peek() == popped[i]) {
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }
}