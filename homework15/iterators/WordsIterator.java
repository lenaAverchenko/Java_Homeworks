package de.telran.averchenko.elena.homework15.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class WordsIterator implements Iterator<String> {
    protected String someWords;
    private int index;
    private  int lengthOfString;
    protected List<String> words = new ArrayList<>();


    public WordsIterator(String someWords) {
        this.someWords = someWords;
        index = 0;
    }

    // неполноценный счет слов, идеальное грамотное предложение
    public int countTheWords(){
        char [] arrayOfChars = someWords.toCharArray();
        lengthOfString = 0;
        for (int i = 1; i < arrayOfChars.length-1; i++) {
            if (arrayOfChars[i]==' '){
                lengthOfString++;
            }
        }
        if (lengthOfString>0){
            lengthOfString++;
        }
        return lengthOfString;
    }

    @Override
    public boolean hasNext() {
        return index <= words.size();
    }

    public void createListOfStrings(){
        char [] arrayOfChars = someWords.toCharArray();
        int tempIndex = 0;
            for (int i = 0; i < arrayOfChars.length-1; i++) {

                if (arrayOfChars[i] == ' ') {
                    words.add(someWords.substring(tempIndex, i));
                    tempIndex = i + 1;
                }
            }
        words.add(someWords.substring(tempIndex));
        System.out.println(words);
    }

    @Override
    public String next() {
        if (!hasNext()){
            throw new NoSuchElementException("error");
        }
        String currentWord = words.get(index);
        index++;

        return currentWord;
    }
}
