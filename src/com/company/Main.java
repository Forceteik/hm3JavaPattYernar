package com.company;

public class Main {

    public static void main(String[] args) {

        Guitar ordinaryGuitar = new OrdinaryGuitar();
        System.out.printf("Parts: %s %nCost: $%.2f", ordinaryGuitar.getParts(), ordinaryGuitar.getCost());

        Guitar guitarForConcert = new GuitarForConcert(new OrdinaryGuitar());
        System.out.printf("%nParts: %s %nCost: $%.2f", guitarForConcert.getParts(), guitarForConcert.getCost());

        Guitar guitarForStatement = new GuitarForStatement(new GuitarForConcert(new OrdinaryGuitar()));
        System.out.printf("%nParts: %s %nCost: $%.2f", guitarForStatement.getParts(), guitarForStatement.getCost());

    }
}
