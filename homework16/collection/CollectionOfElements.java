package de.telran.averchenko.elena.homework16.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class CollectionOfElements <T extends Comparable<T>>{

    Collection<T> collection;
    ComparatorCollection<T> comparatorCollection = new ComparatorCollection<>();


    public CollectionOfElements(Collection<T> collection) {
        this.collection = collection;
    }

    public CollectionOfElements() {
    }


    public void add(T value){
        collection.add(value);

    }


    public T getMax(){
        T maxVal = null;
        List<T> someValues = new ArrayList<>();
        someValues.addAll(collection);
        someValues.sort(comparatorCollection);
        maxVal = someValues.get(someValues.size()-1);
        return  maxVal;
    }

    @Override
    public String toString() {
        return "CollectionOfElements{" +
                "collection=" + collection +
                '}';
    }
}
