package de.telran.averchenko.elena.homework3.interfaces;

public class PopSinger implements Singable, Danceble{
    // public class PopSinger extends Singer implements Danceble - можно написать так, поскольку мы наследуем
    //Singer, который имплиментит Singable или сделать extends Dancer, тогда не нужно переопределять 2 метода, а только недостающий


    public PopSinger() {
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
