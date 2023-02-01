package de.telran.averchenko.elena.homework5.seawar;

public abstract class Player {
    SeaWarTable seaWarTable = new SeaWarTable();
    public abstract  int[][] putFourDeckShipToTheTable(int[][] initialArray);
    public abstract int[][] putThreeDeckShipToTheTable(int[][] initialArray);
    public abstract int[][] putTwoDeckShipToTheTable(int[][] initialArray);
    public abstract int[][] putOneDeckShipToTheTable(int[][] initialArray);


}
