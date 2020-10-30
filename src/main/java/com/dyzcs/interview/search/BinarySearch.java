package com.dyzcs.interview.search;

/**
 * Created by Administrator on 2020/10/30.
 * <p>
 * 二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 4, 4, 6, 7, 7, 8, 9, 13};
        int num1 = binarySearch(arr, 0, arr.length - 1, 4);
        System.out.println(num1);
    }

    // 递归
    private static int binarySearch(int[] arr, int low, int high, int target) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] > target) {
            return binarySearch(arr, low, mid - 1, target);
        } else if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, high, target);
        } else {
            return mid;
        }
    }
}
