package fr.lacombe.bank;

public final class Amount {
    private final int value;

    private Amount(int value) {
        this.value = value;
    }

    public static Amount of(int amount) {
        return new Amount(amount);
    }


    public int getValue() {
        return value;
    }
}
