package array;

import java.util.Arrays;

/*
* 冒泡排序
* */
public class HomeWork05 {
    public static void main(String[] args) {
        int[] arr = {8,2,3,0,6,9,1,4,2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] >arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
