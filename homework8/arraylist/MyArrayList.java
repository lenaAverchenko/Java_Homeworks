package de.telran.averchenko.elena.homework8.arraylist;



import de.telran.averchenko.elena.classwork8.list.MyList;

import java.util.*;

public class MyArrayList implements List<Integer> {

    // other.arraylist - законченный вариант без начального выделения места массиву

    // было бы намного проще, если бы этот начальный размер не задавать, а добавлять только по 1, тогда проблем вообще нет,
    // но я почитала в интернете принцип его работы, и начальная величина всегда задается, а увеличение при нехватке места
    // в массиве тоже происходит не на 1 элемент. Мне кажется, это нелогично. Без этого меньше проверок намного
    private int currentSize = 10;
    private int counter;
    private int[] myArrayList = new int[currentSize];

    public MyArrayList() {
    }

// Task 3 level 1

    @Override
    public boolean add(Integer newValue) {
        int[] newArrayList;
        if(counter >= currentSize){
        newArrayList = new int[currentSize+5];
        for (int i = 0; i < myArrayList.length; i++) {
            newArrayList[i] = myArrayList[i];
        }
        newArrayList[newArrayList.length-1] = newValue;
        this.myArrayList = newArrayList;
        }
        else{
            myArrayList[counter] = newValue;
        }
        currentSize = myArrayList.length;
        counter++;
        return true;
    }

    @Override
    public int size() {
        return this.counter;
    }

    @Override
    public boolean isEmpty() {
        boolean temp = true;
        for (int i = 0; i < myArrayList.length; i++) {
            if (myArrayList[i] != 0){
                temp = false;
            break;
            } else{
                temp = true;
            }
        }
        return temp;

    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayListIterator(myArrayList);
    }

    @Override
    public void clear() {
        currentSize = 10;
        int[] newArrayList = new int[currentSize];
        // можно и не чистить данные массива, потом его подчистит GarbageCollector, а тут просто создать новый
        //массив с данными по умолчанию 0;
//            for (int i = 0; i < myArrayList.length; i++) {
//                myArrayList[i] = 0;
//            }
        myArrayList =  newArrayList;
        counter = 0;
     }

    @Override
    public Integer get(int index) {
        return myArrayList[index];
    }

    @Override
    public Integer set(int index, Integer element) {
        int prevElement = myArrayList[index];
        myArrayList[index] = element;

        return prevElement;
    }

    @Override
    public boolean contains(Object o) {
        boolean temp = false;
        for (int i = 0; i < myArrayList.length; i++) {
            if (Objects.equals(o,myArrayList[i])){
                temp = true;
                break;
            } else{
                temp = false;
            }
        }
        return temp;
    }

    @Override
    public int indexOf(Object o) {
        int tempIndex = 0;
        for (int i = 0; i < myArrayList.length; i++) {
            if (Objects.equals(o,myArrayList[i])){
                tempIndex = i;
                break;
            } else{
                tempIndex = -1;
            }
        }
        return tempIndex;
    }

    @Override
    public int lastIndexOf(Object o) {
        int tempIndex = 0;
        for (int i = myArrayList.length-1; i >0 ; i--) {
            if (Objects.equals(o,myArrayList[i])){
                tempIndex = i;
                break;
            } else{
                tempIndex = -1;
            }
        }
        return tempIndex;
    }

    // Task 1 level 2

    @Override
    public boolean remove(Object o) {
        int tempIndex = 0;
        if(currentSize>10){
            tempIndex = currentSize - 1;
        }else{
            tempIndex = 10;
        }
        int [] tempArrayList = new int[tempIndex];
        boolean temp = true;
        if (contains(o)){
            int foundIndex = indexOf(o);
            for (int i = 0; i < foundIndex; i++) {
                tempArrayList[i] = myArrayList[i];
            }
            for (int i = foundIndex+1; i <myArrayList.length; i++) {
                tempArrayList[i-1] = myArrayList[i];
            }

            myArrayList = tempArrayList;
            currentSize = myArrayList.length;
            counter--;
            temp = true;
        }else{
            temp = false;
        }
        return temp;
    }

    @Override
    public Integer remove(int index) {
        int prevValue = myArrayList[index];
        int tempIndex = 0;
        if(currentSize>10){
            tempIndex = currentSize - 1;
        }else{
            tempIndex = 10;
        }
        int [] tempArrayList = new int[tempIndex];

            for (int i = 0; i < index; i++) {
                tempArrayList[i] = myArrayList[i];
            }
            for (int i = index+1; i <myArrayList.length; i++) {
                tempArrayList[i-1] = myArrayList[i];
            }
            myArrayList = tempArrayList;
            currentSize = myArrayList.length;
            counter--;

        return prevValue;
    }

    @Override
    public void add(int index, Integer element) {
        int[] newArrayList;
        if(counter >= currentSize){
            newArrayList = new int[currentSize+5];

            for (int i = 0; i < index; i++) {
                newArrayList[i] = myArrayList[i];
            }
            newArrayList[index] = element;
            for (int i = index; i <size(); i++) {
                newArrayList[i+1] = myArrayList[i];
            }
            myArrayList = newArrayList;
        } else{
            newArrayList = new int[currentSize];
            for (int i = 0; i < index; i++) {
                newArrayList[i] = myArrayList[i];
            }
            newArrayList[index] = element;
            for (int i = index; i <size(); i++) {
                newArrayList[i+1] = myArrayList[i];
            }
            myArrayList = newArrayList;}

        currentSize = myArrayList.length;
        counter++;
     }

    // Task 1 level 3


    @Override
    public MyArrayList subList(int fromIndex, int toIndex) {
        MyArrayList newSubList = new MyArrayList();
        int newLength = 0;
        if((toIndex-fromIndex)>=10){
            newLength = newLength+5;
        }else{
            newLength = 10;
        }
        int[] newArr = new int[newLength];

        for (int i = fromIndex; i < toIndex; i++) {
            newArr[i-fromIndex] = myArrayList[i];

        }
        newSubList.myArrayList = newArr;
        newSubList.currentSize = newArr.length;
        newSubList.counter = toIndex-fromIndex;

        return newSubList;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        boolean temp = false;
        MyArrayList someArrayList = (MyArrayList) c;
        MyArrayList copiedList = new MyArrayList();

        if(index<myArrayList.length){
            // тут тоже бы, по хорошем проверку надо на пустые значения, вопрос только, что делаеть, есть 0 был задуман.
            for (int i = 0; i < index; i++) {
                copiedList.add(i,myArrayList[i]);
           }
        for (int i = 0; i < someArrayList.myArrayList.length; i++) {
//            if (someArrayList.myArrayList[i] == 0) {

                // только из-за того, что длина, выделенная под массив изначально равно 10.
                // без этого легко можно было обойтись, не задавая начальную длину массива
            // но он отказывается работать, и я не могу понять, почему - где я вдруг в условии
            // выхожу за пределы?!
                copiedList.add((index + i), someArrayList.myArrayList[i]);
//            }
        }
            for (int j = (index); j < (myArrayList.length) ; j++) {
                int currentPosition = j+someArrayList.myArrayList.length-1;
                copiedList.add(currentPosition,myArrayList[j]);

            }
        temp = true;
        } else {
            temp = false;
            throw new IndexOutOfBoundsException();
        }
//        counter = myArrayList.length+someArrayList.myArrayList.length;
        myArrayList = copiedList.myArrayList;
        currentSize = myArrayList.length;
        return temp;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean temp = true;
        MyArrayList someArrayList = (MyArrayList) c;
        int[] listToCompare = someArrayList.myArrayList;
        MyArrayList changedArrayList = new MyArrayList();

        for (int i = 0; i < listToCompare.length; i++) {
            for (int j = 0; j < myArrayList.length; j++) {
                if(listToCompare[i]==myArrayList[j]){
                     changedArrayList.add(myArrayList[i]);
                    temp = true;
                }
                else {
                    temp = false;
                }

            }

        }

        myArrayList = changedArrayList.myArrayList;
        counter = 0;
        for (int i = 0; i < myArrayList.length; i++) {
            if (myArrayList[i]!=0){
                counter++;
            }

        }
        currentSize = myArrayList.length;

        return temp;
    }





    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }



    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }



    @Override
    public ListIterator<Integer> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return null;
    }


}
