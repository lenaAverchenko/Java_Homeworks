package de.telran.averchenko.elena.homework3.interfaces;

public class DanceFloor {
    public static void main(String[] args) {

        Danceble firstDancer = new Dancer();
        Danceble secondDancer = new PopDancer();
        Danceble thirdDancer = new PopSinger();
        Danceble fourthDancer = new Dancer();
        Danceble fifthDancer = new PopDancer();
        Danceble sixthDancer = new PopSinger();



        Danceble[] danceable = {firstDancer, secondDancer, thirdDancer, fourthDancer, fifthDancer, sixthDancer};
        for (int l=0; l< danceable.length; l++){
            danceable[l].dance("rumba");
        }

    }
}
