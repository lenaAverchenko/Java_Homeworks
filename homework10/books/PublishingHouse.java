package de.telran.averchenko.elena.homework10.books;

public class PublishingHouse implements Comparable<PublishingHouse> {
    private String nameOfPH;
    private int yearOfOpening;

    public PublishingHouse(String nameOfPH, int yearOfOpening) {
        this.nameOfPH = nameOfPH;
        this.yearOfOpening = yearOfOpening;
    }

    public String getNameOfPH() {
        return nameOfPH;
    }

    public int getYearOfOpening() {
        return yearOfOpening;
    }

    @Override
    public String toString() {
        return "PublishingHouse{" +
                "nameOfPH='" + nameOfPH + '\'' +
                ", yearOfOpening=" + yearOfOpening +
                '}';
    }

    @Override
    public int compareTo(PublishingHouse o) {
        int nameCompared = this.nameOfPH.compareTo(o.nameOfPH);
        if (nameCompared == 0){
            return Integer.compare(this.yearOfOpening, o.yearOfOpening);
        }
        return nameCompared;
    }

}
