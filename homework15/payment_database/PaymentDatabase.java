package de.telran.averchenko.elena.homework15.payment_database;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PaymentDatabase {
    private Map<Account, Person> paymentDatabase = new HashMap<>();

    public void setPaymentDatabase(Map<Account, Person> paymentDatabase) {
        this.paymentDatabase = paymentDatabase;
    }

    public Map<Account, Person> getPaymentDatabase() {
        return paymentDatabase;
    }


}
