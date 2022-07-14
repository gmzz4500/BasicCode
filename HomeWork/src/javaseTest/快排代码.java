package javaseTest;

import java.util.Arrays;

public class 快排代码 {
    public static void main(String[] args) {
        int[] arr = {13,11,6,16,11,13,23,23,16};
        quickSort(arr,0,arr.length - 1);
        System.out.println("排序后:" + Arrays.toString(arr));
    }
    //快排方法
    public static void quickSort(int[] arr,int left,int right){
        //递归出口
        if(left > right){
            return;
        }
        //定义一个变量存储left的值,将此位置上的数组作为基准数,基准数把数组分为两部分,左边比基准数小,右边比基准数大
        //开始给基准数找真正的索引位置
        int start = left;
        int end = right;
        int baseNum = arr[left];
        while(left != right){
            //从数组最后开始往前面找,找到比基准数小的数就停止
            while(left < right && arr[right] >= baseNum){
                right--;
            }
            //从数组最前面往后面找,找到比基准数大的数就停止
            while(left < right && arr[left] <= baseNum){
                left++;
            }
            //两个数交换位置
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        //基准数归位
        int temp = arr[left];
        arr[left] = arr[start];
        arr[start] = temp;

        quickSort(arr,0,left - 1);
        quickSort(arr,left + 1,end);
    }
}
