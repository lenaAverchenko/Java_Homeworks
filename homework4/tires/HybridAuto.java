package de.telran.averchenko.elena.homework4.tires;

public class HybridAuto extends ElectricAuto {


    public HybridAuto(int yearOfProduction, String brand, String model, String tireOne, String tireTwo, String tireThree, String tireFour) {
        super(yearOfProduction, brand, model, tireOne, tireTwo, tireThree, tireFour);
    }

    @Override
    public void drive(int speed){
        if (speed<=20){
            System.out.printf("I drive at the speed %d km/h. I'm an eco-friendly and quiet car \n", speed);
        } else if (speed > 20) {
        System.out.printf("I drive at the speed %d km/h. I'm an eco-friendly, but I have to use petrol now \n", speed);
    }
}}
