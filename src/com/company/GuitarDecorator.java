package com.company;

public abstract class GuitarDecorator implements Guitar{

    private Guitar guitar;

    public GuitarDecorator(Guitar guitar){
        this.guitar = guitar;
    }

    @Override
    public double getCost() {
        return guitar.getCost();
    }

    @Override
    public String getParts() {
        return guitar.getParts();
    }

}
