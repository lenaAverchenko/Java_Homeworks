package de.telran.averchenko.elena.homework4.tires;

public class PetrolAuto extends Auto{
    public PetrolAuto(int yearOfProduction, String brand, String model, String tireOne, String tireTwo, String tireThree, String tireFour) {
        super(yearOfProduction, brand, model, tireOne, tireTwo, tireThree, tireFour);
    }

    @Override
    public void drive(int speed){
        System.out.printf("I drive at the speed %d km/h \n", speed);
    };
}
