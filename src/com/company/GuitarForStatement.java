package com.company;

public class GuitarForStatement extends GuitarDecorator{

    public GuitarForStatement(Guitar guitar) {
        super(guitar);
    }

    @Override
    public double getCost() {
        return super.getCost() + 30.2;
    }

    @Override
    public String getParts() {
        return super.getParts() + " +Head";
    }
}
