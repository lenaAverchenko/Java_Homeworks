package de.telran.averchenko.elena.homework6.seawar;

import java.util.Scanner;

public class HumanPlayer extends Player {
    private String name;

    public HumanPlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    Scanner scanner = new Scanner(System.in);

    //Выбрасывает исключения, поскольку нельзя рисовать корабль за пределами массива
    @Override
    public int[][] putFourDeckShipToTheTable(int[][] initialArray){
        System.out.println("The initial point is:");
        int initialPointI = scanner.nextInt();
        int initialPointJ = scanner.nextInt();
        System.out.println("Horizontal or Vertical (H / V)?");
        String d = scanner.nextLine();
        String decision = scanner.nextLine();
        if (decision.equals("V")){
                initialArray[initialPointI][initialPointJ] = 4;
                initialArray[initialPointI+1][initialPointJ] = 4;
                initialArray[initialPointI+2][initialPointJ] = 4;
                initialArray[initialPointI+3][initialPointJ] = 4;

        } else if(decision.equals("H")){

                initialArray[initialPointI][initialPointJ] = 4;
                initialArray[initialPointI][initialPointJ + 1] = 4;
                initialArray[initialPointI][initialPointJ + 2] = 4;
                initialArray[initialPointI][initialPointJ + 3] = 4;}

//        }else {
//            System.out.println("You haven't pick the right direction");
//            putFourDeckShipToTheTable(initialArray);
//        }
        return initialArray;
    }

    @Override
    public int[][] putThreeDeckShipToTheTable(int[][] initialArray){
        System.out.println("The initial point is:");
        int initialPointI = scanner.nextInt();
        int initialPointJ = scanner.nextInt();
        System.out.println("Horizontal or Vertical (H / V)?");
        String d = scanner.nextLine();
        String decision = scanner.nextLine();
        if (decision.equals("V")){
            for (int i = 0; i < 3; i++) {
                initialArray[initialPointI][initialPointJ] = 3;
                initialArray[initialPointI+1][initialPointJ] = 3;
                initialArray[initialPointI+2][initialPointJ] = 3;
            }
        } else if(decision.equals("H")){
            for (int i = 0; i < 3; i++) {
                initialArray[initialPointI][initialPointJ] = 3;
                initialArray[initialPointI][initialPointJ + 1] = 3;
                initialArray[initialPointI][initialPointJ + 2] = 3;
            }
        }else {
            System.out.println("You haven't pick the right direction");
            putThreeDeckShipToTheTable(initialArray);
        }
        return initialArray;
    }

    @Override
    public int[][] putTwoDeckShipToTheTable(int[][] initialArray){
        System.out.println("The initial point is:");
        int initialPointI = scanner.nextInt();
        int initialPointJ = scanner.nextInt();
        System.out.println("Horizontal or Vertical (H / V)?");
        String d = scanner.nextLine();
        String decision = scanner.nextLine();
        if (decision.equals("V")){
            for (int i = 0; i < 2; i++) {
                initialArray[initialPointI][initialPointJ] = 2;
                initialArray[initialPointI+1][initialPointJ] = 2;

            }
        } else if(decision.equals("H")){
            for (int i = 0; i < 2; i++) {
                initialArray[initialPointI][initialPointJ] = 2;
                initialArray[initialPointI][initialPointJ + 1] = 2;

            }
        }else {
            System.out.println("You haven't pick the right direction");
            putTwoDeckShipToTheTable(initialArray);
        }
        return initialArray;
    }

    @Override
    public int[][] putOneDeckShipToTheTable(int[][] initialArray){
        System.out.println("The initial point is:");
        int initialPointI = scanner.nextInt();
        int initialPointJ = scanner.nextInt();
                initialArray[initialPointI][initialPointJ] = 1;

        return initialArray;
    }

}

