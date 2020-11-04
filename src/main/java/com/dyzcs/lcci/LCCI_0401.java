package com.dyzcs.lcci;

/**
 * Created by Administrator on 2020/11/4.
 */
public class LCCI_0401 {
    public static void main(String[] args) {
        int n = 3;
        int[][] graph = {{0, 1}, {0, 2}, {1, 2}, {1, 2}};
        int start = 0, target = 2;
        SolutionLCCI0401 solutionLCCI0401 = new SolutionLCCI0401();
        System.out.println(solutionLCCI0401.findWhetherExistsPath(n, graph, start, target));
    }
}

class SolutionLCCI0401 {
    public boolean findWhetherExistsPath(int n, int[][] graph, int start, int target) {
        return false;
    }
}