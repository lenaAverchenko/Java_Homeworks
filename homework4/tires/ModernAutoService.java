package de.telran.averchenko.elena.homework4.tires;

public class ModernAutoService extends AutoService {
    @Override
    public void changeTire (String resultOfTheCheck){
        if(resultOfTheCheck.equals("ok")){
            System.out.println("Your tires are ok");
        } else if(resultOfTheCheck.equals("change")) {
            System.out.println("We are changing your tires");
        }
        }


    @Override
    public void repair(boolean isBroken){
        if(isBroken) {
            System.out.println("The repair will take us a while");
        } else{
            System.out.println("Your car is in great condition");
        }


    }
}
