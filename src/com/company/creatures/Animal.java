package com.company.creatures;

import com.company.Drawable;
import com.company.environment.Coords;
import com.company.environment.Ecosystem;
import com.company.senses.Vision;
import com.company.environment.WaterSpot;

public class Animal extends Drawable {

    private static final int drinkingQuantity = 1;

    Vision vision;
    Coords coords;

    public void move(){

    }

    public void drink(WaterSpot waterSpot){
        int waterAvailable = waterSpot.getWaterForDrink(drinkingQuantity);
    }

    public void update() {
        drink(Ecosystem.getInstance().getWaterSpot());
    }

}
