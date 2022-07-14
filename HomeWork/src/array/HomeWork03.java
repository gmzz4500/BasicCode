package array;

import java.util.Random;

/*
* 随机生成10个整数(1-100),保存到数组,并倒序打印
* 以及求平均值,最大值和最大值的下标,并查找里面是否有8
* */
public class HomeWork03 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(100) + 1;
        }
        int sum = 0;
        int max = 0;
        int index = -1;
        boolean flag = false;
        double avg = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(max < arr[i]){
                max = arr[i];
                index = i;
            }
            if(arr[i] == 8){
                flag = true;
            }
        }
        if(flag == false){
            System.out.println("数组中没有8");
        }else {
            System.out.println("数组中有8");
        }
        avg = sum / arr.length;
        System.out.println("平均值为: " + avg);
        System.out.println("最大值为: " + max);
        System.out.println("最大值的下标为: " + index);
    }
}
