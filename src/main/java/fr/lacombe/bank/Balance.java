package fr.lacombe.bank;

public class Balance {
    private int balance;

    void decrease(Amount amount) {
        balance -= amount.getValue();
    }

    void increase(Amount amount) {
        balance += amount.getValue();
    }

    int getBalance() {
        return balance;
    }

    void resetBalance() {
        balance = 0;
    }
}
