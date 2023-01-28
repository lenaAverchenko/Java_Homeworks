package de.telran.averchenko.elena.homework4.tires;

public abstract class AutoService implements AbleToChangeTires, AbleToRepairCars{

    public static String checkTires(Auto auto, String season) {
        String checkResult = "";
        if (auto.getTireOne().contains(season) && auto.getTireTwo().contains(season) && auto.getTireThree().contains(season) && auto.getTireFour().contains(season)){
            checkResult = "ok";
        } else {
            checkResult = "change";
        }
        return checkResult;
    }

    public abstract void changeTire (String resultOfTheCheck);



    public abstract void repair(boolean isBroken);



}
