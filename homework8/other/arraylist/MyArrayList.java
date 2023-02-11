package de.telran.averchenko.elena.homework8.other.arraylist;



import java.util.*;

public class MyArrayList implements List<Integer> {

    private int currentSize ;
//    private int counter;
    private int[] myArrayList = new int[currentSize];

    public MyArrayList() {
    }

// Task 3 level 1

    @Override
    public boolean add(Integer newValue) {
        int[] newArrayList = new int[currentSize+1];
        for (int i = 0; i < myArrayList.length; i++) {
            newArrayList[i] = myArrayList[i];
        }
        newArrayList[newArrayList.length-1] = newValue;
        this.myArrayList = newArrayList;
        currentSize++;
        return true;
    }

    @Override
    public int size() {
        return this.myArrayList.length;
    }

    @Override
    public boolean isEmpty() {
        boolean temp = true;
            if (myArrayList.length == 0){
                temp = true;
            }  else {
                temp = false;
            }
            return temp;

    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayListIterator(myArrayList);
    }

    @Override
    public void clear() {
        currentSize = 0;
        int[] newArrayList = new int[currentSize];
        myArrayList =  newArrayList;

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

        int [] tempArrayList = new int[myArrayList.length-1];
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

            temp = true;
        }else{
            temp = false;
        }
        return temp;
    }

    @Override
    public Integer remove(int index) {
        int prevValue = myArrayList[index];

        int [] tempArrayList = new int[myArrayList.length-1];

            for (int i = 0; i < index; i++) {
                tempArrayList[i] = myArrayList[i];
            }
            for (int i = index+1; i <myArrayList.length; i++) {
                tempArrayList[i-1] = myArrayList[i];
            }
            myArrayList = tempArrayList;
            currentSize = myArrayList.length;

        return prevValue;
    }

    @Override
    public void add(int index, Integer element) {
            int[] newArrayList = new int[size()+1];
            for (int i = 0; i < index; i++) {
                newArrayList[i] = myArrayList[i];
            }
            newArrayList[index] = element;
            for (int i = index; i <size(); i++) {
                newArrayList[i+1] = myArrayList[i];
            }
            myArrayList = newArrayList;
        currentSize = myArrayList.length;

     }

    // Task 1 level 3


    @Override
    public MyArrayList subList(int fromIndex, int toIndex) {
        // не сделала проверку, не выходят ли за границу индексы
        MyArrayList newSubList = new MyArrayList();
        int newLength = toIndex-fromIndex;
        int[] newArr = new int[size()+newLength];
        for (int i = fromIndex; i < toIndex; i++) {
            newArr[i-fromIndex] = myArrayList[i];
        }
        newSubList.myArrayList = newArr;
        newSubList.currentSize = newArr.length;

        return newSubList;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        boolean temp = false;
        MyArrayList someArrayList = (MyArrayList) c;
        MyArrayList copiedList = new MyArrayList();
        if(index<myArrayList.length && index>=0){
            for (int i = 0; i < index; i++) {
                copiedList.add(i,myArrayList[i]);
           }
        for (int i = 0; i < someArrayList.myArrayList.length; i++) {
                copiedList.add((index + i), someArrayList.myArrayList[i]);
        }
            for (int j = (index); j < (myArrayList.length) ; j++) {
                int currentPosition = j+someArrayList.myArrayList.length;
                copiedList.add(currentPosition,myArrayList[j]);
            }
        temp = true;
        } else {
            temp = false;
            throw new IndexOutOfBoundsException();
        }
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
        currentSize = myArrayList.length;

        return temp;
    }

    @Override
    public Object[] toArray() {
        Object[] newObj = new Object[myArrayList.length];
        for (int i = 0; i < myArrayList.length; i++) {
            newObj[i]= myArrayList[i];
        }
        return newObj;
    }


    @Override
    public boolean containsAll(Collection<?> c) {
        boolean temp = true;
        MyArrayList someArrayList = (MyArrayList) c;
        int[] res = new int[myArrayList.length];
        for (int i = 0; i < someArrayList.myArrayList.length; i++) {
            for (int j = 0; j < myArrayList.length; j++) {
                if (someArrayList.myArrayList[i]==myArrayList[j]){
                    break;
                }else{
                    res[j] = 1;
                }
                for (int k = 0; k < res.length; k++) {
                    if (res[k]==0){
                        temp = true;
                    break;
                    }else{
                        temp = false;
                    }
                }
            }
            if(!temp){
                break;
            }
        }
        return temp;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        MyArrayList someArrayList = (MyArrayList) c;
        int [] newInt = new int[myArrayList.length+1];
        for (int i = 0; i < myArrayList.length; i++) {
            newInt[i] = myArrayList[i];
        }
        addAll((newInt.length-1), someArrayList);
        return true;
    }



    @Override
    public boolean removeAll(Collection<?> c) {
        MyArrayList someArrayList = (MyArrayList) c;
        boolean temp = true;
        int[] newArr = myArrayList;
        for (int i = 0; i < someArrayList.myArrayList.length; i++) {
            do {remove(someArrayList.myArrayList[i]);
            } while (contains(someArrayList.myArrayList[i]));
        }
        if(myArrayList.length == newArr.length && contains(newArr)){
            temp = false;
        } else{temp = true;}

        return temp;
    }

    @Override
    public ListIterator<Integer> listIterator() {
        return new MyArrayListListIterator(myArrayList);
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        MyArrayList newArr = subList(index, myArrayList.length);
        return new MyArrayListListIterator(newArr.myArrayList);
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }


}
