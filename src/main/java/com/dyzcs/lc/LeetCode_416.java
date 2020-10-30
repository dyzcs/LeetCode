package com.dyzcs.lc;

/**
 * Created by Administrator on 2020/10/11.
 *
 * @see <a href="https://leetcode-cn.com/problems/partition-equal-subset-sum/">416. 分割等和子集</a>
 */
public class LeetCode_416 {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 11, 5};
        int[] arr2 = {1, 2, 3, 5};
        SolutionLC416 solutionLC416 = new SolutionLC416();
        System.out.println(solutionLC416.canPartition1(arr1));
        System.out.println(solutionLC416.canPartition2(arr2));
    }
}

class SolutionLC416 {
    public boolean canPartition1(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return false;
        }
        int sum = 0, maxNum = 0;
        for (int num : nums) {
            sum += num;
            maxNum = Math.max(maxNum, num);
        }
        if (sum % 2 == 0) {
            return false;
        }
        int target = sum / 2;
        if (maxNum > target) {
            return false;
        }
        boolean[][] dp = new boolean[n][target + 1];
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }
        dp[0][nums[0]] = true;
        for (int i = 1; i < n; i++) {
            int num = nums[i];
            for (int j = 1; j <= target; j++) {
                if (j >= num) {
                    dp[i][j] = dp[i - 1][j] | dp[i - 1][j - num];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n - 1][target];
    }

    // dp优化
    public boolean canPartition2(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return false;
        }
        int sum = 0, maxNum = 0;
        for (int num : nums) {
            sum += num;
            maxNum = Math.max(maxNum, num);
        }
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;
        if (maxNum > target) {
            return false;
        }
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int num : nums) {
            for (int j = target; j >= num; --j) {
                dp[j] |= dp[j - num];
            }
        }
        return dp[target];
    }
}