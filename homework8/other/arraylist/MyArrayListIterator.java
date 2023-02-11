package de.telran.averchenko.elena.homework8.other.arraylist;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayListIterator implements Iterator<Integer> {
    protected int[] integers;
    private int currentIndex;


    public MyArrayListIterator(int[] integers) {
        this.integers = integers;
        currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < integers.length;

    }

    @Override
    public Integer next() {
        if (!hasNext()){
            throw new NoSuchElementException("test");
        }
        int current = integers[currentIndex];
        currentIndex++;
        return  current;

    }
}
