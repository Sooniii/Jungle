package com.company;

public class Prey {
    private static final int drinkingQuantity = 1;

    private int nbLifePoints;
    private int nbLifePointsMax;
    private static final int nbLifePointsMaxAll = 100;

    private int age;
    private int maxAge;
    private static final int maxAgeAll = 42;

    Hearing hearing;
    Vision vision;
    Coords coords;


    public void runAway(Predator predator){

    }

    public void mate(Prey prey){

    }

    public void move(){

    }

    public void eat(Plant plant){

    }

    public void drink(WaterSpot waterSpot){
        int waterAvailable = waterSpot.getWaterForDrink(drinkingQuantity);
    }

    public void update() {
        drink(Ecosystem.getInstance().getWaterSpot());
    }
}
