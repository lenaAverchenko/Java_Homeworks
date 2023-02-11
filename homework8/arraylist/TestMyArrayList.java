package de.telran.averchenko.elena.homework8.arraylist;




public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(3);
        myArrayList.add(5);
        myArrayList.add(10);
        myArrayList.add(8);
        myArrayList.add(4);
        myArrayList.add(6);
        myArrayList.add(4);

        System.out.println(myArrayList.size());
        MyArrayList myArrayList2 = new MyArrayList();
        myArrayList2.add(3);
        myArrayList2.add(77);
        myArrayList2.add(10);
        myArrayList2.add(8);
        myArrayList2.add(58);
        myArrayList2.add(6);
        myArrayList2.add(4);


        System.out.println(myArrayList.retainAll(myArrayList2));
        System.out.println(myArrayList.size());









//        myArrayList.add(20);
//        myArrayList.add(31);
//        myArrayList.add(5);
//        myArrayList.add(80);
//        myArrayList.add(1);
//        myArrayList.add(9);
//        myArrayList.add(8);
//        myArrayList.add(4);
//        myArrayList.add(20);
//        myArrayList.add(31);
//        myArrayList.add(5);
//        myArrayList.add(80);
//        myArrayList.add(1);
//        myArrayList.add(9);


        System.out.println(myArrayList.isEmpty());// returns false
        System.out.println(myArrayList.get(1)); // returns 5
        System.out.println(myArrayList.set(1,55));// returns 5
        System.out.println(myArrayList.get(1));// returns 55

        System.out.println(myArrayList.contains(10));
        System.out.println(myArrayList.contains(77));
        System.out.println(myArrayList.indexOf(10));
        System.out.println(myArrayList.indexOf(77));
        System.out.println(myArrayList.indexOf(4));
        System.out.println(myArrayList.lastIndexOf(4));
        System.out.println(myArrayList.lastIndexOf(77));

        Integer someValue = 4;
        Integer someValue1 = 88;
        System.out.println(myArrayList.remove(someValue));
        System.out.println(myArrayList.get(4));
        System.out.println(myArrayList.remove(someValue1));
        System.out.println(myArrayList.remove(2));
        System.out.println(myArrayList.get(2));
        System.out.println(myArrayList.get(1));
        myArrayList.add(1,9);
        System.out.println(myArrayList.get(1));

        System.out.println(myArrayList.subList(1,3).get(0));
        System.out.println(myArrayList.subList(1,3).get(1));

    }
}
