package de.telran.averchenko.elena.homework16.list;

import java.util.List;

public class ListOfElements <T extends Comparable<T>> {


    List<T> list;

    public void add(T value){
        list.add(value);

    }

    public ListOfElements(List<T> list) {
        this.list = list;
    }

    public T getMax(){
        T tempVal = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(tempVal)>0){
                tempVal = list.get(i);
            }
        }
        return tempVal;
    }

}
