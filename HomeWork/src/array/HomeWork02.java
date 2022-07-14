package array;

import java.util.Arrays;

public class HomeWork02 {
    public static void main(String[] args) {
        int[] arr = {10, 12, 45, 90};
        int insertNum = 23;
        int index = -1;
        System.out.println("arr[2] = " + arr[2]);
        for (int i = 0; i < arr.length; i++) {
            if (insertNum <= arr[i]) {
                index = i;
                break;
            }
        }
        System.out.println("插入数据的索引位置为:" + index);
        int[] newArr = new int[arr.length + 1];
        for (int i = 0,j=0; i < newArr.length; i++) {
            if(i!=index){
                newArr[i] = arr[j];
                j++;
            }else {
                newArr[i] = insertNum;
            }
        }
        System.out.println("Arrays.toString(newArr) = " + Arrays.toString(newArr));
    }
}
