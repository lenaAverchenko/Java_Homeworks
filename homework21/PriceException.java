package de.telran.averchenko.elena.homework21;

public class PriceException extends Exception{
    public PriceException() {
        super("The price of bread is too high! You have to make it cheaper.");
    }
}
