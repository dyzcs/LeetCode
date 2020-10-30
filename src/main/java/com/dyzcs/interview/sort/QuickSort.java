package com.dyzcs.interview.sort;

import java.util.Arrays;

/**
 * Created by Administrator on 2020/10/30.
 * <p>
 * 快速排序
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 6, 1, 9, -1, 45, 56, 2};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 快速排序
     *
     * @param arr 目标数组
     */
    private static void quickSort(int[] arr) {
        quickSortInternally(arr, 0, arr.length - 1);
    }

    /**
     * 快速排序递归函数
     *
     * @param arr 目标函数
     * @param p   下标
     * @param r   下标
     */
    private static void quickSortInternally(int[] arr, int p, int r) {
        if (p >= r) {
            return;
        }
        // 获得分区点
        int q = partition(arr, p, r);
        quickSortInternally(arr, p, q - 1);
        quickSortInternally(arr, q + 1, r);
    }

    private static int partition(int[] arr, int p, int r) {
        int pivot = arr[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (arr[j] < pivot) {
                if (i == j) {
                    i++;
                } else {
                    int tmp = arr[i];
                    arr[i++] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        int tmp = arr[i];
        arr[i] = arr[r];
        arr[r] = tmp;

        return i;
    }
}
