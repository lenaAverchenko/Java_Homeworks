package de.telran.averchenko.elena.homework13.from_classwork13;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tree {
    private Node root;

    public Tree() {
    }

    //Очень сложная для меня логика, до конца так и не поняла... Плюс, у меня печать 2 раза корневого узла
    public void printDfs(){
       Stack<Node> stack = new Stack<>();
        stack.add(root);
        Node currentNode = root;
        while(!stack.isEmpty()){
            if (currentNode !=null){
                stack.push(currentNode);
                currentNode = currentNode.left;

            } else{
                currentNode = stack.pop();
                System.out.println(currentNode.key);
                currentNode = currentNode.right;
            }

        }

    }

    public void printBfs(){
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node currentNode = queue.poll();
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
        Queue<Node> currentLineNodes = new LinkedList<>();
        currentLineNodes.add(root);
        Queue<Node> nextLineNodes = new LinkedList<>();
        int gap = 32;
        boolean hasChildren = false;
            for (int i = 0; i < gap; i++) {
                System.out.print(" ");
            }
        while (!currentLineNodes.isEmpty()){
            Node currentNode = currentLineNodes.poll();
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





    public boolean add(int value){
        Node currentNode = new Node();
        currentNode.key = value;
        if (root == null){
            root = currentNode;
            return  true;
        } else {
            Node comparingNode = root;
            while (comparingNode != null) {
                if (comparingNode.key < value) {
                    if (comparingNode.right == null){
                    comparingNode.right = currentNode;
                    return  true;}
                    comparingNode = comparingNode.right;
                } else if (comparingNode.key > value) {
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

    private static class Node{
        private Node left;
        private Node right;
        private int key;


    }


}
