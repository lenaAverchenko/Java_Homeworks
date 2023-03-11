package de.telran.averchenko.elena.homework16.collection;

import de.telran.averchenko.elena.homework16.arraylist.OneMoreNewComparator;

import java.util.*;

public class MyCollectionNew<S extends Comparable<S>, T extends Collection<S>,K extends ComparatorCollection<S>> {


    Collection<S> myCollection;
        ComparatorCollection<S> comparatorCollection;



    public MyCollectionNew(Collection<S> myCollection, ComparatorCollection<S> comparatorCollection) {
        this.myCollection = myCollection;
        this.comparatorCollection = comparatorCollection;
    }

    public MyCollectionNew() {
    }

    public void add(S value){
        myCollection.add(value);
        }




        public S getMax(){
                S maxVal = null;
                List<S> someValues = new ArrayList<>();
                someValues.addAll(myCollection);
                someValues.sort(comparatorCollection);
                maxVal = someValues.get(someValues.size()-1);
                return  maxVal;
        }

    @Override
    public String toString() {
        return "MyCollectionNew{" +
                "myCollection=" + myCollection +
                '}';
    }
}
