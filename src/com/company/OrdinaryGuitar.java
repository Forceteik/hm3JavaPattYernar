package com.company;

public class OrdinaryGuitar implements Guitar{
    @Override
    public double getCost() {
        return 50.5;
    }

    @Override
    public String getParts() {
        return "Guitar";
    }
}
