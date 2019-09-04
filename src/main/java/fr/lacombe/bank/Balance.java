package fr.lacombe.bank;

public class Balance {
    static int balance;

    static void resetBalance() {
        balance = 0;
    }

    static void decrease(Amount amount) {
        balance -= amount.getValue();
    }

    static void increase(Amount amount) {
        balance += amount.getValue();
    }
}
