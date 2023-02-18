package de.telran.averchenko.elena.homework10.advertisement;

import java.util.Objects;

public class Advertisement implements Comparable<Advertisement> {
    private int price;
    private String name;
    private String author;
    private String description;
    private int publishingYear;

    public Advertisement(int price, String name, String author, int publishingYear, String description) {
        this.price = price;
        this.name = name;
        this.author = author;
        this.publishingYear = publishingYear;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishingYear=" + publishingYear +
                '}';
    }

    @Override
    public int compareTo(Advertisement o) {
        int yearCompared = Integer.compare(this.publishingYear, o.publishingYear);
        if (yearCompared == 0){
            int nameCompared = this.name.compareTo(o.name);
            if (nameCompared == 0){
                int authorCompared = this.author.compareTo(o.author);
                if (authorCompared == 0){
                    return this.description.compareTo(o.description);
                }
                return authorCompared;
            }
            return nameCompared;
        }

        return yearCompared;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Advertisement that = (Advertisement) o;
        return price == that.price && publishingYear == that.publishingYear && Objects.equals(name, that.name) && Objects.equals(author, that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name, author, publishingYear);
    }


}
