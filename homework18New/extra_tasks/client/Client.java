package de.telran.averchenko.elena.homework18New.extra_tasks.client;

import java.util.List;

public class Client {
    private int id;
    private String name;
    private int age;
    private List<Phone> phoneList;

    public Client(int id, String name, int age, List<Phone> phoneList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneList = phoneList;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<Phone> phoneList) {
        this.phoneList = phoneList;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneList=" + phoneList +
                '}';
    }
}
