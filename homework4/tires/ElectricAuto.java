package de.telran.averchenko.elena.homework4.tires;

public class ElectricAuto extends Auto{
    public ElectricAuto(int yearOfProduction, String brand, String model, String tireOne, String tireTwo, String tireThree, String tireFour) {
        super(yearOfProduction, brand, model, tireOne, tireTwo, tireThree, tireFour);
    }

    @Override
    public void drive(int speed){
        System.out.printf("I start easily and drive fast at the speed %d km/h. I'm an eco-friendly and quiet car \n", speed);
    };
}
