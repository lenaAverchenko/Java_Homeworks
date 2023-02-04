package de.telran.averchenko.elena.homework6.lists;

import java.util.*;

public class MyArrayList extends MyList{

    public List createMyList(){
        List<Integer> list = new ArrayList<Integer>();
        return list;
    };





    @Override
    public List pickUpRandomElements(List list,int number){
        List pickedUpElements = new ArrayList<>();
        Random random = new Random();

        if (number > 0 && number < 1000000){
            for (int i = 0; i < number; i++) {
                pickedUpElements.add(list.get(random.nextInt(999999)));
            }
        }else{
            System.out.println("The number of elements to be picked up is incorrect");
        }
        return pickedUpElements;

    };

    public List createArrayList(int bound){
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < bound; i++) {
            list.add(random.nextInt(1000));
        }
        return list;
    }

    public int findWithBinarySearch(List<Integer> list, int intForSearch){
        int listStart = 0;
        int listEnd = list.size()-1;
        while (listStart<=listEnd){
            int middleIndexForSearch = (listStart + listEnd)/2;
            int startOfSearch = list.get(middleIndexForSearch);
            if (intForSearch == startOfSearch) {
                return middleIndexForSearch;
            }else if(intForSearch>startOfSearch) {
                listStart = middleIndexForSearch + 1;
            } else {
                listEnd = middleIndexForSearch -1;
            }

        }
//        return middleIndexForSearch;
        return 0;
    }

    public List createListInput (int amount) {
        List<Integer> listInput = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < amount; i++) {
            System.out.printf("Введите %d значение: \n",(i+1));
            listInput.add(scanner.nextInt());

        }
        return listInput;
    }

    public double calculateAverage (List<Integer> list){
        int sumOfElements = 0;
        for (int i = 0; i < list.size(); i++) {
            sumOfElements = sumOfElements + list.get(i);
        }

        double result = (sumOfElements/list.size())+ (((sumOfElements%list.size())*10/5)*0.1);

      return result;

    }

    public void sortElementsWithBubbleMethod(List<Integer> list){
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
        System.out.print(list);
    }


}
