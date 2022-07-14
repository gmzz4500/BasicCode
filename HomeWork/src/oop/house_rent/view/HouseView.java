package oop.house_rent.view;

import oop.house_rent.domain.House;
import oop.house_rent.service.HouseService;
import oop.house_rent.utils.Utility;

import java.util.ArrayList;

/*
    1.显示界面
    2.接收用户输入
    3.调用HouseService完成对房屋信息的各种操作
 */
public class HouseView {
    //变量
    private Boolean flag = true;
    private char key = ' ';
    private HouseService houseService = new HouseService();

    //方法
    //编写addHouse(),接收输入,创建House对象,调用add方法
    public void addHouse() {
        System.out.println("----------添加房屋信息-----------");
        System.out.print("姓名: ");
        String name = Utility.readString(8);
        System.out.print("电话: ");
        String phone = Utility.readString(12);
        System.out.print("地址: ");
        String address = Utility.readString(16);
        System.out.print("月租: ");
        int rent = Utility.readInt(10);
        System.out.print("状态(未出租/已出租): ");
        String state = Utility.readString(3);
        //创建一个新的House对象,注意id是系统分配的,用户不能输入
        House newHouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newHouse)) {
            System.out.println("-----------添加房屋成功--------------");
        } else {
            System.out.println("------------添加房屋失败-----------------");
        }
    }

    //编写searchHouse()查找房屋信息
    public void searchHouse() {
        System.out.println("\n-----------查找房屋信息----------");
        System.out.println("请输入你想要查询的房屋的编号(-1退出):");
        int searId = Utility.readInt();
        if (searId == -1) {
            System.out.println("----------放弃查找房屋信息-----------");
            return;
        }
        House house = houseService.search(searId);
        if (!(house == null)) {
            System.out.println(house);
        } else {
            System.out.println("你查找的房屋id不存在~");
        }
    }

    //编写listHouses()显示房屋列表
    public void listHouses() {
        System.out.println("\n-----------房屋列表----------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        ArrayList<House> houses = houseService.list();
        for (House house : houses) {
            System.out.println(house);
        }
    }

    //编写delHouse(),接收输入的id,调用service的del方法,删除房屋信息
    public void delHouse() {
        System.out.println("----------删除房屋信息-----------");
        System.out.println("请输入待删除房屋的编号(-1退出):");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("----------放弃删除房屋信息-----------");
            return;
        }
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            if (houseService.del(delId)) {
                System.out.println("----------删除房屋信息成功----------");
            } else {
                System.out.println("----------房屋编号不存在,删除失败----------");
            }
        } else {
            System.out.println("----------放弃删除房屋信息----------");
        }
    }

    //编写modifyHouse(),接收输入的id,调用service的modify方法,修改房屋信息
    public void modifyHouse() {
        System.out.println("----------修改房屋信息-----------");
        System.out.println("请输入待修改房屋的编号(-1退出):");
        int modifyId = Utility.readInt();
        if (modifyId == -1) {
            System.out.println("你放弃了修改房屋信息~");
            return;
        }
        House house = houseService.search(modifyId);
        if (house == null) {
            System.out.println("你想修改的房屋id不存在~");
            return;
        }
        System.out.print("姓名(" + house.getName() + "):");
        String name = Utility.readString(8, "");
        if (!"".equals(name)) {
            house.setName(name);
        }
        System.out.print("电话(" + house.getPhone() + "):");
        String phone = Utility.readString(12, "");
        if (!"".equals(phone)) {
            house.setPhone(phone);
        }
        System.out.print("地址(" + house.getAddress() + "):");
        String address = Utility.readString(16, "");
        if (!"".equals(address)) {
            house.setAddress(address);
        }
        System.out.print("租金(" + house.getRent() + "):");
        int rent = Utility.readInt(-1);
        if (rent != -1) {
            house.setRent(rent);
        }
        System.out.print("状态(" + house.getState() + "):");
        String state = Utility.readString(3, "");
        if (!"".equals(state)) {
            house.setState(state);
        }
    }

    //完成退出确认
    public void exit() {
        //使用Utility提供的方法,完成确认
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            flag = false;
        } else {
            System.out.println("你放弃退出~");
        }
    }

    public void mainMenu() {
        do {
            System.out.println("\n---------------房屋出租系统--------------");
            System.out.println("              1 新增房源");
            System.out.println("              2 查找房屋");
            System.out.println("              3 删除房屋");
            System.out.println("              4 修改房屋信息");
            System.out.println("              5 房屋列表");
            System.out.println("              6 退    出");
            System.out.println("请输入你想要的操作选项:(1-6)");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    searchHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    modifyHouse();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
            }
        } while (flag);
    }
}