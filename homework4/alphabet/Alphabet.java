package de.telran.averchenko.elena.homework4.alphabet;

import de.telran.averchenko.elena.classwork3.enums.Month;

public enum Alphabet {
    A,
    B,
    C,
    D,
    E,
    F,
    G,
    H,
    I,
    J,
    K,
    L,
    M,
    N,
    O,
    P,
    Q,
    R,
    S,
    T,
    U,
    V,
    W,
    X,
    Y,
    Z;

    public static int getLetterNumberInEnum(Alphabet someLetter){
        Alphabet [] number = Alphabet.values();
        int j = 0;
        for (int i=0; i < number.length; i++) {
            if(someLetter.equals(number[i])){
                j = number[i].ordinal();
                System.out.printf(("The number of the %s letter in the Enum list is " + j + "\n"), someLetter);
                break;
            }
        }
        return j;

    }
    public static int getLetterNumber(Alphabet someLetter){
        Alphabet [] number = Alphabet.values();
        int j = 0;
        for (int i=0; i < number.length; i++) {
            if(someLetter.equals(number[i])){
                j = number[i].ordinal()+1;
                System.out.printf(("The real number of the %s letter in the alphabet is " + j + "\n"), someLetter);
                break;

            }
        }
        return j;

    }


}
