package fr.lacombe.bank;

public class Account {
    private int balance = 0;

    public int deposit(Amount amount) {
        balance += amount.getValue();
        return balance;
    }
}
