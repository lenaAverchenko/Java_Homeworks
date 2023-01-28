package de.telran.averchenko.elena.homework4.deal;

import java.util.Arrays;

public class CardDeck implements AbleToBeShuffled {
    protected Suits[] suits = Suits.values();
    protected Rank[] rank = Rank.values();
    final int numberOfCards = suits.length * rank.length; // number of cards

    public CardDeck(Suits[] suits, Rank[] rank) {
        this.suits = suits;
        this.rank = rank;
    }

    public CardDeck() {
    }

    // deck initialization
    public String[] initializeTheDeck() {
        String[] deck = new String[numberOfCards];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i] + " " + suits[j];
            }
        }
        return deck;
    }
    public void shuffleCards(CardDeck cardDeck){};


}
