package de.telran.averchenko.elena.homework8.other.arraylist;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public class MyArrayListListIterator implements ListIterator<Integer> {
    protected int[] integers;
    private int currentIndex = -1; // мне кажется, что его мужно задать -1, тогда он ни на какой элемент не смотрит
    private int currentNext;
    private int currentPrev;

    public MyArrayListListIterator(int[] integers) {
        this.integers = integers;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < integers.length;

    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException("test");
        }
        int current = integers[currentIndex];
        currentIndex++;
        currentNext = current;
        currentPrev = -1;
        return current;

    }

    @Override
    public boolean hasPrevious() {
        return currentIndex != 0;
    }

    @Override
    public Integer previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException("test");
        }
        int current = integers[currentIndex];
        currentIndex--;
        currentNext = -1;
        currentPrev = current;
        return current;
    }

    @Override
    public int nextIndex() {
        if (!hasNext()) {
            throw new NoSuchElementException("test");
        }
        currentIndex++;
        return currentIndex;

    }

    @Override
    public int previousIndex() {
        if (!hasPrevious()) {
            throw new NoSuchElementException("test");
        }
        currentIndex--;
        return currentIndex;
    }

    @Override
    public void remove() {
        int[] newIntegers = new int[integers.length - 1];

        for (int i = 0; i < currentIndex; i++) {
            newIntegers[i] = integers[i];
        }
        for (int i = currentIndex; i < integers.length; i++) {
            newIntegers[i] = integers[i + 1];
        }
        integers = newIntegers;
        currentIndex = -1;
    }

    @Override
    public void set(Integer integer) {

        integers[currentIndex] = integer;
    }

    @Override
    public void add(Integer integer) {
        int[] newIntegers = new int[integers.length + 1];

        if (currentNext > 0) {
            for (int i = 0; i < currentIndex; i++) {
                newIntegers[i] = integers[i];
            }
            newIntegers[currentIndex] = integer;
            for (int i = currentIndex; i < integers.length; i++) {
                newIntegers[i + 1] = integers[i];
            }

        } else if (currentPrev > 0) {
            if (currentNext > 0) {
                for (int i = 0; i < currentIndex + 1; i++) {
                    newIntegers[i] = integers[i];
                }
                newIntegers[currentIndex + 1] = integer;
                for (int i = currentIndex + 1; i < integers.length; i++) {
                    newIntegers[i + 1] = integers[i];
                }
            }


        }
       integers = newIntegers;
    }
}
