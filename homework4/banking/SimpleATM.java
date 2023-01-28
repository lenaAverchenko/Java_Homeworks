package de.telran.averchenko.elena.homework4.banking;

import java.util.Scanner;

public class SimpleATM extends ATM{
    public SimpleATM(double availableSum, String brandOfATM) {
        super(availableSum, brandOfATM);
    }


    @Override
    public boolean checkThePin(CreditCard someCreditCard, int inputPin){
        boolean checkResult = false;
        if(someCreditCard.getPin() == inputPin){
            checkResult = true;
        } else {
            checkResult = false;
            System.out.println("Wrong PIN. Try again");


        }
       return checkResult;

    };

    @Override
    public double checkCard(CreditCard someCreditCard,int inputPin){
        double percentageOfTheOperation = 0;
        if(checkThePin(someCreditCard,inputPin)) {
            if(brandOfATM.equals(someCreditCard.getBrand())){
                percentageOfTheOperation = 0.0;
            }
            else{
                percentageOfTheOperation = 0.02;
            }
        }
        return percentageOfTheOperation;

    };

    @Override
    public void takeMoney(CreditCard someCreditCard,int inputPin, int sumToTake){
        if (sumToTake>0){
        checkCard(someCreditCard,inputPin);
        double percentageOfTheOperation = checkCard(someCreditCard,inputPin);
        someCreditCard.deposit(inputPin, (sumToTake-sumToTake*percentageOfTheOperation));
        availableSum = availableSum + sumToTake + percentageOfTheOperation*sumToTake;}
        else {
            System.out.println("The input sum of money is not valid");
        }
    };

    @Override
    public void giveMoney(CreditCard someCreditCard,int inputPin, int sumToGive){
        if(sumToGive>0){
        checkCard(someCreditCard,inputPin);
        double percentageOfTheOperation = checkCard(someCreditCard,inputPin);
        if(availableSum >= sumToGive && sumToGive<=(someCreditCard.getBalance()+someCreditCard.getCreditLimitation()+sumToGive*percentageOfTheOperation)) {
            someCreditCard.withdraw(inputPin,(sumToGive+sumToGive*percentageOfTheOperation));
            availableSum = availableSum - sumToGive + percentageOfTheOperation*sumToGive;
        } else if (availableSum >= sumToGive && sumToGive>(someCreditCard.getBalance()+someCreditCard.getCreditLimitation()+ sumToGive*percentageOfTheOperation))
        {someCreditCard.withdraw(inputPin,(sumToGive+sumToGive*percentageOfTheOperation));

        } else if (availableSum < sumToGive){
            System.out.println("The ATM is out of Money");}
        }else{
            System.out.println("The input sum of money is not valid");
        }



    };


}
