package de.telran.averchenko.elena.homework18New.extra_tasks.auto_numbers;

public class Auto {
    private String carNumber;
    private String carModel;
    private String carColor;
    private int mileage;
    private int price;

    public Auto(String carNumber, String carModel, String carColor, int mileage, int price) {
        this.carNumber = carNumber;
        this.carModel = carModel;
        this.carColor = carColor;
        this.mileage = mileage;
        this.price = price;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "carNumber='" + carNumber + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carColor='" + carColor + '\'' +
                ", mileage=" + mileage +
                ", price=" + price +
                '}';
    }
}
