package oop.house_rent.service;

import oop.house_rent.domain.House;

import java.util.ArrayList;

/*
    1.相应HouseView 的调用
    2.完成对房屋信息的各种操作:create,read,update,delete
 */
public class HouseService {
    //创建ArrayList保存House对象
    private ArrayList<House> houses = new ArrayList<House>();
    private int id = 1;//id
    private int idCounter = 1;//记录当前的id数量


    public HouseService() {
        houses.add(new House(id, "jack", "112", "海淀区", 2000, "未出租"));
    }

    public ArrayList<House> getHouses() {
        return houses;
    }

    public void setHouses(ArrayList<House> houses) {
        this.houses = houses;
    }

    //add方法,添加新对象,返回boolean
    public boolean add(House newHouse) {
        if (idCounter < 5) {
            houses.add(newHouse);
            //需要设计一个id自增长机制
            newHouse.setId(++id);
            idCounter++;
            return true;
        } else {
            return false;
        }
    }

    //search方法,根据searId查找房屋信息,返回boolean
    public House search(int searId) {
        for (House house : houses) {
            if (searId == house.getId()) {
                return house;
            }
        }
        return null;
    }

    //list方法,返回houses
    public ArrayList<House> list() {
        return houses;
    }

    //del方法,删除一个房屋信息
    public boolean del(int delId) {
        int index = -1;
        for (House house : houses) {
            if (delId == house.getId()) {
                index = houses.indexOf(house);
            }
        }
        if (index == -1) {
            return false;
        }
        houses.remove(index);
        idCounter--;
        return true;
    }

}
