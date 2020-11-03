package com.dyzcs.lcci;

/**
 * Created by Administrator on 2020/11/3.
 */
public class LCCI_0105 {
    public static void main(String[] args) {
        String first1 = "pale", second1 = "ple";
        String first2 = "pales", second2 = "pal";

        SolutionLCCI0105 solutionLCCI0105 = new SolutionLCCI0105();
        System.out.println(solutionLCCI0105.oneEditAway(first1, second1));
        System.out.println(solutionLCCI0105.oneEditAway(first2, second2));
    }
}

class SolutionLCCI0105 {
    public boolean oneEditAway(String first, String second) {
        return false;
    }
}
