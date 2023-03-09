package de.telran.averchenko.elena.homework15.payment_database;

import java.util.Objects;

public final class Account {
    private final int accountSum;

    private final Person whoPaid;
    private final Payment payment;

    public Account(int accountSum, Person whoPaid, Payment payment) {
        this.accountSum = accountSum;
        this.whoPaid = new Person(whoPaid.name, whoPaid.surname);
        this.payment = payment;
    }

    public int getAccountSum() {
        return accountSum;
    }

    public Person getWhoPaid() {
        return new Person(whoPaid.name, whoPaid.surname);
    }

    public Payment getPayment() {
        return payment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountSum == account.accountSum && Objects.equals(whoPaid, account.whoPaid) && Objects.equals(payment, account.payment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSum, whoPaid, payment);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountSum=" + accountSum +
                ", whoPaid=" + whoPaid +
                ", payment=" + payment +
                '}';
    }
}
