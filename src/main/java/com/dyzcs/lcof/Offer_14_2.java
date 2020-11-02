package com.dyzcs.lcof;

/**
 * Created by Administrator on 2020/10/11.
 *
 * @see <a href="https://leetcode-cn.com/problems/jian-sheng-zi-ii-lcof/">剑指 Offer 14- II. 剪绳子 II</a>
 */
public class Offer_14_2 {
    public static void main(String[] args) {
        SolutionOffer14_2 solutionOffer14_2 = new SolutionOffer14_2();
        System.out.println(solutionOffer14_2.cuttingRope(2));
        System.out.println(solutionOffer14_2.cuttingRope(10));
    }
}

class SolutionOffer14_2 {
    /**
     * @see <a href="https://leetcode-cn.com/problems/jian-sheng-zi-ii-lcof/solution/mian-shi-ti-14-ii-jian-sheng-zi-iitan-xin-er-fen-f/">题解</a>
     */
    public int cuttingRope(int n) {
        if(n <= 3) return n - 1;
        int b = n % 3, p = 1000000007;
        long rem = 1, x = 3;
        for(int a = n / 3 - 1; a > 0; a /= 2) {
            if(a % 2 == 1) rem = (rem * x) % p;
            x = (x * x) % p;
        }
        if(b == 0) return (int)(rem * 3 % p);
        if(b == 1) return (int)(rem * 4 % p);
        return (int)(rem * 6 % p);
    }
}