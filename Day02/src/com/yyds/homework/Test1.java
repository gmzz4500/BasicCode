package com.yyds.homework;

public class Test1 {
    public static void main(String[] args) {
        Item i1 = new Item("血瓶", 50);
        Item i2 = new Item("草鞋", 300);
        Item i3 = new Item("长剑", 350);
        System.out.println("名称：" + "\t\t" + "价格");
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }
}
class Item{
    String name;
    int price;

    public Item() {
    }

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "name=" + name + ", price=" + price ;
    }
}
