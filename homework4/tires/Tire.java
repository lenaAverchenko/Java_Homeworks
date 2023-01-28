package de.telran.averchenko.elena.homework4.tires;

import jdk.dynalink.beans.StaticClass;

public abstract class Tire {

    public static String theTireIs(String theSeasonIs){
        String seasonTire = "";
        if (theSeasonIs.equals("summer")){
            seasonTire = "Summer Tire";
        } else if (theSeasonIs.equals("winter")){
            seasonTire = "Winter Tire";
        }
        return seasonTire;
    };
}
