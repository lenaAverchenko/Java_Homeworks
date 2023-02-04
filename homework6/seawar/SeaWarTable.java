package de.telran.averchenko.elena.homework6.seawar;

public class SeaWarTable {
    protected final int[] fourDeckShip = {4,4,4,4};
    protected final int[] threeDeckShipFirst = {3,3,3};
    protected final int[] threeDeckShipSecond = {3,3,3};
    protected final int[] twoDeckShipFirst = {2,2};
    protected final int[] twoDeckShipSecond = {2,2};
    protected final int[] twoDeckShipThird = {2,2};
    protected final int[] oneDeckShipFirst = {2,2};
    protected final int[] oneDeckShipSecond = {2,2};
    protected final int[] oneDeckShipThird = {2,2};
    protected final int[] oneDeckShipFourth = {2,2};



    public int[][] createSeaWarTable() {
        int[][] newSeaWarTable = new int[10][10];
        for (int i = 0; i < newSeaWarTable.length; i++) {
            for (int j = 0; j < newSeaWarTable.length; j++) {
                newSeaWarTable[i][j] = 0;
            }

        }
        return newSeaWarTable;
    }

    public void showTheSeaWarTable(int[][] integers) {
        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers.length; j++) {
                System.out.print(integers[i][j] + " ");
            }
            System.out.println("");
        }

    }


}
