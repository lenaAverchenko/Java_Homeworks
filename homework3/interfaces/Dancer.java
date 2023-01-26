package de.telran.averchenko.elena.homework3.interfaces;

public class Dancer implements Danceble{
    public Dancer() {
    }

    @Override
    public void dance() {
        System.out.println("I can dance perfectly");
    }
    @Override
    public void dance (String type) {
        System.out.printf("I can dance %s perfectly\n", type);
    }
}
