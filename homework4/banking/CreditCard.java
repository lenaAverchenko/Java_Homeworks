package de.telran.averchenko.elena.homework4.banking;

import java.util.Scanner;

public class CreditCard {
    private final String cardNumber;
    private int pin;
    private double balance;
    private double creditLimitation;
    private double creditDebt;
    private String brand;

    public CreditCard(String cardNumber, int pin, double balance, double creditLimitation, double creditDebt, String brand) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.balance = balance;
        this.creditLimitation = creditLimitation;
        this.creditDebt = creditDebt;
        this.brand = brand;
    }

    public double getCreditLimitation() {
        return creditLimitation;
    }

    public String getBrand() {
        return brand;
    }

    public CreditCard(String cardNumber, int pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.creditDebt = 0;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditDebt() {
        return creditDebt;
    }

    public CreditCard(String cardNumber, int pin, double balance, int creditLimitation, double creditDebt) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.balance = balance;
        this.creditLimitation = creditLimitation;
        this.creditDebt = creditDebt;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", pin=" + pin +
                ", balance=" + balance +
                ", creditLimitation=" + creditLimitation +
                ", creditDebt=" + creditDebt +
                ", brand='" + brand + '\'' +
                '}';
    }

    protected void deposit(int localPin, double localDepositSum) {
        if(localDepositSum > 0){
        if (localPin != pin) {
//            System.out.println("Пин-код введен неверно! Операция отклонена.");
            return;
        }
//        System.out.println("Введите сумму для зачисления: ");

        double sumsDifference = localDepositSum - creditDebt;

        if (sumsDifference > 0) {
            this.creditLimitation = creditLimitation + creditDebt;
            this.creditDebt = 0;
            this.balance = sumsDifference + balance;
        } else {
            this.creditLimitation = creditLimitation + localDepositSum;
            this.creditDebt = -sumsDifference;

        }} else{
            System.out.println("The incorrect sum has been provided");
        }


}


    public void setCreditLimitation(double creditLimitation) {
        this.creditLimitation = creditLimitation;
    }

    protected void withdraw(int localPin,double localSum){
        if (localPin != pin) {
//            System.out.println("Пин-код введен неверно! Операция отклонена.");
            return;
        }

        if (localSum <= this.balance && localSum >=0){
            this.balance = balance - localSum;
        } else {
            double balanceDifference = localSum - balance;
            if (balanceDifference <= (creditLimitation + balance)) {
            this.balance = 0;
            creditDebt = balanceDifference + creditDebt;
            this.creditLimitation = creditLimitation - balanceDifference;
            System.out.println("Задолженность на счету составляет " + creditDebt);
                }
            else {
                System.out.println("Операция запрещена! Запрашиваемая сумма превышает кредитный лимит. Или сумма введена неверно");}

        }




    }
}
