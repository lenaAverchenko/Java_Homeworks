package de.telran.averchenko.elena.homework7.iterator;

import de.telran.averchenko.elena.classwork7.Sheet;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class NormalIterator implements Iterator<Integer> {
    protected int[] integers;
    private int currentIndex;

    public NormalIterator(int[] integers) {
        this.integers = integers;
        currentIndex = 0; //текущий индекс - начинаем с 0-элемента
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
