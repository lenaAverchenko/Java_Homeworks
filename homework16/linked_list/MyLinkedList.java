package de.telran.averchenko.elena.homework16.linked_list;

import de.telran.averchenko.elena.homework6.lists.MyList;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MyLinkedList <T> {


    List<T> list;


    public List<T> createMyList(){
        return new LinkedList<>();
    };




    public List<T> pickUpRandomElements(List<T> list,int number){
        List <T> pickedUpElements = new LinkedList<>();
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
