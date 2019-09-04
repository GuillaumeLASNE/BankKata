package fr.lacombe.bank;

public class Balance {
    private int balance;

    public Balance() {
        balance = 0;
    }

    void decrease(Amount amount) {
        balance -= amount.getValue();
    }

    void increase(Amount amount) {
        balance += amount.getValue();
    }

    int getBalance() {
        return balance;
    }
}
