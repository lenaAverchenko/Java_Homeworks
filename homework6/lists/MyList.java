package de.telran.averchenko.elena.homework6.lists;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public abstract  class  MyList {

    public List createList(List list, int numberOfElements){
        Random random = new Random();
        for (int i = 0; i < numberOfElements; i++) {
            list.add(random.nextInt(1000000));
        };
        return list;
    };

    public List addMillionElements(List list){
//        List<Integer> newList = new LinkedList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            list.add(random.nextInt(1000000));
        };
        return list;
    }

    public abstract List pickUpRandomElements(List list,int number);

    void getTimeForPickUpRandomElements(List list,int number){
        long before = System.currentTimeMillis();
        pickUpRandomElements(list, number);
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    };


}
