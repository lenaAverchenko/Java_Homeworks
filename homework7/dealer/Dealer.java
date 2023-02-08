package de.telran.averchenko.elena.homework7.dealer;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Dealer implements Iterator<Cards> {

    protected Cards[] cards = Cards.values();
//    protected Deck deck = new Deck(cards);
    private int currentIndex = 0;
    protected int numberOfPlayers;
    protected int currentIndexOfPerson = 0;
    private Person[] players;
    protected Table table = new Table(players);
    protected int stopPoint = cards.length;

    public Dealer(Cards[] cards) {
        this.cards = cards;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < cards.length;
    }

    @Override
    public Cards next() {
        if (!hasNext()){
            throw new NoSuchElementException("test");
        }
        Cards current = cards[currentIndex];
        currentIndex++;
        return  current;

    }

    public Person[] dealCards(Person[] players, Cards[] cards){

        if (!hasNext()){
            throw new NoSuchElementException("test");
        }
        if(stopPoint > 0)

            if(currentIndexOfPerson>=players.length){
                currentIndexOfPerson = 0;
            }
            players[currentIndexOfPerson].numberOfCards +=1;
            stopPoint = stopPoint-1;
            Cards current = cards[currentIndex];
        currentIndexOfPerson++;
        currentIndex++;
        return  players;
    }

    public boolean hasNextConstantly() {
        return true;
    }
    public Cards dealCardsConstantly(int players, Cards[] cards) {
                Cards current = cards[currentIndex];
                int cardsNumber = 0;
                if (currentIndex >= cards.length-1) {
                    current = cards[currentIndex];
                    currentIndex = 0;
                }
                current = cards[currentIndex];
                currentIndex ++;
                cardsNumber ++;
                int cardsForOnePlayer = cardsNumber / players;

            return current;

    }

}
