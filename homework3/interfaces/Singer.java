package de.telran.averchenko.elena.homework3.interfaces;

public class Singer implements Singable{
    public Singer() {
    }

    @Override
    public void sing(){
        System.out.println("I can sing perfectly");
    }
    @Override
    public void sing (String type) {
        System.out.printf("I can sing %s perfectly\n", type);
    }
}
