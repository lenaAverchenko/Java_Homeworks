package de.telran.averchenko.elena.homework7.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DimIterator implements Iterator<Integer> {
    protected int [][] dimArray;
    protected int initialStringIndex;
    protected int initialColumnIndex;

    public DimIterator(int[][] dimArray) {
        this.dimArray = dimArray;
        initialStringIndex = 0;
        initialColumnIndex = 0;
    }


    @Override
    public boolean hasNext() {
        return (initialStringIndex < dimArray.length && initialColumnIndex < dimArray.length);
    }

    @Override
    public Integer next() {
        if (!hasNext()){
            throw new NoSuchElementException("test");
        }
        int currentValue = dimArray[initialStringIndex][initialColumnIndex];
        if(initialColumnIndex < dimArray.length-1){
            currentValue = dimArray[initialStringIndex][initialColumnIndex];
            initialColumnIndex++;
        } else if(initialColumnIndex == dimArray.length-1){
            currentValue = dimArray[initialStringIndex][initialColumnIndex];
            initialStringIndex +=1;
            initialColumnIndex = 0;
        }
        return  currentValue;
    }


}
