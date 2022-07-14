package com.yyds.b_oop1;

public class Phone {
    private String brand;
    private int price;
    private String size;
    private String color;
    private String memory;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
    public void show(){
        System.out.println(brand + "牌手机" + "尺寸" +
                size + "颜色为" + color + "内存" + memory +
                "的价格是" + price + "元");
    }
}
