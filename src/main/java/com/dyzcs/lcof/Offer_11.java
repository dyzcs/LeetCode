package com.dyzcs.lcof;

/**
 * Created by Administrator on 2020/10/9.
 *
 * @see <a href="https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/">剑指 Offer 11. 旋转数组的最小数字</a>
 */
public class Offer_11 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        SolutionOffer11 solutionOffer11 = new SolutionOffer11();
        int num = solutionOffer11.minArray_2(arr);
        System.out.println(num);
    }
}

class SolutionOffer11 {
    public int minArray_1(int[] numbers) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            if (start + 1 < numbers.length && numbers[start] > numbers[start + 1]) {
                return numbers[start + 1];
            } else if (numbers[end] < numbers[end - 1]) {
                return numbers[end];
            }
            start++;
            end--;
        }
        return numbers[0];
    }

    public int minArray_2(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int pivot = low + (high - low) / 2;
            if (numbers[pivot] < numbers[high]) {
                high = pivot;
            } else if (numbers[pivot] > numbers[high]) {
                low = pivot + 1;
            } else {
                high -= 1;
            }
        }
        return numbers[low];
    }
}
