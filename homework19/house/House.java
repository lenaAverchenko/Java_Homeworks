package de.telran.averchenko.elena.homework19.house;

import java.util.Objects;

public class House {
    private String street;
    private int number;
    private double price;
    private int buildingYear;

    public House(String street, int number, double price, int buildingYear) {
        this.street = street;
        this.number = number;
        this.price = price;
        this.buildingYear = buildingYear;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public double getPrice() {
        return price;
    }

    public int getBuildingYear() {
        return buildingYear;
    }

    @Override
    public String toString() {
        return "House{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", price=" + price +
                ", buildingYear=" + buildingYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Double.compare(house.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }
}
