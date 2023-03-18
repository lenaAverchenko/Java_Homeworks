package de.telran.averchenko.elena.homework18;


import de.telran.averchenko.elena.homework17.level2.FunctionDoubleRes;

import java.util.*;

import java.util.function.Function;


public class LastNameTest {
    public static void main(String[] args) {
        // Level 2 Task 2
        //Возможно, я неверное поняла задание. Слишком все просто...
        List<String> list = List.of("Jason", "Golf", "Edv", "Jasons", "Hoft", "Freeman", "Half", "Jacobs", "Albov", "Strou");
        Set<String> set = new HashSet<>();
        set.add("Jason");
        set.add("Golf");
        set.add("Edv");
        set.add("Jasons");
        set.add("Hoft");
        set.add("Freeman");
        set.add("Half");
        set.add("Jacobs");
        set.add("Albov");
        set.add("Strou");

        System.out.println(list.stream().filter(s-> Objects.equals(s.charAt(0), 'J')).toList());
        System.out.println(set.stream().filter(s-> Objects.equals(s.charAt(0), 'J')).toList());
        System.out.println("______________________________________________");

        // Level 2 Task 3

        String string = "test";
        Function<String, String> toUpperCase = s -> s.toUpperCase().charAt(0)+s.substring(1,s.length());
        System.out.println(toUpperCase.apply(string));


        // Level 2 Task 4

        Function<Integer, Integer> function = (x) -> ((5*x*x + 3*x + 7));
        for (int i = 0; i < 10; i++) {
            System.out.println(calculateIfNotNull(function, i));
            System.out.println(calculateIfNotFour(function,i));
            System.out.println(calculateIfNotSix(function,i));
            System.out.println("_________________________________");
        }
        System.out.println(calculateIfNotNull(function, null));
        System.out.println(calculateIfNotFour(function,null));
        System.out.println(calculateIfNotSix(function,null));




    }
    public static int calculateIfNotNull(Function<Integer,Integer> func, Integer value){
        Optional<Integer> notNullVal = Optional.ofNullable(value);
        return notNullVal.map(s -> func.apply(value)).orElse(0);


//        if (notNullVal.isPresent()){
//            return func.apply(value);
//        } else{return 0;}

    }



    public static int calculateIfNotFour(Function<Integer,Integer> func, Integer value){
        Optional<Integer> notNullVal = Optional.ofNullable(value);
        return notNullVal.filter(v->v>4).map(s -> func.apply(value)).orElse(0);

//        if (notNullVal.filter(v->v>4).isPresent()){
//            return func.apply(value);
//        } else {return 0;}

    }

    public static int calculateIfNotSix(Function<Integer,Integer> func, Integer value){
        Optional<Integer> notNullVal = Optional.ofNullable(value);
        return notNullVal.filter(v->v>6).map(s -> func.apply(value)-6).orElse(notNullVal.map(s -> s*s).orElse(0));


//        if (notNullVal.filter(v->v>6).isPresent()){
//            return func.apply(value)-6;
//        } else if (notNullVal.isEmpty()) {
//            return 0;
//        } else {return value*value;}

    }


}
