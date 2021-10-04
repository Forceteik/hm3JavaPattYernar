package com.company;

public class GuitarForConcert extends GuitarDecorator{

    public GuitarForConcert(Guitar guitar) {
        super(guitar);
    }

    @Override
    public double getCost() {
        return super.getCost() + 51.3;
    }

    @Override
    public String getParts() {
        return super.getParts() + " +Body";
    }
}
