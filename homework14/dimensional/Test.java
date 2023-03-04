package de.telran.averchenko.elena.homework14.dimensional;

public class Test {
    public static void main(String[] args) {

        // Level 2 Task 1

        OrientedWeightedGraph.Node[][] testArray = new OrientedWeightedGraph.Node[10][10];
        OrientedWeightedGraph orientedWeightedGraph = new OrientedWeightedGraph(testArray);
        orientedWeightedGraph.addElement(1,2,3);
        orientedWeightedGraph.addElement(2,5,4);
        orientedWeightedGraph.addElement(3,4,5);
        orientedWeightedGraph.addElement(8,3,10);
        orientedWeightedGraph.addElement(1,6,9);
        orientedWeightedGraph.addElement(6,7,1);
        orientedWeightedGraph.addElement(3,5,6);
        orientedWeightedGraph.addElement(7,8,8);
        orientedWeightedGraph.addElement(0,7,7);
        orientedWeightedGraph.addElement(4,9,2);
//        orientedWeightedGraph.print();
//        orientedWeightedGraph.printTopo();


        //Level 2 task 3
        orientedWeightedGraph.printDFS();
//        System.out.println();
        orientedWeightedGraph.printBFS();
    }
}
