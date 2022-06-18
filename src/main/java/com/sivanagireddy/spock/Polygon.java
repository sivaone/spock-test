package com.sivanagireddy.spock;

public class Polygon {
    private final int numberOfSides;

    public Polygon(int numberOfSides) {
        if (numberOfSides <= 2) {
            throw new TooFewSidesException("Polygon should have 3 or more sides", numberOfSides);
        }
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }
}
