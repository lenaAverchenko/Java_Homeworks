package de.telran.averchenko.elena.homework10.books;

import java.util.Objects;

public class Author implements Comparable<Author>{
    private String name;
    private String surname;
    private int yearOfBirth;

    public Author(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    @Override
    public int compareTo(Author o) {
        int surnameCompared = this.surname.compareTo(o.surname);
        if (surnameCompared == 0){
            return Integer.compare(this.yearOfBirth, o.yearOfBirth);
        }
        return surnameCompared;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return yearOfBirth == author.yearOfBirth && Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, yearOfBirth);
    }
}
