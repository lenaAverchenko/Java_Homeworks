package de.telran.averchenko.elena.homework11.operator;

import java.util.Objects;

public class Client {
    private String name;
    private String number;
    private boolean isVip;

    public Client(String name, String number, boolean isVip) {
        this.name = name;
        this.number = number;
        this.isVip = isVip;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public boolean isVip() {
        return isVip;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", isVip=" + isVip +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return isVip == client.isVip && Objects.equals(name, client.name) && Objects.equals(number, client.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number, isVip);
    }
}
