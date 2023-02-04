package de.telran.averchenko.elena.homework6.seawar;

import java.util.Scanner;

public class Game {
    public boolean checkTheTable(int [][] table) {
        int newVal = 0;
        boolean resultOfSearch = true;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if(table[i][j] != 0){
                    newVal = newVal + 1;
                }
            }
        }
        if (newVal !=0){
        return true;
        }else {
            return false;
        }
    }
    public boolean makeAShot (HumanPlayer playerShooting, HumanPlayer playerWaiting, int[][] theTableForShooting, int[][] theTableWaitingForShooting){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Shoot to:");
        boolean yourTurn = true;
        int pointI = scanner.nextInt();
        int pointJ = scanner.nextInt();
        if(theTableForShooting[pointI][pointJ] != 0){
            System.out.println("Congratulations! The next move:");
            theTableForShooting[pointI][pointJ] = 0;
            yourTurn = true;
        } else if(theTableForShooting[pointI][pointJ] == 0){
            System.out.println("You've missed!");
            yourTurn = false;
        }
        return yourTurn;

    }


    public void gameOn(HumanPlayer player1, HumanPlayer player2,int[][] theTable1, int[][] theTable2){
        HumanPlayer currentShooter = player1;
        HumanPlayer currentWaitingPerson = player2;
        int[][] tableForShooting = theTable2;
        HumanPlayer temporaryVal = new HumanPlayer("");
        HumanPlayer temporaryVal1 = new HumanPlayer("");
        int[][] currantTableWaitind = theTable1;
        int[][] temporaryTable1 = new int[10][10];
        int[][] temporaryTable2 = new int[10][10];



        while (checkTheTable(theTable1) && checkTheTable(theTable2)){
            boolean whoseMove = makeAShot(currentShooter,currentWaitingPerson,tableForShooting, currantTableWaitind);
            if(whoseMove){
//                makeAShot(currentShooter,currentWaitingPerson,tableForShooting, currantTableWaitind);

            } else if(!whoseMove) {
                temporaryVal = currentShooter;
                temporaryVal1 = currentWaitingPerson;
                currentShooter = temporaryVal1;
                currentWaitingPerson = temporaryVal;
                temporaryTable1 = tableForShooting;
                temporaryTable2 = currantTableWaitind;
                tableForShooting = temporaryTable2;
                currantTableWaitind = temporaryTable1;
                makeAShot(currentShooter,currentWaitingPerson,tableForShooting, currantTableWaitind);
            }

        }
        if (checkTheTable(theTable1)==false){
            System.out.println(player1.getName() + " won!");

        }else if (checkTheTable(theTable2)==false){
            System.out.println(player2.getName() + " won!");

        }


    }
}
