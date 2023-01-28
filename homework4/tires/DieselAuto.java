package de.telran.averchenko.elena.homework4.tires;

import javax.sound.midi.Soundbank;

public class DieselAuto extends Auto{
    public DieselAuto(int yearOfProduction, String brand, String model, String tireOne, String tireTwo, String tireThree, String tireFour) {
        super(yearOfProduction, brand, model, tireOne, tireTwo, tireThree, tireFour);
    }

    @Override
    public void drive(int speed){
        System.out.printf("I start easily and drive fast at the speed %d km/h \n", speed);
    };

}
