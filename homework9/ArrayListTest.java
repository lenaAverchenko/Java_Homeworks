package de.telran.averchenko.elena.homework9;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {

        //Уровень 2 задание 1

        List<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            arrayList.add(random.nextInt(10));
        }
        System.out.println(arrayList);

        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        //Элементы будут отсортированы
        for (Integer element:arrayList) {
            treeSet.add(element);

        }

        for (Integer element:arrayList) {
            hashSet.add(element);

        }
// будет соблюден порядок добавления элементов
        for (Integer element:arrayList) {
            linkedHashSet.add(element);

        }


        System.out.println("treeSet");
        System.out.println(treeSet);
        System.out.println("hashSet");
        System.out.println(hashSet);
        System.out.println("linkedHashSet");
        System.out.println(linkedHashSet);

        List<Integer> arrayListFromTreeSet = new ArrayList<>();
        List<Integer> arrayListFromHashSet = new ArrayList<>();
        List<Integer> arrayListFromLinkedHashSet = new ArrayList<>();

        for (Integer element:treeSet) {
            arrayListFromTreeSet.add(element);

        }

        for (Integer element:hashSet) {
            arrayListFromHashSet.add(element);

        }

        for (Integer element:linkedHashSet) {
            arrayListFromLinkedHashSet.add(element);

        }

        System.out.println("arrayListFromTreeSet");
        System.out.println(arrayListFromTreeSet);
        System.out.println("arrayListFromHashSet");
        System.out.println(arrayListFromHashSet);
        System.out.println("arrayListFromLinkedHashSet");
        System.out.println(arrayListFromLinkedHashSet);



        //Уровень 2 задание 2
        int k = 6;

        List<Integer> arrayListNew = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayListNew.add(random.nextInt(10));
        }
        System.out.println(arrayListNew);

        List<Integer> completeArrayListNew = new ArrayList<>();
        for (int i = arrayListNew.size() - k; i < arrayListNew.size(); i++) {
            completeArrayListNew.add(arrayListNew.get(i));
        }
        for (int i = 0; i < arrayListNew.size() - k; i++) {
            completeArrayListNew.add(arrayListNew.get(i));
        }
        System.out.println(completeArrayListNew);

        //Другой вариант, проще:

        List<Integer> arrayListNewPart1 = arrayListNew.subList(arrayListNew.size() - k,arrayListNew.size());
        List<Integer> arrayListNewPart2 = arrayListNew.subList(0,arrayListNew.size() - k);
        arrayListNewPart1.addAll(arrayListNewPart2);
        System.out.println(arrayListNewPart1);




    }
}
