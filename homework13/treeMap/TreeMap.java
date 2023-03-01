//package de.telran.averchenko.elena.homework13.treeMap;
//
//import de.telran.averchenko.elena.homework13.from_classwork13.Tree;
//
//import java.util.ArrayDeque;
//import java.util.Deque;
//import java.util.Queue;
//
//public class TreeMap {
//    Node root;
//
//    public TreeMap() {
//    }
//
//    public boolean add(int value, String strVal){
//        TreeMap.Node currentNode = new TreeMap.Node();
//        currentNode.key = value;
//        currentNode.str = strVal;
//        TreeMap.Node comparingNode = root;
//        if (root == null){
//            root = currentNode;
//            return  true;
//        } else {
//            while (comparingNode != null) {
//                if (comparingNode.key < value) {
//                    if (comparingNode.right == null){
//                        comparingNode.right = currentNode;
//                        return  true;}
//                    comparingNode = comparingNode.right;
//                } else if (comparingNode.key > value) {
//                    if (comparingNode.left == null){
//                        comparingNode.left = currentNode;
//                        return  true;}
//                    comparingNode = comparingNode.left;
//                } else {
//                    return false;
//                }
//            }
//        }
//        return  false;
//    }

//    public void printReversedTree(){
//        if (root == null){
//            return;
//        }
//        Queue<Node> queue = new ArrayDeque<>();
//        queue.add(root);
//        Deque<Node> deque = new ArrayDeque<>();
//        queue.add(root);
//        Node currentNode = root;
//        Node prevNode = null;
//
//        while(currentNode!=null){
//            currentNode = queue.poll();
//            deque.add(temp);
//            if (currentNode.left != null){
//                queue.add(currentNode.left);
//            }
//            if (currentNode.right != null){
//                queue.add(currentNode.right);
//            }


//        }

//    }


//    protected class Node{
//        TreeMap.Node left;
//        TreeMap.Node right;
//        int key;
//        String str;
//
//        public Node(int key, String str) {
//            this.key = key;
//            this.str = str;
//        }
//
//        public int getKey() {
//            return key;
//        }
//
//        public String getStr() {
//            return str;
//        }
//
//        public Node() {
//        }
//    }
//}
