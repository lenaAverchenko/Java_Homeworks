package de.telran.averchenko.elena.homework15.iterators;

import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        String str = "Mom is here";
        WordsIterator wordsIterator = new WordsIterator(str);
//        System.out.println(wordsIterator.countTheWords());
//        wordsIterator.createListOfStrings();

        CharIterator characterIterator = new CharIterator(wordsIterator);
        characterIterator.createListOfStrings();
        while(characterIterator.hasNext()){
            System.out.println(characterIterator.next());
        }


    }
}
