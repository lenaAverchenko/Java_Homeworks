package de.telran.averchenko.elena.homework5.seawar;

import java.util.Scanner;

public class HumanPlayer extends Player{
    Scanner scanner = new Scanner(System.in);

    //Выбрасывает исключения, поскольку нельзя рисовать корабль за пределами массива
    @Override
    public int[][] putFourDeckShipToTheTable(int[][] initialArray){

        int initialPointI = scanner.nextInt();
        int initialPointJ = scanner.nextInt();

        for (int i = 0; i < initialArray.length; i++) {
        if (initialArray[initialPointI][initialPointJ] == 0 && initialArray[initialPointI+1][initialPointJ] == 0 && initialArray[initialPointI+2][initialPointJ] == 0 && initialArray[initialPointI+3][initialPointJ] == 0){
            initialArray[initialPointI][initialPointJ] = 4;
            initialArray[initialPointI+1][initialPointJ] = 4;
            initialArray[initialPointI+2][initialPointJ] = 4;
            initialArray[initialPointI+3][initialPointJ] = 4;
            //можно сместить строчную координату, и нарисовать горизонтальный кораблик
        } else if (initialArray[initialPointI+1][initialPointJ] == 0 && initialArray[initialPointI+1][initialPointJ+1] == 0 && initialArray[initialPointI+1][initialPointJ+2] == 0 && initialArray[initialPointI+1][initialPointJ+3] == 0){
            initialArray[initialPointI][initialPointJ] = 4;
            initialArray[initialPointI][initialPointJ+1] = 4;
            initialArray[initialPointI][initialPointJ+2] = 4;
            initialArray[initialPointI][initialPointJ+3] = 4;


        }}
        return initialArray;
    }

    @Override
    public int[][] putThreeDeckShipToTheTable(int[][] initialArray){

        int initialPointI = scanner.nextInt();
        int initialPointJ = scanner.nextInt();

        for (int i = 0; i < initialArray.length; i++) {
                if (initialArray[initialPointI][initialPointJ] == 0 && initialArray[initialPointI+1][initialPointJ] == 0 &&initialArray[initialPointI+2][initialPointJ] == 0){
                    initialArray[initialPointI][initialPointJ] = 3;
                    initialArray[initialPointI+1][initialPointJ] = 3;
                    initialArray[initialPointI+2][initialPointJ] = 3;

                } else if (initialArray[initialPointI][initialPointJ] == 0 && initialArray[initialPointI][initialPointJ+1] == 0 &&initialArray[initialPointI][initialPointJ+2] == 0){
                    initialArray[initialPointI][initialPointJ] = 3;
                    initialArray[initialPointI][initialPointJ+1] = 3;
                    initialArray[initialPointI][initialPointJ+2] = 3;

                }
            }

        return initialArray;
    }

    @Override
    public int[][] putTwoDeckShipToTheTable(int[][] initialArray){

        int initialPointI = scanner.nextInt();
        int initialPointJ = scanner.nextInt();

        for (int i = 0; i < initialArray.length; i++) {
                if (initialArray[initialPointI][initialPointJ] == 0 && initialArray[initialPointI+1][initialPointJ] == 0){
                    initialArray[initialPointI][initialPointJ] = 2;
                    initialArray[initialPointI+1][initialPointJ] = 2;
                } else if (initialArray[initialPointI][initialPointJ] == 0 && initialArray[initialPointI][initialPointJ+1] == 0){
                    initialArray[initialPointI][initialPointJ] = 2;
                    initialArray[initialPointI][initialPointJ+1] = 2;
                }
            }

        return initialArray;
    }

    @Override
    public int[][] putOneDeckShipToTheTable(int[][] initialArray){

        int initialPointI = scanner.nextInt();
        int initialPointJ = scanner.nextInt();

        for (int i = 0; i < initialArray.length; i++) {

                if (initialArray[initialPointI][initialPointJ] == 0){
                    initialArray[initialPointI][initialPointJ] = 1;
            }
        }
        return initialArray;
    }

}

