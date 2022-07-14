package com.yyds.a_static;

//编写一个数组工具类
public class ArraysUtils {
    //作者
    public static String author = "yyd";

    //私有化构造器,禁止创建对象来调用工具类
    private ArraysUtils() {
    }

    //求和
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //求最大值
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //求最小值
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    //漂亮的打印数组
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("[" + arr[i]);
            } else if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
            } else {
                System.out.print(" " + arr[i] + " ");
            }
        }
        System.out.println();
    }

    //查找指定元素第一次出现的索引值
    public static int firstIndex(int[] arr, int num) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("对不起,您查找的数不在数组中!");
            return index;
        } else {
            System.out.print(num + "第一次出现的索引位置是:");
            return index;
        }
    }

    //查找指定元素最后一次出现的索引值
    public static int lastIndex(int[] arr, int num) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("对不起,您查找的数不在数组中!");
            return index;
        } else {
            System.out.print(num + "最后一次出现的索引位置是:");
            return index;
        }
    }

    //数组排序,冒泡排序
    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("排序后的数组:");
        ArraysUtils.printArray(arr);
    }

    //数组翻转
    public static void reversalArray(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println("翻转后的数组:");
        ArraysUtils.printArray(arr);
    }
}
