package de.telran.averchenko.elena.homework3.interfaces;

public class TestInterfaces {
    public static void main(String[] args) {
        Dancer dancer = new Dancer();
        Singer singer = new Singer();
        PopSinger popSinger = new PopSinger();

        dancer.dance();
        dancer.dance("salsa");

        singer.sing();
        singer.sing("loud");

        popSinger.dance();
        popSinger.dance("street dance");
        popSinger.sing();
        popSinger.sing("Opera songs");

    }
}
