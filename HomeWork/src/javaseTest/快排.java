package javaseTest;

import java.util.Arrays;

public class 快排 {
    public static void main(String[] args) {
        int[] arr = {49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("排序后:" + Arrays.toString(arr));
    }

    //快排方法体
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int index = findBaseIndex(arr, start, end);
            quickSort(arr, start, index - 1);
            quickSort(arr, index + 1, end);
        }

    }

    //找基准值索引位置的方法,在索引值的左边都是比它小的值,右边都是比它大的值
    public static int findBaseIndex(int[] arr, int start, int end) {
        int base = start;
        while (start < end) {
            while (start < end && arr[end] >= arr[base]) {
                end--;
            }
            arr[start] = arr[end];
            while (start < end && arr[start] <= arr[base]) {
                start++;
            }
            arr[end] = arr[start];
        }
        arr[start] = arr[base];
        return start;
    }
}
