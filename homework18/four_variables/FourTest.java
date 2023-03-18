package de.telran.averchenko.elena.homework18.four_variables;

public class FourTest {
    public static void main(String[] args) {

        //Level 1 Task 12
        FunctionForFour<Double> gravity = (G, m1, m2, r) -> {
            //F = G*m1*m2/(r*r) - гравитационная сила
            double f = G*m1*m2 /Math.pow(r,2);
                 return f;
        };
//        double G = 0.0667/1000000000; - верная G
        double G = 6.67;
        System.out.println(gravity.calculate(G, 10.0,5.0,5.0) + " * 10^-11");
    }
}
