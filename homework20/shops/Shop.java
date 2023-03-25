package de.telran.averchenko.elena.homework20.shops;

import java.util.List;

public class Shop {
     String name;
    private String address;
    private int workTo;
    List<Product> list;

    public Shop(String name, String address, int workTo, List<Product> list) {
        this.name = name;
        this.address = address;
        this.workTo = workTo;
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getWorkTo() {
        return workTo;
    }

    public void setWorkTo(int workTo) {
        this.workTo = workTo;
    }

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", workTo='" + workTo + '\'' +
                ", list=" + list +
                '}';
    }
}
