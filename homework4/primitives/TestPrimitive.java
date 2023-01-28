package de.telran.averchenko.elena.homework4.primitives;

public class TestPrimitive {
    public static void main(String[] args) {
        Five five = new Five();
        System.out.println("The initial value of the 'a' is " + five.a);
        five.add(8); // просто для примера - отработка метода
        int g = five.add(8); // запись результата обработки метода
        System.out.println("The value of the 'a' after adding method is " + five.a);
        System.out.println("The result of the adding method is " + g);


    }
}
