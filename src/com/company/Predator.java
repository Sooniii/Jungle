package com.company;

public class Predator {
    private static final int drinkingQuantity = 1;

    private int nbLifePoints;
    private int nbLifePointsMax;
    private static final int nbLifePointsMaxAll = 100;

    private int age;
    private int maxAge;
    private static final int maxAgeAll = 42;

    Smelling smelling;
    Vision vision;
    Coords coords;

    public void hunt(Prey prey){

    }

    public void mate(Predator predator){

    }

    public void move(){

    }

    public void eat(Prey prey){

    }

    public void drink(WaterSpot waterSpot){
        int waterAvailable = waterSpot.getWaterForDrink(drinkingQuantity);
    }

    public void update() {
        drink(Ecosystem.getInstance().getWaterSpot());
    }
}
