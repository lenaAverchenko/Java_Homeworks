package de.telran.averchenko.elena.homework17.level2;

public class GeronTest {
    public static void main(String[] args) {
        GeronFunc geronFunc = (a,b,c) -> {
            double p = (a+b+c)/2 + (((a + b + c) % 2)*1.0)/2;
            return Math.sqrt(Math.abs(p*(p-a)*(p-b)*(p-c)));
        };
        System.out.println(geronFunc.calculate(3,4,5));
        System.out.println(geronFunc.calculate(4,5,6));
        System.out.println(geronFunc.calculate(10,5,6));
    }
}
