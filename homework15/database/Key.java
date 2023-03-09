package de.telran.averchenko.elena.homework15.database;

import java.util.Objects;

public final class Key {
    private final int number;
    private final Person person;
    private final Sex sex;
    private final int year;

    //
    public Key(int number,Person person) {
        this.number = number;
        this.person = new Person(person.getName(), person.getSurname(),person.getSex(), person.getYearOfBirth(), person.getJobTitle());
        this.sex = person.getSex();
        this.year = person.getYearOfBirth();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return number == key.number && year == key.year && Objects.equals(person, key.person) && sex == key.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, person, sex, year);
    }

    @Override
    public String toString() {
        return "Key{" + number;
    }
}
