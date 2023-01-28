package de.telran.averchenko.elena.homework4.banking;

import java.util.Scanner;

public class TestCreditCart {
    public static void main(String[] args) {
        CreditCard vasiaCreditCard = new CreditCard("00001212585836391258", 1258, 1000,1000,0);

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите пин-код: ");
//        int localPin = scanner.nextInt();

//        //Делаю много методов для проверки снятия и зачисления разных сумм
//        System.out.println(vasiaCreditCard.toString());
//        vasiaCreditCard.withdraw(localPin);
//        System.out.println(vasiaCreditCard.toString());
//        vasiaCreditCard.withdraw(localPin);
//        System.out.println(vasiaCreditCard.toString());
//        vasiaCreditCard.withdraw(localPin);
//        System.out.println(vasiaCreditCard.toString());
//        vasiaCreditCard.withdraw(localPin);
//        System.out.println(vasiaCreditCard.toString());
//
//        vasiaCreditCard.deposit(localPin);
//        System.out.println(vasiaCreditCard.toString());
//        vasiaCreditCard.deposit(localPin);
//        System.out.println(vasiaCreditCard.toString());
//        vasiaCreditCard.deposit(localPin);
//        System.out.println(vasiaCreditCard.toString());
//        vasiaCreditCard.deposit(localPin);
//        System.out.println(vasiaCreditCard.toString());
//
//
//        System.out.println("Меняем кредитный лимит");
//        vasiaCreditCard.setCreditLimitation(5000);
//        System.out.println(vasiaCreditCard.toString());
//        vasiaCreditCard.withdraw(localPin);
//        System.out.println(vasiaCreditCard.toString());
//        vasiaCreditCard.withdraw(localPin);
//        System.out.println(vasiaCreditCard.toString());
//
//
//        vasiaCreditCard.deposit(localPin);
//        System.out.println(vasiaCreditCard.toString());
//        vasiaCreditCard.deposit(localPin);
//        System.out.println(vasiaCreditCard.toString());

        CreditCard saniaCreditCard = new CreditCard("00001212585836391259", 5858, 1000,1000,0,"Santander");
        CreditCard oliaCreditCard = new CreditCard("00001212585836391258", 1258, 1000,1000,0,"Millenium");

        SimpleATM simpleATM = new SimpleATM(10000, "Millenium");
        System.out.println(simpleATM.checkCard(saniaCreditCard,5858));
        System.out.println(simpleATM.checkCard(saniaCreditCard,5858));
        System.out.println(simpleATM.checkCard(oliaCreditCard,1258));
        System.out.println(simpleATM.checkCard(oliaCreditCard,5858));

        System.out.println("_____________");
        System.out.println(simpleATM.checkThePin(saniaCreditCard,5858));
        System.out.println(simpleATM.checkThePin(saniaCreditCard,1255));
        System.out.println(simpleATM.checkThePin(oliaCreditCard,5858));
        System.out.println(simpleATM.checkThePin(oliaCreditCard,1255));

        System.out.println("_____________");
        System.out.println(simpleATM);
        System.out.println(oliaCreditCard);
        System.out.println("Введите сумму, которую хотите снять: ");
        int sumToWithdraw = scanner.nextInt();
        simpleATM.giveMoney(oliaCreditCard,1258,sumToWithdraw);
        System.out.println(simpleATM);
        System.out.println(oliaCreditCard);
        System.out.println("Введите сумму, которую хотите снять: ");
        int sumToWithdraw1 = scanner.nextInt();
        simpleATM.giveMoney(oliaCreditCard,1258,sumToWithdraw1);
        System.out.println(simpleATM);
        System.out.println(oliaCreditCard);
        System.out.println("Введите сумму, которую хотите снять: ");
        int sumToWithdraw2 = scanner.nextInt();
        simpleATM.giveMoney(oliaCreditCard,1111,sumToWithdraw2);
        System.out.println(simpleATM);
        System.out.println(oliaCreditCard);
        simpleATM.giveMoney(oliaCreditCard,1111,-1000);
        System.out.println(simpleATM);
        System.out.println(oliaCreditCard);

        System.out.println("_____________");
        System.out.println("Введите сумму, которую хотите внести: ");
        int sumToPut = scanner.nextInt();
        simpleATM.takeMoney(oliaCreditCard,1258,sumToPut);
        System.out.println(simpleATM);
        System.out.println(oliaCreditCard);
        System.out.println("Введите сумму, которую хотите внести: ");
        int sumToPut1 = scanner.nextInt();
        simpleATM.takeMoney(oliaCreditCard,1258,sumToPut1);
        System.out.println(simpleATM);
        System.out.println(oliaCreditCard);
        simpleATM.takeMoney(oliaCreditCard,1258,-130);
        System.out.println(simpleATM);
        System.out.println(oliaCreditCard);
        simpleATM.takeMoney(oliaCreditCard,1222,1000);
        System.out.println(simpleATM);
        System.out.println(oliaCreditCard);


        System.out.println("With the percentage_____________");
        System.out.println(simpleATM);
        System.out.println(saniaCreditCard);
        System.out.println("Введите сумму, которую хотите снять: ");
        int sumToWithdrawS = scanner.nextInt();
        simpleATM.giveMoney(saniaCreditCard,5858,sumToWithdrawS);
        System.out.println(simpleATM);
        System.out.println(saniaCreditCard);

        System.out.println("Введите сумму, которую хотите внести: ");
        int sumToPutS = scanner.nextInt();
        simpleATM.takeMoney(saniaCreditCard,5858,sumToPutS);
        System.out.println(simpleATM);
        System.out.println(saniaCreditCard);





    }



}
