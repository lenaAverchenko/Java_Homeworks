package de.telran.averchenko.elena.homework14.dimensional;

import java.util.Comparator;

public class GraphComparator implements Comparator<OrientedWeightedGraph.Node> {
    @Override
    public int compare(OrientedWeightedGraph.Node o1, OrientedWeightedGraph.Node o2) {
        return Integer.compare(o1.getValue(),o2.getValue());
    }

//    public int compare(OrientedWeightedGraph.Node o1, OrientedWeightedGraph.Node o2) {
//        return Integer.compare(o1.getSides().get(0).from,o2.getSides().get(0).from);
//    }
}
