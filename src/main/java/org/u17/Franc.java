package org.u17;

public class Franc extends Money {
    private String currenry;

    Franc(int amount) {
        this.amount = amount;
        this.currenry = "CHF";
    }

    String currency() {
        return currenry;
    }

    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
