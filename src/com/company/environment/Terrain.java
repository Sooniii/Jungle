package com.company.environment;

import com.company.Drawable;

public class Terrain extends Drawable {

    private int width;
    private int height;
    private WaterSpot waterSpot;

    public Terrain(){
        width = 15;
        height = 120;
        waterSpot = new WaterSpot(2500,
                width/4,
                height/4);
    }

    public void update(){
        waterSpot.update();
    }

    public WaterSpot getTerrainWaterSpot(){
        return waterSpot;
    }

    public void draw(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                if (i == 0 || i == height -1){
                    sb.append("_");
                } else if (j == 0 || j == width -1){
                    sb.append("|");
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
