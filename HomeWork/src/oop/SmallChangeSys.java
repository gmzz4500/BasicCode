package oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        boolean flag = true;
        int key = 0;
        double money = 0;
        double balance = 0;
        Date data = null;
        String details = "=================零钱通明细=================";
        String note = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        do {
            //先打印菜单
            System.out.println("\n================零钱通菜单=================");
            System.out.println("\t\t\t\t1 零钱通明细");
            System.out.println("\t\t\t\t2 收益入账");
            System.out.println("\t\t\t\t3 消      费");
            System.out.println("\t\t\t\t4 退      出");
            Scanner sc = new Scanner(System.in);
            System.out.println("请选择(1-4):");
            key = sc.nextInt();
            switch (key) {
                case 1:
                    System.out.println(details);
                    break;
                case 2:
                    System.out.println("收益入账金额:");
                    money = sc.nextDouble();
                    balance += money;
                    //拼接入账信息到details
                    data = new Date();//获取当前日期
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(data) + "\t余额:" + balance;
                    break;
                case 3:
                    System.out.println("消费金额:");
                    money = sc.nextDouble();
                    if (money < 0 || money > balance) {
                        System.out.println("您的消费金额应在0-" + balance + "之间");
                        break;
                    }
                    balance -= money;
                    System.out.println("消费说明:");
                    note = sc.next();
                    data = new Date();
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(data) + "\t余额:" + balance;
                    break;
                case 4:
                    while (true) {
                        System.out.println("你确定要退出零钱通吗?y/n");
                        String s = sc.next();
                        if (s.equals("y") || s.equals("Y")) {
                            return;
                        } else if (s.equals("n") || s.equals("N")) {
                            break;
                        } else {
                            System.out.println("你的输入有误!退出失败");
                        }
                    }
                default:
                    System.out.println("您的输入有误,请重新输入!");
            }

        } while (flag);
    }
}
