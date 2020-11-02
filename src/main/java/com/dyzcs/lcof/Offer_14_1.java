package com.dyzcs.lcof;

/**
 * Created by Administrator on 2020/10/10.
 *
 * @see <a href="https://leetcode-cn.com/problems/jian-sheng-zi-lcof/">剑指 Offer 14- I. 剪绳子</a>
 */
public class Offer_14_1 {
    public static void main(String[] args) {
        int n = 10;
        SolutionOffer14_1 solutionOffer14_1 = new SolutionOffer14_1();
        System.out.println(solutionOffer14_1.cuttingRope(n));
    }
}

class SolutionOffer14_1 {
    /**
     * @see <a href="https://leetcode-cn.com/problems/jian-sheng-zi-lcof/solution/mian-shi-ti-14-i-jian-sheng-zi-tan-xin-si-xiang-by/">题解</a>
     */
    public int cuttingRope(int n) {
        if(n <= 3) return n - 1;
        int a = n / 3, b = n % 3;
        if(b == 0) return (int)Math.pow(3, a);
        if(b == 1) return (int)Math.pow(3, a - 1) * 4;
        return (int)Math.pow(3, a) * 2;
    }
}
