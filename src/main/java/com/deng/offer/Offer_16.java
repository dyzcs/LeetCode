package com.deng.offer;

/**
 * Created by Administrator on 2020/10/11.
 *
 * @see <a href="https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/">剑指 Offer 16. 数值的整数次方</a>
 */
public class Offer_16 {
    public static void main(String[] args) {
        SolutionOffer16 solutionOffer16 = new SolutionOffer16();
        System.out.println(solutionOffer16.myPow(2.00000, 10));
        System.out.println(solutionOffer16.myPow(2.10000, 3));
        System.out.println(solutionOffer16.myPow(2.00000, -2));
    }
}

class SolutionOffer16{
    /**
     * @see <a href="https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/solution/mian-shi-ti-16-shu-zhi-de-zheng-shu-ci-fang-kuai-s/">题解</a>
     */
    public double myPow(double x, int n) {
        if(x == 0) return 0;
        long b = n;
        double res = 1.0;
        if(b < 0) {
            x = 1 / x;
            b = -b;
        }
        while(b > 0) {
            if((b & 1) == 1) res *= x;
            x *= x;
            b >>= 1;
        }
        return res;
    }
}
