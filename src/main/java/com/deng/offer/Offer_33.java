package com.deng.offer;

import java.util.Stack;

/**
 * Created by Administrator on 2020/10/20.
 */
public class Offer_33 {
    public static void main(String[] args) {
        int[][] arr = {{1, 6, 3, 2, 5}, {1, 3, 2, 6, 5}};
        SolutionOffer33 solutionOffer33 = new SolutionOffer33();
        for (int[] tmp : arr) {
            boolean b = solutionOffer33.verifyPostorder(tmp);
            System.out.println(b);
        }
    }
}

class SolutionOffer33 {
    public boolean verifyPostorder(int[] postorder) {
        Stack<Integer> stack = new Stack<>();
        int root = Integer.MAX_VALUE;
        for (int i = postorder.length - 1; i >= 0; i--) {
            if (postorder[i] > root) {
                return false;
            }
            while (!stack.isEmpty() && stack.peek() > postorder[i]) {
                root = stack.pop();
            }
            stack.add(postorder[i]);
        }
        return true;
    }
}
