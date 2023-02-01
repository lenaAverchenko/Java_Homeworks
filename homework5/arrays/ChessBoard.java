package de.telran.averchenko.elena.homework5.arrays;

public class ChessBoard extends MyArray {
    //Если заменить 0 и 1 в присваивании значения ячейке массива на " " и 0 или 1, то результат будет тот же
    public int[][] createChessBoard () {
        int[][] array = new int[8][8];
        for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if(i%2 != 0){
                        if (j % 2 == 0) {
                            array[i][j] = 0;
                     } else {
                        array[i][j] = 1;
                    }}else{if (j % 2 == 0) {
                        array[i][j] = 1;}else {
                        array[i][j] = 0;}
                    }

                }
            }
        return array;

}}
