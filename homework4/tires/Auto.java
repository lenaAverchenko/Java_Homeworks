package de.telran.averchenko.elena.homework4.tires;

import java.sql.SQLOutput;

public abstract class Auto implements Breakable,Driveable,Startable {
    protected int yearOfProduction;
    protected String brand;
    protected String model;
    public String tireOne;
    public String tireTwo;
    public String tireThree;
    public String tireFour;

    public Auto(int yearOfProduction, String brand, String model, String tireOne, String tireTwo, String tireThree, String tireFour) {
        this.yearOfProduction = yearOfProduction;
        this.brand = brand;
        this.model = model;
        this.tireOne = tireOne;
        this.tireTwo = tireTwo;
        this.tireThree = tireThree;
        this.tireFour = tireFour;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getTireOne() {
        return tireOne;
    }

    public String getTireTwo() {
        return tireTwo;
    }

    public String getTireThree() {
        return tireThree;
    }

    public String getTireFour() {
        return tireFour;
    }

    public Auto() {
    }

    @Override
    public boolean starts (boolean start) {
        boolean canStart = true;
        if(start){
//            System.out.println("I'll start, if you turn your key.");
            canStart = true;}
        else{
//            System.out.println("I can't start. Something is broken.");
            canStart = false;
        }
           return canStart;
    };
    @Override
    public boolean breaks (boolean canStart, boolean pumpedTire){
        boolean needSupport = false;
        if (!(canStart)  || !(pumpedTire)){
            System.out.println("Go to the Car Service!");
            needSupport = true;
            if((canStart)  && !(pumpedTire)){
                System.out.println("You have to check your tires!");
        }else if(!(canStart)  || (pumpedTire)){
                System.out.println("You're gonna need a repair");
            }
    } else if ((canStart)  && (pumpedTire)){
            System.out.println("You can drive safe");
            needSupport = false;
        }
        return needSupport;
    }


    public abstract void drive (int speed) ;




}
