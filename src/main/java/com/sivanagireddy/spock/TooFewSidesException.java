package com.sivanagireddy.spock;

public class TooFewSidesException extends RuntimeException {

    private final int sides;

    public TooFewSidesException(String msg, int sides) {
        super(msg);
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }
}
