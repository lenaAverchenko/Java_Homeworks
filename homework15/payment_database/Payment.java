package de.telran.averchenko.elena.homework15.payment_database;

public final class Payment {
    private final PaymentOption paymentOption;
    private final int sumOfPayment;

    public Payment(PaymentOption paymentOption, int sumOfPayment) {
        this.paymentOption = paymentOption;
        this.sumOfPayment = sumOfPayment;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentOption=" + paymentOption +
                ", sumOfPayment=" + sumOfPayment +
                '}';
    }
}
