package de.telran.averchenko.elena.homework9;

import java.util.List;

public class BubbleMethodSort {

    public BubbleMethodSort() {
    }

    public List<Integer> sortElementsWithBubbleMethod(List<Integer> list){
        int temporaryValue = 0;
        int temporaryIndex = 0;
        for (int j = 0; j < list.size(); j++) {
            for (int i = 0; i < list.size() - j-1; i++) {
                if (list.get(i) > list.get(i+1)) {
                    temporaryIndex = i + 1;
                    temporaryValue = list.get(i);
                    list.set(i,list.get(i+1));
                    list.set(temporaryIndex,temporaryValue);
                } else {
                    temporaryValue = list.get(i+1);
                }
            }
        }
        return list;
    }
}
