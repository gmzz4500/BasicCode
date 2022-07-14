package operator;

import java.util.Random;

/*
随机生成 1-100 的一个数，直到生成了 97 这个数，看看你一共用了几次?
*
* */
public class HomeWork02 {
    public static void main(String[] args) {
        //创建对象
        Random r = new Random();
        int count = 0;
        int num = 0;
        while (true) {
            num = r.nextInt(100) + 1;
            if (num == 97) {
                break;
            }
            System.out.println("num = " + num);
            count++;
        }
        System.out.println("count = " + count);
    }
}
