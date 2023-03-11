package de.telran.averchenko.elena.homework16.arraylist;

import java.util.List;

public class ListGenNew <T extends Comparable<T>,K extends ListComparatorNew<T>> {
    List <T> list;
    ListComparatorNew<T> listComparatorNew;

    public ListGenNew(List<T> list, ListComparatorNew<T> listComparatorNew) {
        this.list = list;
        this.listComparatorNew = listComparatorNew;
    }

    public ListGenNew() {
    }

    public void add(T value){
        list.add(value);

    }

    public  void sort(){
        list.sort(listComparatorNew);
    }

    public T getMaxNew(){
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
