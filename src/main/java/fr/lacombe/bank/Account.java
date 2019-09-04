package fr.lacombe.bank;

public class Account {
    private int balance = 0;

    public int deposit(int deposedAmount) {
        balance += deposedAmount;
        return balance;
    }
}
