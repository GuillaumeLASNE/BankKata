package fr.lacombe.bank;

public class Account {

    public Account() {
        Balance.resetBalance();
    }

    public int deposit(Amount amount) {
        Balance.increase(amount);
        return Balance.balance;
    }

    public int withdraw(Amount amount) {
        Balance.decrease(amount);
        return Balance.balance;
    }

}
