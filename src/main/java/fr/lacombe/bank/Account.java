package fr.lacombe.bank;

public class Account {

    private Balance balance;

    public Account() {
        balance = new Balance();
        balance.resetBalance();
    }

    public int deposit(Amount amount) {
        balance.increase(amount);
        return balance.getBalance();
    }

    public int withdraw(Amount amount) {
        balance.decrease(amount);
        return balance.getBalance();
    }
}
