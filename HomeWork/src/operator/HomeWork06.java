package operator;

import java.util.Scanner;

public class HomeWork06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println(num + "大于0");
        } else if (num < 0) {
            System.out.println(num + "小于0");
        } else {
            System.out.println(num + "等于0");
        }
    }
}
