package com.dyzcs.lcof;

import java.util.Stack;

/**
 * Created by Administrator on 2020/10/17.
 *
 * @see <a href="https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof/">剑指 Offer 30. 包含min函数的栈</a>
 */
public class Offer_30 {
    public static void main(String[] args) {
        MinStackOffer30 obj = new MinStackOffer30();
        obj.push(1);
        obj.push(3);
        obj.push(55);
        obj.push(31);
        obj.pop();
        int param_3 = obj.top();
        int param_4 = obj.min();
        System.out.println(param_3);
        System.out.println(param_4);
    }
}

class MinStackOffer30 {
    Stack<Integer> A, B;

    /**
     * initialize your data structure here.
     */
    public MinStackOffer30() {
        A = new Stack<>();
        B = new Stack<>();
    }

    public void push(int x) {
        A.add(x);
        if (B.empty() || B.peek() >= x) {
            B.add(x);
        }
    }

    public void pop() {
        if (A.pop().equals(B.peek())) {
            B.pop();
        }
    }

    public int top() {
        return A.peek();
    }

    public int min() {
        return B.peek();
    }
}