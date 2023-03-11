package de.telran.averchenko.elena.homework16;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Tree <T extends Comparable<T>> {
    private Node<T> root;
    TComparator<T> tComparator = new TComparator<>();


    public Tree() {
    }

    public void printBfs(){
        Queue<Node<T>> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node<T> currentNode = queue.poll();
            System.out.println(currentNode.key);
            if (currentNode.left !=null){
                queue.add(currentNode.left);
            }
            if (currentNode.right !=null){
                queue.add(currentNode.right);
            }

            }

        }

        public void print(){
        Queue<Node<T>> currentLineNodes = new LinkedList<>();
        currentLineNodes.add(root);
        Queue<Node<T>> nextLineNodes = new LinkedList<>();
        int gap = 32;
        boolean hasChildren = false;
            for (int i = 0; i < gap; i++) {
                System.out.print(" ");
            }
        while (!currentLineNodes.isEmpty()){
            Node<T> currentNode = currentLineNodes.poll();
            for (int i = 0; i < gap; i++) {
                System.out.print(" ");
            }
            if (currentNode!=null){
                System.out.print(currentNode.key);
                nextLineNodes.add(currentNode.left);
                nextLineNodes.add(currentNode.right);
                hasChildren = hasChildren || currentNode.left!= null || currentNode.right !=null;
            } else{
                nextLineNodes.add(null);
                nextLineNodes.add(null);
                System.out.print("_");
            }

            for (int i = 0; i < gap*2; i++) {
                System.out.print(" ");
            }
            if (currentLineNodes.isEmpty()){
                if (!hasChildren){
                    break;
                }
                hasChildren = false;
                System.out.println();
                gap = gap/2;
                for (int i = 0; i < gap; i++) {
                    System.out.print(" ");
                }
            currentLineNodes = nextLineNodes;
            nextLineNodes = new LinkedList<>();

            }
        }
        }





    public boolean add(T value){
        Node<T> currentNode = new Node<>();
        currentNode.key = value;
        if (root == null){
            root = currentNode;
            return  true;
        } else {
            Node<T> comparingNode = root;
            while (comparingNode != null) {
                if (tComparator.compare(comparingNode.key,value) < 0) {
                    if (comparingNode.right == null){
                    comparingNode.right = currentNode;
                    return  true;}
                    comparingNode = comparingNode.right;
                } else if (tComparator.compare(comparingNode.key,value) > 0) {
                    if (comparingNode.left == null){
                        comparingNode.left = currentNode;
                        return  true;}
                    comparingNode = comparingNode.left;
                } else {
                    return false;
                }
            }
        }
        return  false;
    }

    private static class Node<T>{
        private Node<T> left;
        private Node<T> right;
        private T key;



    }


}
