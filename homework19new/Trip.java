package de.telran.averchenko.elena.homework19new;

public class Trip {
    private String source;
    private String destination;
    private String hours;
    private double price;
    private String startDate;
    private String returnDate;

    public Trip(String source, String destination, String hours, double price, String startDate, String returnDate) {
        this.source = source;
        this.destination = destination;
        this.hours = hours;
        this.price = price;
        this.startDate = startDate;
        this.returnDate = returnDate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", hours='" + hours + '\'' +
                ", price=" + price +
                ", startDate='" + startDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }
}
