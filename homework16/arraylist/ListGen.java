package de.telran.averchenko.elena.homework16.arraylist;

import java.util.List;

public class ListGen<T extends Comparable<T>> {

    List <T> list;
    ListComparator<T> listComparator;

    public ListGen(List<T> list, ListComparator<T> listComparator) {
        this.list = list;
        this.listComparator = listComparator;
    }

    public ListGen() {
    }

    public void add(T value){
        list.add(value);

    }

    public  void sort(){
        list.sort(listComparator);
    }

    public T getMax(){
        sort();
        return list.get(list.size()-1);
    }

    @Override
    public String toString() {
        return "ListGen{" +
                "list=" + list +
                '}';
    }
}
