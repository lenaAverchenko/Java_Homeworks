package de.telran.averchenko.elena.homework6.lists;

import de.telran.averchenko.elena.homework5.arrays.LinearArray;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MyLinkedList extends MyList {


    public List createMyList(){
        List<Integer> list = new LinkedList<>();
        return list;
    };



    @Override
    public List pickUpRandomElements(List list,int number){
        List pickedUpElements = new LinkedList<>();
        Random random = new Random();
        if (number > 0 && number < 1000000){
            for (int i = 0; i < number; i++) {
                pickedUpElements.add(list.get(random.nextInt(999999)));
            }
        }else{
            System.out.println("The number of elements to be picked up is incorrect");
        }
        return pickedUpElements;

    };


}
