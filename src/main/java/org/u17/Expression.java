package org.u17;

public interface Expression {
    Money reduce(Bank bank, String to);
}
