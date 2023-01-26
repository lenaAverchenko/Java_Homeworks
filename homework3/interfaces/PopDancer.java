package de.telran.averchenko.elena.homework3.interfaces;

public class PopDancer implements Danceble, Singable {
    public PopDancer() {
    }

    @Override
    public void dance(){
        System.out.println("I can dance!");
    }

    @Override
    public void sing(){
        System.out.println("I can sing!");
    }
    @Override
    public void dance (String type) {
        System.out.printf("I can dance %s.\n", type);
    }
    @Override
    public void sing (String type) {
        System.out.printf("I can sing %s.\n", type);
    }
}
