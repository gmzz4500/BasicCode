package oop.pizza;

import java.util.Scanner;

public class Test {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        //选择购买匹萨：
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择你想要购买的匹萨（1.培根匹萨 2.水果匹萨）:");
        int choice = sc.nextInt();//选择
        //通过工厂获取匹萨：
        Pizza pizza = PizzaStore.getPizza(choice);
        System.out.println(pizza.showPizza());
    }
}
