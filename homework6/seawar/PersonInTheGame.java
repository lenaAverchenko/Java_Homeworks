package de.telran.averchenko.elena.homework6.seawar;

import java.util.Scanner;

public class PersonInTheGame {
    protected HumanPlayer player;

    public SeaWarTable seaWarTable;
    protected int point;

    public PersonInTheGame(HumanPlayer player, SeaWarTable seaWarTable) {
        this.player = player;
        this.seaWarTable = seaWarTable;

    }

    public int[][] initialiseTheTable(HumanPlayer player, SeaWarTable seaWarTable){
        int [][] theTable = seaWarTable.createSeaWarTable();
        int a [][] = player.putFourDeckShipToTheTable(theTable);
        int b [][] = player.putThreeDeckShipToTheTable(a);
        int c [][] = player.putThreeDeckShipToTheTable(b);
        int d [][] = player.putTwoDeckShipToTheTable(c);
        int e [][] = player.putTwoDeckShipToTheTable(d);
        int f [][] = player.putTwoDeckShipToTheTable(e);
        int g [][] = player.putOneDeckShipToTheTable(f);
        int h [][] = player.putOneDeckShipToTheTable(g);
        int i [][] = player.putOneDeckShipToTheTable(h);
        int j [][] = player.putOneDeckShipToTheTable(i);

        return j;

    }



}
