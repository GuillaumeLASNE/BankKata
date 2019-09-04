package fr.lacombe.bank;

public class Balance {
    private Amount value;

    public Balance() {
        value = Amount.of(0);
    }

    void decrease(Amount amount) {
        value = value.decrease(amount);
    }

    void increase(Amount amount) {
        value = value.increase(amount);
    }

    int getBalance() {
        return value.getValue();
    }
}
