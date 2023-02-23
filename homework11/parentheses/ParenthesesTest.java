package de.telran.averchenko.elena.homework11.parentheses;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ParenthesesTest {
    public static void main(String[] args) {

        // Level 2 task 2
        // ))))((((()  - The string is invalid!
        // ()()()() - The string is valid!
        // ((())) - The string is valid!
        // (((()()()()))) - The string is valid!
        // ))))(((( - The string is invalid!
        // ()()()( - The string is invalid!
        // ()()())( - The string is invalid!
        // )(()()()() - The string is invalid!
        //(((())(())) - The string is invalid!





        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your string of parentheses");
        String someString = scanner.nextLine();
        char[] charsOfString = someString.toCharArray();
        System.out.println(charsOfString.length);
        System.out.println(Arrays.toString(charsOfString));
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < charsOfString.length; i++) {
            stack.push(charsOfString[i]);
        }



        int amountOpeningPar = 0;
        int amountClosingPar = 0;
        char openPar = '(';
        char closePar = ')';
        boolean res = true;

        char tempChar = ' ';
        for (int i = 0; i < charsOfString.length; i++) {
            tempChar = stack.pop();
            if (Character.compare(tempChar, openPar)==0 && amountOpeningPar==0 && amountClosingPar==0){
                res = false;
                amountOpeningPar ++;
                break;
            } else if (Character.compare(tempChar, openPar)==0 && amountOpeningPar==amountClosingPar){
                res = false;
                amountOpeningPar ++;
                break;
            } else if (Character.compare(tempChar, closePar)==0){

                amountClosingPar ++;
            }else if (Character.compare(tempChar, openPar)==0 && amountClosingPar!=0){
                amountOpeningPar ++;
            }
        }


        if (amountOpeningPar == amountClosingPar && res){
            System.out.println("The string is valid!");
        }
        if (amountOpeningPar != amountClosingPar){
            System.out.println("The string is invalid!");
        }



    }
}
