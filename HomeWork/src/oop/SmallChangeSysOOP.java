package oop;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {
    boolean flag = true;
    double money = 0;
    double balance = 0;
    Date data = null;
    String details = "=================零钱通明细=================";
    String note = "";
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
    Scanner sc = new Scanner(System.in);

    //打印菜单的功能
    public void printMenu() {
        do {
            //先打印菜单
            System.out.println("\n================零钱通菜单=================");
            System.out.println("\t\t\t\t1 零钱通明细");
            System.out.println("\t\t\t\t2 收益入账");
            System.out.println("\t\t\t\t3 消      费");
            System.out.println("\t\t\t\t4 退      出");
            System.out.println("请选择(1-4):");
            int key = sc.nextInt();
            switch (key) {
                case 1:
                    this.printDetails();
                    break;
                case 2:
                    this.income();
                    break;
                case 3:
                    this.outcome();
                    break;
                case 4:
                    this.exit();
                    break;
                default:
                    System.out.println("输入有误,请重新输入~");
            }
        }while (flag) ;
    }

    //打印零钱通明细
    public void printDetails() {
        System.out.println(details);
    }

    //收益入账
    public void income() {
        System.out.println("收益入账金额:");
        money = sc.nextDouble();
        if (money <= 0) {
            System.out.println("您的收益入账金额应大于0");
            return;
        }
        balance += money;
        //拼接入账信息到details
        data = new Date();//获取当前日期
        details += "\n收益入账\t+" + money + "\t" + sdf.format(data) + "\t余额:" + balance;
    }

    //消费
    public void outcome() {
        System.out.println("消费金额:");
        money = sc.nextDouble();
        if (money < 0 || money > balance) {
            System.out.println("您的消费金额应在0-" + balance + "之间");
            return;
        }
        balance -= money;
        System.out.println("消费说明:");
        note = sc.next();
        data = new Date();
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(data) + "\t余额:" + balance;
    }

    //退出
    public void exit() {
        while (true) {
            System.out.println("你确定要退出零钱通吗?y/n");
            String s = sc.next();
            if (s.equals("y") || s.equals("Y")) {
                flag = false;
                System.out.println("退出成功~");
                break;
            } else if (s.equals("n") || s.equals("N")) {
                return;
            } else {
                System.out.println("你的输入有误!退出失败");
                return;
            }
        }
    }
}

