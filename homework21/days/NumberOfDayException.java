package de.telran.averchenko.elena.homework21.days;

public class NumberOfDayException extends Exception{

    public NumberOfDayException(int dayVal, int monthVal, String s, String monthName) {
        // task 2.1
//        super("Invalid input of day value");
        // task 2.2

        super ("You've provided the wrong day value: " + dayVal + ". In " + monthName + "  the possible values are between " + s);



    }
}
