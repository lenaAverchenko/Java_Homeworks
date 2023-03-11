package de.telran.averchenko.elena.homework16.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyCollectionStarter <T extends Comparable<T>, K extends Collection<T>>{
    Collection<T> myCollection;
    ComparatorCollection<T> comparatorCollection = new ComparatorCollection<>();

    public MyCollectionStarter(Collection<T> myCollection) {
        this.myCollection = myCollection;
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
        return "MyCollectionStarter{" +
                "myCollection=" + myCollection +
                '}';
    }
}
