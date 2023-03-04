package de.telran.averchenko.elena.homework14.dimensional;

import de.telran.averchenko.elena.classwork14.Graph;

import java.util.*;

public class OrientedWeightedGraph {
    //    public int[][] array;
    public Node[][] arrOfNodes;

    public OrientedWeightedGraph(Node[][] arrOfNodes) {
        this.arrOfNodes = arrOfNodes;
    }

    public class Node {
        public int value;
        public List<Side> sides;

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", sides=" + sides +
                    '}';
        }

        public Node(int value, List<Side> sides) {
            this.value = value;
            this.sides = sides;
        }

        public int getValue() {
            return value;
        }

        public List<Side> getSidesByValue(int val) {
            List<Side> temp = null;
            if (val == this.getValue()) {
                temp = this.getSides();
            }
            return temp;
        }

        public List<Side> getSides() {
            return sides;
        }
    }

    public class Side {
        public int from;
        public int to;
        public int weight;

        @Override
        public String toString() {
            return "Side{" +
                    "from=" + from +
                    ", to=" + to +
                    ", weight=" + weight +
                    '}';
        }

        public Side(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;

        }

        public int getFrom() {
            return from;
        }
    }

//    public void  addValue(int from, int to, int weight) {
//        if (array[from][to] == 0) {
//            array[from][to] = weight;
//        }
//    }

    public void addElement(int from, int to, int weight) {
        if (arrOfNodes[from][to] == null) {
            List<Side> currentNodesSides = new ArrayList<>();
            arrOfNodes[from][to] = new Node(weight, currentNodesSides);
            currentNodesSides.add(new Side(from, to, weight));
        }
    }

    public void print() {
        for (int i = 0; i < arrOfNodes.length; i++) {
            for (int j = 0; j < arrOfNodes.length; j++) {
                if (arrOfNodes[i][j] != null) {
                    System.out.print(arrOfNodes[i][j].getValue() + " ");
                } else {
                    System.out.print(arrOfNodes[i][j] + " ");
                }

            }
            System.out.println();
        }


    }

    // Тут, по идее, надо бы делать не по значению в массиве, которое мы в консоль выводим (не по весу ребра), а по тому,
    // откуда стартует нода. Но оставлю так для проверки. Компаратор можен сравнивать ноды не по весу (значению ноды), а по
    // номеру узла - from. Закомментированный компаратор ставит узлы так, чтобы следующий был всегда впереди (как положено)
    // и вывод веса(7 3 9 4 5 6 2 1 8 10 ), а вот сами узлы стоят (0 1 2 3 4 5 6 7 8 9 )
    public void printTopo() {
        List<Node> tempNodes = new ArrayList<>();
        for (int i = 0; i < arrOfNodes.length; i++) {
            for (int j = 0; j < arrOfNodes.length; j++) {
                if (arrOfNodes[i][j] != null && !tempNodes.contains(arrOfNodes[i][j])) {
                    tempNodes.add(arrOfNodes[i][j]);
                }
            }
        }
        Collections.sort(tempNodes, new GraphComparator());
        for (int j = 0; j < tempNodes.size(); j++) {
            System.out.print(tempNodes.get(j).getValue() + " ");
        }
    }
    //  тут должна быть такая же проверка как в DFS. Если мы какую-то строку двумерного массива еще не проверили, то ее нужно
    // проверить, нет ли элементов не пустых. есл есть, то мы добавим в очередь (а в обходе в глубину - в стек) и значение
    // from, поскольку эту строку мы только проверяем, и to, а дальше по алгоритму уже знакомому
    public void printBFS() {
        Integer firstElement = null;
        Node tempNode = null;
        int i = 0;
        while (tempNode == null) {
            for (int k = 0; k < arrOfNodes.length; k++) {
                if (arrOfNodes[i][k] != null) {
                    tempNode = arrOfNodes[i][k];
                    firstElement = i;
                    break;
                }
            }
            i++;
        }
        System.out.println("first element is " + firstElement); // проверка
        Queue<Integer> elements = new ArrayDeque<>();
//        elements.add(firstElement);
//        for (int j = 0; j < arrOfNodes.length; j++) {
//            if (arrOfNodes[firstElement][j] != null) {
//                elements.add(j);
//            }
//        }
        boolean found = false;
        List<Integer> alreadyProcessed = new ArrayList<>();
        while (!elements.isEmpty()) {
            Integer currentNodeIndex = elements.poll();
            for (int j = 0; j < arrOfNodes.length; j++) {
                if (arrOfNodes[currentNodeIndex][j] != null) {
                    elements.add(j);
                    found = true;
                }
            }
            if (!alreadyProcessed.contains(currentNodeIndex)) {
                System.out.println(currentNodeIndex);
                alreadyProcessed.add(currentNodeIndex);
            }

        }
    }




    public Node findNodeByValue(int val) {
        Node temp = null;
        for (int i = 0; i < arrOfNodes.length; i++) {
            for (int j = 0; j < arrOfNodes.length; j++) {
                if (arrOfNodes[i][j] != null) {
                    if (arrOfNodes[i][j].getValue() == val) {
                        temp = arrOfNodes[i][j];
                        break;
                    }
                }
            }
        }
        return temp;
    }

    // Проблема в том, что, если больше нет перехода между элементами, но есть еще те, что мы не прошли, просто нет перехода
    // на другую строку(например, мы пришли в 0, и из него дорога уже никуда не ведет), то остаются непройденные элементы.
    // я думаю, тут должен быть сравниваемый массив, например, если мы в это строке еще не были(она не помечена как пройденная),
    // при этом в ней есть не null элементы, то нужно ще вывести и их. Но эта часть у меня отказывается работать, что-то делаю не так...
    // И, чем дальше я пишу код, тем сложнее он становится, и ничего не меняется
    public void printDFS() {
        Integer firstElement = null;
        Node tempNode = null;
        int i = 0;
        while (tempNode == null) {
            for (int k = 0; k < arrOfNodes.length; k++) {
                if (arrOfNodes[i][k] != null) {
                    tempNode = arrOfNodes[i][k];
                    firstElement = i;
                    break;
                }
            }
            i++;
        }
        System.out.println("first element is " + firstElement);

        int[] arrayOfStringsToCheck = new int[arrOfNodes.length];
        for (int j = 0; j < arrOfNodes.length; j++) {
            arrayOfStringsToCheck[j] = j;
        }

        Stack<Integer> elements = new Stack<>();
        elements.push(firstElement);
//        for (int j = 0; j < arrOfNodes.length; j++) {
//            if (arrOfNodes[firstElement][j]!= null){
//                elements.push(j);
//            }
//        }
//        boolean found = false;
        List<Boolean> found = new ArrayList<Boolean>();

        List<Integer> alreadyProcessed = new ArrayList<>();
        while (!elements.isEmpty()) {

            Integer currentNodeIndex = elements.pop();
            for (int j = 0; j < arrOfNodes.length; j++) {
                if (arrOfNodes[currentNodeIndex][j]!= null){
                    elements.push(j);
                    found.add(true);
                } else if (arrOfNodes[currentNodeIndex][j]== null) {
                    found.add(false);
                }
            }
            if (!alreadyProcessed.contains(currentNodeIndex)) {
                System.out.println(currentNodeIndex);
                alreadyProcessed.add(currentNodeIndex);
            }
            int tempInd = -1;
            if (!found.contains(true)){
                for (int j = 0; j < arrOfNodes.length; j++) {
                    if ( !alreadyProcessed.contains(arrayOfStringsToCheck[j])){
                        tempInd = j;
                       break;
                    }
                }
                boolean test = false;
                for (int j = 0; j < arrOfNodes.length; j++){
                    if (arrOfNodes[tempInd][j] != null){
                        test = true;
                        break;
                    }
                }
                if (test){
                    elements.push(tempInd);
                    for (int j = 0; j < arrOfNodes.length; j++){
                        if (arrOfNodes[tempInd][j] != null){
                            elements.push(j);
                        }
                    }
                }


        }


        }



    }
}







