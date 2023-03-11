//package de.telran.averchenko.elena.homework16;
//
//import java.util.*;
//
//public class Graph <T,K> {
//    Map<T,List<K>> nodes = new TreeMap<>();
//
//
//
//    /**
//     * вершина графа
//     * */
//    public class Node<K>{
//        private int value;
//        private List<K> edges;
//    }
//    /**
//     * ребро графа
//     * */
//    public class Edge{
//        private int from;
//        private int to;
//        private  int weight;
//
//        public Edge(int from, int to) {
//            this.from = from;
//            this.to = to;
//        }
//
//        public Edge(int from, int to, int weight) {
//            this.from = from;
//            this.to = to;
//            this.weight = weight;
//        }
//    }
//
//    public void  add(int from, int to, int weight){
//        List<K> connectedNodes = nodes.get(from);
//        if (connectedNodes == null){
//            connectedNodes = new ArrayList<>();
//            nodes.put(from, connectedNodes);
//        }
//        connectedNodes.add(new Edge(from,to,weight));
////        connectedNodes1.add(new Edge(from, to));
////        List<Edge> connectedNodes2 = nodes.get(from);
////        if (to!=from){
////            if (connectedNodes2 == null){
////                connectedNodes2 = new ArrayList<>();
////                nodes.put(to, connectedNodes2);
////            }
////            connectedNodes2.add(new Edge(to, from));
////        }
//
//    }
//    public void print() {
////        for (Integer key : nodes.keySet()) {
////            List<Edge> connectedNodes = nodes.get(key);
////            for (Edge connectedNode : connectedNodes) {
////                System.out.printf("%s -> %s", nodes.get(key), connectedNode);
////            }
//            for (Map.Entry<Integer, List<Edge>> entry : nodes.entrySet()) {
//
//                for (Edge connectedNode : entry.getValue()) {
//                    System.out.printf("%s -> %s -> %s\n", connectedNode.from, connectedNode.weight, connectedNode.to);
//                }
//
////            }
//
//        }
//
//    }
//
//
//    public void printBFS(){
//        Integer firstElement = nodes.keySet().iterator().next();
//        Queue<Integer> elements = new ArrayDeque<>();
//        elements.add(firstElement);
//        List<Integer> alreadyProcessed = new ArrayList<>();
//        while (!elements.isEmpty()){
//            Integer currentNodeIndex = elements.poll();
//            if (!alreadyProcessed.contains(currentNodeIndex)){
//            System.out.println(currentNodeIndex);
//            alreadyProcessed.add(currentNodeIndex);
//            List<Edge> edges = nodes.get(currentNodeIndex);
//            if (edges == null){
//                continue;
//            }
//            for(Edge edge:edges){
//
//                elements.add(edge.to);}
//
//            }
//        }
//
//
//    }
//
//    public void printDFS(){
//        Integer firstElement = nodes.keySet().iterator().next();
//        Stack<Integer> elements = new Stack<>();
//        elements.push(firstElement);
//        List<Integer> alreadyProcessed = new ArrayList<>();
//        while (!elements.isEmpty()){
//            Integer currentNodeIndex = elements.pop();
//            if (!alreadyProcessed.contains(currentNodeIndex)){
//            System.out.println(currentNodeIndex);
//            alreadyProcessed.add(currentNodeIndex);
//            List<Edge> edges = nodes.get(currentNodeIndex);
//            if (edges == null){
//                continue;
//            }
//            for(Edge edge:edges) {
//                if (!alreadyProcessed.contains(edge.to)) {
//                    elements.add(edge.to);
//                }
//            }
//            }
//        }
//
//
//    }
//    public void findCycles(){
//        List<Integer> nodesIndexes = new ArrayList<>(nodes.keySet());
//        Collections.sort(nodesIndexes);
////        Integer max = Collections.max(nodesIndexes);
//        int[] colors = new int[10];
//        // 0 - white
//        // 1 - grey
//        // 2 - black
//    for(Integer key:nodes.keySet()){
//        if (colors[key] == 0){
//            findCycle(key,colors);
//        }
//    }
//
//
//
//    }
//    public boolean findCycle(int nodeIndex, int[] colors){
//        colors[nodeIndex] = 1;
//        boolean isCycle = false;
//        List<Edge> edges = nodes.get(nodeIndex);
//        if (edges!=null){
//        for (Edge edge:edges) {
//            if(colors[edge.to]==0){
//                isCycle = findCycle(edge.to,colors);
//            } else if (colors[edge.to]==1){
//                System.out.println("Cycle is found");
//                isCycle = true;
//            }
//        }
//        }
//        colors[nodeIndex] = 2;
//        if (isCycle){
//            System.out.println(nodeIndex);
//        }
//        return isCycle;
//    }
//}
