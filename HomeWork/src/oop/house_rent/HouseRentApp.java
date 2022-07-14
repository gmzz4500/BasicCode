package oop.house_rent;

import oop.house_rent.view.HouseView;

/*
    1.创建HouseView对象
    2.调用该对象,显示主菜单
 */
public class HouseRentApp {
    public static void main(String[] args) {
        new HouseView().mainMenu();
        System.out.println("你退出了租房系统~");
    }
}
