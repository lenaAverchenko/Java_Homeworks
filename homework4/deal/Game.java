package de.telran.averchenko.elena.homework4.deal;

import java.util.Random;
import java.util.Scanner;

public class Game extends CardDeck {
    //предположительно, колода карт может бть одна, а разновидности игр разные. Значит, раздавать карты можно на любую
    //игру, но метод раздачи будет разный
    int players;
    final int cardsForPlayer = 5;

    public Game(Suits[] suits, Rank[] rank, int players) {
        super(suits, rank);
        this.players = players;
    }

    public Game(int players) {
        this.players = players;
    }
    public Game() {

    }


    public void checkTheProvidedNumberOfPlayers (int numberOfCards){
        final Scanner sc = new Scanner(System.in);
                while (true) {
        System.out.println("Enter the number of players: ");
        if (sc.hasNext()) {
            players = sc.nextInt();
            if (cardsForPlayer * players <= numberOfCards) {
                break;
            } else {
                if (players == 0) {
                    System.out.println("The game has been terminated.");
                    break;
                } else if (players < 0) {
                    System.out.println("The number of players cannot be less than 0");
                } else {
                    System.out.println("Too many players!");
                }
            }
        } else {
            System.out.println("You have not entered a number, or your number is too large!");
        }
    }}
@Override
    public void shuffleCards(CardDeck cardDeck){
    final Random random = new Random();
    String[] deck = cardDeck.initializeTheDeck();
    for (int i = 0; i < numberOfCards; i++) {
        int card = i + (random.nextInt(numberOfCards - i)); // random card in the deck
        String temp = deck[card];
        deck[card] = deck[i];
        deck[i] = temp;
    }
}

    // the shuffled deck is displayed
    public void displayTheShuffledDesk(CardDeck cardDeck) {
        for (int i = 0; i < players * cardsForPlayer; i++) {
            System.out.println(cardDeck.initializeTheDeck()[i]);
            if (i % cardsForPlayer == cardsForPlayer - 1)
                System.out.println();
        }
    }

}
