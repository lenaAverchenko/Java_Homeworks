package de.telran.averchenko.elena.homework14.ways_graph;

import de.telran.averchenko.elena.classwork14.Graph;

import java.util.*;

public class WaysGraph {
    Map<Character, List<Side>> nodes = new TreeMap<>();

    public class Node {
        public char value;
        public List<Character> sides;

    }

    public class Side {
        public char from;
        public char to;

        public Side(char from, char to) {
            this.from = from;
            this.to = to;
        }
    }

    public void add (char from, char to){
        List<Side> currentNode = nodes.get(from);
        if (currentNode == null){
            currentNode = new ArrayList<>();
            nodes.put(from,currentNode);
        }
        currentNode.add(new Side(from, to));
            }

    public void findDFSWays(char from, char to){
        Character firstElement = from;
        int counter = 0;
        Stack<Character> elements = new Stack<>();
        elements.push(firstElement);
        while (!elements.isEmpty()){
            Character currentNodeChar = elements.pop();
            if (currentNodeChar == to){
                counter++;
                continue;
            }
                List<Side> sides = nodes.get(currentNodeChar);
                if (sides == null){
                    continue;
                }
                for(Side side:sides) {
                        elements.add(side.to);

            }
        }
        System.out.printf("There are %d ways from %s to %s \n",counter, from, to);


    }

}
