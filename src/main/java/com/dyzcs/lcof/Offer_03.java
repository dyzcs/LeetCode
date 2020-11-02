package com.dyzcs.lcof;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2020/10/6.
 *
 * @see <a href="https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/">剑指 Offer 03. 数组中重复的数字</a>
 */
public class Offer_03 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 0, 2, 5, 3};
        SolutionOffer03 solution = new SolutionOffer03();
        int repeatNumber = solution.findRepeatNumber_02(arr);
        System.out.println(repeatNumber);
    }
}

class SolutionOffer03 {
    // 使用集合
    public int findRepeatNumber_01(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        return -1;
    }

    // 先排序，然后两两比较
    public int findRepeatNumber_02(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return nums[i];
            }
        }
        return -1;
    }
}
