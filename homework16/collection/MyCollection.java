package de.telran.averchenko.elena.homework16.collection;

import de.telran.averchenko.elena.homework16.arraylist.ListComparatorNew;

import java.util.*;

public class MyCollection<T extends Comparable<T>,K extends ComparatorCollection<T>> {
    Collection<T> myCollection;
    ComparatorCollection<T> comparatorCollection;





    public MyCollection(Collection<T> collection, ComparatorCollection<T> comparatorCollection) {
        this.myCollection = collection;
        this.comparatorCollection = comparatorCollection;
    }

    public MyCollection() {
    }

    public void add(T value){
        myCollection.add(value);
    }


    public T getMax(){
        T maxVal = null;
        List<T> someValues = new ArrayList<>();
        someValues.addAll(myCollection);
        someValues.sort(comparatorCollection);
        maxVal = someValues.get(someValues.size()-1);
        return  maxVal;
        }


    @Override
    public String toString() {
        return "MyCollection{" +
                "myCollection=" + myCollection +
                '}';
    }
}
