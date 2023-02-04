package de.telran.averchenko.elena.homework6.seawar;

import de.telran.averchenko.elena.homework6.secretary.Person;

import java.util.Arrays;
import java.util.Scanner;

public class TestTheGame {
    public static void main(String[] args) {


        SeaWarTable seaWarTable = new SeaWarTable();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of first player:");
        String name1 = scanner.nextLine();
        System.out.println("Enter the name of second player:");
        String name2 = scanner.nextLine();
        HumanPlayer humanPlayer1 = new HumanPlayer(name1);
        HumanPlayer humanPlayer2 = new HumanPlayer(name2);
//        int[][] initialTable1 = seaWarTable.createSeaWarTable();
//        int[][] initialTable2 = seaWarTable.createSeaWarTable();
//        seaWarTable.showTheSeaWarTable(initialTable1);
//        System.out.println("");
//        seaWarTable.showTheSeaWarTable(initialTable2);
//        System.out.println("");
        PersonInTheGame personInTheGame1 = new PersonInTheGame(humanPlayer1,seaWarTable);
        PersonInTheGame personInTheGame2 = new PersonInTheGame(humanPlayer2,seaWarTable);
        int[][] table1 = personInTheGame1.initialiseTheTable(humanPlayer1,seaWarTable);
        seaWarTable.showTheSeaWarTable(table1);
        System.out.println("");
        int[][] table2 = personInTheGame2.initialiseTheTable(humanPlayer2,seaWarTable);
        seaWarTable.showTheSeaWarTable(table2);;
        System.out.println("");

        Game game = new Game();
        game.gameOn(humanPlayer1,humanPlayer2,table1,table2);







    }
}
