package com.company;

public class Ecosystem {

    private int width;
    private int height;
    WaterSpot waterSpot;

    public Ecosystem(){
        width = 30;
        height = 120;
        waterSpot = new WaterSpot(500, width/4, height/4);
    }
}
