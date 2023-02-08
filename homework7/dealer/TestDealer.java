package de.telran.averchenko.elena.homework7.dealer;

import java.util.Arrays;

public class TestDealer {
    public static void main(String[] args) {

        // Task 2 level 2

        Person ivan = new Person("Ivan");
        Person ola = new Person("Ola");
        Person anna = new Person("Anna");
        Person oleh = new Person("Oleh");
        Person genia = new Person("Genia");
        Person[] players = {ivan,ola,anna,oleh,genia};
        Table table = new Table(players);

        Cards[] cards = Cards.values();
        int numberOfPlayers = players.length;
        Dealer dealer = new Dealer(cards);

        // Простая раздача карт
        Person[] temporaryPers = null;
        while(dealer.hasNext()){
            temporaryPers = dealer.dealCards(players, cards);
            System.out.println(Arrays.toString(temporaryPers));
        }

        Cards temporary;

// Это будет бесконечный цикл, но без перетасовки карт.
        while(dealer.hasNextConstantly()){
            temporary = dealer.dealCardsConstantly(numberOfPlayers, cards);
            System.out.println(temporary);
        }






    }
}
