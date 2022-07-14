package com.yyds.d_system;

import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0; i < 50; i++) {
//            System.out.println("正常打印~");
//        }
//        System.err.println("错误信息打印~");

        long start = System.currentTimeMillis();
        //数组复制方法
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = new int[10];
        System.out.println("Arrays.toString(dest) = " + Arrays.toString(dest));

        //jvm退出
        //System.exit(5);
        Thread.sleep(1000);
        //把src中的2,3,4复制到dest中的第5,6,7三个元素位置
        System.arraycopy(src, 1, dest, 4, 3);
        System.out.println("Arrays.toString(dest) = " + Arrays.toString(dest));

        //
        long end = System.currentTimeMillis();
        System.out.println("end - start = " + (end - start));
    }
}
