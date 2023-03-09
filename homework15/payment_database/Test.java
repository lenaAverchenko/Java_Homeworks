package de.telran.averchenko.elena.homework15.payment_database;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        PaymentDatabase database = new PaymentDatabase();
        Person person = new Person("Lew", "Tolstoy");
        Person person1 = new Person("Kot", "Kotov");
        Account account = new Account(1000,person,new Payment(PaymentOption.CARD,500));
        Account account1 = new Account(100,person1,new Payment(PaymentOption.CASH,20));
        Map<Account,Person> databaseOfPayments = new HashMap<>();
        databaseOfPayments.put(account, person);
        databaseOfPayments.put(account1, person1);
        System.out.println(databaseOfPayments.get(account));

        person.setName("Dima");
        System.out.println(databaseOfPayments.get(account));

        database.setPaymentDatabase(databaseOfPayments);

        System.out.println(database.getPaymentDatabase().get(account));

        person.setName("Misha");
        System.out.println(database.getPaymentDatabase().get(account));



    }
}
