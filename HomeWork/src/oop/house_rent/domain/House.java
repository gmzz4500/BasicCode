package oop.house_rent.domain;

import java.util.Objects;

/*
    1.一个House对象表示一个房屋信息
 */
public class House {
    private int id;
    private String name;
    private String phone;
    private String address;
    private double rent;
    private String state;

    public House() {
    }

    public House(int id, String name, String phone, String address, double rent, String state) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return id == house.id &&
                Double.compare(house.rent, rent) == 0 &&
                Objects.equals(name, house.name) &&
                Objects.equals(phone, house.phone) &&
                Objects.equals(address, house.address) &&
                Objects.equals(state, house.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phone, address, rent, state);
    }

    @Override
    public String toString() {
        return id +
                "\t\t\t" + name +
                "\t\t" + phone +
                "\t\t\t" + address +
                "\t\t" + rent +
                "\t\t" + state ;
    }
}
