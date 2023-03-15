package de.telran.averchenko.elena.homework17.square;

public class Test {
    public static void main(String[] args) {

        //Level 1 Task 7

        // Это была бы анонимная функция, реализующая наш функциональный интерфейс
//        SingleFunction singleFunction = new SingleFunction() {
//            @Override
//            public int powerByTwo(int x) {
//                return x * x;
//            }
//        };

        // Лямбда выражение
        SingleFunction singleFunction = (x) -> x*x;
        for (int i = 1; i <= 10; i++) {
            System.out.println(singleFunction.calculate(i));
        }
        System.out.println("_______________________________________");

        //Level 1 Task 8
        SingleFunction singleFunction2 = (x) -> (x*x - 8*x + 12);
        for (int i = 0; i <= 10; i++) {
            System.out.println(singleFunction2.calculate(i));
        }

        System.out.println("_______________________________________");

        SingleFunction singleFunction3 = (x) -> (5*x*x + 3*x + 7);
        for (int i = 0; i <= 10; i++) {
            System.out.println(singleFunction3.calculate(i));
        }

        System.out.println("_______________________________________");


        SingleFunction singleFunction4 = (x) -> (x*x - 6*x + 9);
        for (int i = 0; i <= 10; i++) {
            System.out.println(singleFunction3.calculate(i));
        }

        System.out.println("_______________________________________");
    }
}
