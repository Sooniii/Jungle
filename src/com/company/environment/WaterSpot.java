package com.company.environment;

import com.company.environment.Coords;

public class WaterSpot extends Ressources {

    int waterQuantity;
    int width;
    int height;
    private Coords coords;

    public WaterSpot(int waterQuantity, int width, int height) {
        this.waterQuantity = waterQuantity;
        this.width = width;
        this.height = height;
        this.coords = new Coords(0,0);
    }

    public void update() {
    }

    public int getWaterForDrink(int waterQuantityRequested){

        int waterAvailable = waterQuantity;

        if (waterQuantity > waterQuantityRequested){
            waterQuantity -= waterQuantityRequested;
            waterAvailable = waterQuantityRequested;
        }
        else if (waterQuantity > 0){
            waterQuantity = 0;
        }
        return waterAvailable;
    }
}
