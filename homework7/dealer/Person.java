package de.telran.averchenko.elena.homework7.dealer;

public class Person {
    private String name;
    public int numberOfCards;

    public Person(String name) {
        this.name = name;
        numberOfCards = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfCards(int numberOfCards) {
        this.numberOfCards = numberOfCards;
    }

    public int getNumberOfCards() {
        return numberOfCards;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", numberOfCards=" + numberOfCards +
                '}';
    }
}
