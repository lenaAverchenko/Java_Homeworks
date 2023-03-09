package de.telran.averchenko.elena.homework15.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class CharIterator implements Iterator<Character> {
//    protected char[] someWord;
//    private  String someString;
    private int currentIndex = 0;
    private WordsIterator wordsIterator;
    private int numberOfChars;
    private String currentWord;

//Выводит, но первое слово дважды, а я не вижу, где я его всунула 2 раза,и последний символ потеряла

    public CharIterator(WordsIterator wordsIterator) {
        this.wordsIterator = wordsIterator;
    }

    public void createListOfStrings(){
        wordsIterator.createListOfStrings();
        currentWord = wordsIterator.words.get(0);
    }
    @Override
    public boolean hasNext() {

        for (int i = 0; i < wordsIterator.words.size(); i++) {
            numberOfChars = numberOfChars + wordsIterator.words.get(i).toCharArray().length;
        }
        return currentIndex < numberOfChars;
    }

    @Override
    public Character next() {
        if(!hasNext()){
            throw new NoSuchElementException("error");
        }

        char currentChar = currentWord.toCharArray()[currentIndex];
        currentIndex ++;

        if (currentIndex>=currentWord.length() && wordsIterator.hasNext()){
            currentIndex =0;

            currentWord = wordsIterator.next();

        }
//        if(!wordsIterator.hasNext()){
//            throw new NoSuchElementException("error");
//        }

        return currentChar;
    }
}
