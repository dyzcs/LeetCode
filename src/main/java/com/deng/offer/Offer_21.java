package com.deng.offer;

import java.util.Arrays;

/**
 * Created by Administrator on 2020/10/14.
 *
 * @see <a href="https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/">剑指 Offer 21. 调整数组顺序使奇数位于偶数前面</a>
 */
public class Offer_21 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        SolutionOffer21 solutionOffer21 = new SolutionOffer21();
        int[] exchange = solutionOffer21.exchange(arr);
        System.out.println(Arrays.toString(exchange));
    }
}

class SolutionOffer21 {
    public int[] exchange(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] % 2 == 1) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                i++;
            }
        }
        return nums;
    }
}