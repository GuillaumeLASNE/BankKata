package fr.lacombe.bank;

public final class Amount {
    private final int value;

    private Amount(int value) {
        this.value = value;
    }

    public static Amount of(int amount) {
        return new Amount(amount);
    }

    public Amount decrease(Amount amount){
        return new Amount(this.value - amount.value);
    }

    public int getValue() {
        return value;
    }

    public Amount increase(Amount amount) {
        return new Amount(value + amount.value);
    }
}
