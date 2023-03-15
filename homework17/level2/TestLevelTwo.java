package de.telran.averchenko.elena.homework17.level2;

import de.telran.averchenko.elena.homework17.square.SingleFunction;

public class TestLevelTwo {
    public static void main(String[] args) {

        //Level 2 Task 1

        FunctionDoubleRes functionDoubleRes = (x) -> ((3*x*x - 5*x + 2)/6+(((3*x*x - 5*x + 2)*1.0)%6)/6);
        System.out.println(functionDoubleRes.calculate(5));


        FunctionDoubleRes functionDoubleRes12 = (x) -> (Math.sqrt(x-(1/x +(1.0%x)/x)) + Math.sqrt(1-(1/x +(1.0%x)/x)));
        FunctionDoubleRes functionDoubleRes1 = (x) -> (Math.pow(x-(1/x +(1.0%x)/x),0.5) + Math.pow(1-(1/x +(1.0%x)/x),0.5));
        System.out.println(functionDoubleRes1.calculate(5));
        System.out.println(functionDoubleRes12.calculate(5));

        FunctionDoubleRes functionDoubleRes2 = (x) -> (Math.sqrt(3*x - 1) + Math.pow((1+x),2));
        System.out.println(functionDoubleRes2.calculate(5));

    }
}
