package de.telran.averchenko.elena.homework4.banking;

public abstract class ATM {
        protected double availableSum;
        protected final String brandOfATM;

        public ATM(double availableSum, String brandOfATM) {
                this.availableSum = availableSum;
                this.brandOfATM = brandOfATM;
        }

        public abstract boolean checkThePin(CreditCard someCreditCard, int inputPin);
        public abstract double checkCard(CreditCard someCreditCard,int inputPin);
        public abstract void takeMoney(CreditCard someCreditCard, int inputPin, int sumToTake);
        public abstract void giveMoney(CreditCard someCreditCard,int inputPin, int sumToGive);

        public double getAvailableSum() {
                return availableSum;
        }

        public String getBrandOfATM() {
                return brandOfATM;
        }

        public void setAvailableSum(double availableSum) {
                this.availableSum = availableSum;
        }

        @Override
        public String toString() {
                return "ATM{" +
                        "availableSum=" + availableSum +
                        ", brandOfATM='" + brandOfATM + '\'' +
                        '}';
        }
}
