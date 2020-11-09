package com.company;

public class WaterSpot {

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
}
