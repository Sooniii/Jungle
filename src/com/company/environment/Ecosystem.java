package com.company.environment;

import com.company.creatures.Predator;
import com.company.creatures.Prey;
import org.fusesource.jansi.AnsiConsole;

import static org.fusesource.jansi.Ansi.ansi;

public class Ecosystem {
    private static final int MAX_ARRAY_ELEMENT = 100;

    private static Ecosystem ecosystemInstance = null;

    private Terrain terrain;
    private Predator[] predatorArray;
    private Prey[] preyArray;
    private Plant[] plantArray;

    static public Ecosystem getInstance(){
        if (ecosystemInstance == null) {
            ecosystemInstance = new Ecosystem();
        }
        return ecosystemInstance;
    }

    private Ecosystem(){

        terrain = new Terrain();
        predatorArray = new Predator[MAX_ARRAY_ELEMENT];
        preyArray = new Prey[MAX_ARRAY_ELEMENT];
        plantArray = new Plant[MAX_ARRAY_ELEMENT];
        AnsiConsole.systemInstall();


        for (int i = 0; i < MAX_ARRAY_ELEMENT; i++){
            predatorArray[i] = new Predator();
            preyArray[i] = new Prey();
            plantArray[i] = new Plant();
        }
    }

    public void startLifeCycle(){
        while (true){

            updateElements();
            drawElements();
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void drawElements() {
        System.out.println(ansi().eraseScreen());

        char escCode = 0x1B;
        int row = 0; int column = 0;
        System.out.print(String.format("%c[%d;%df",escCode,row,column));

        terrain.draw();

        for (Predator pred : predatorArray) {
            pred.draw();
        }

        for (Prey prey : preyArray){
            prey.draw();
        }

        for (Plant plant : plantArray){
            plant.draw();
        }
    }

    private void updateElements() {
        terrain.update();

        for (Predator pred : predatorArray) {
            pred.update();
        }

        for (Prey prey : preyArray){
            prey.update();
        }

        for (Plant plant : plantArray){
            plant.update();
        }
    }

    public WaterSpot getWaterSpot() {
        return terrain.getTerrainWaterSpot();
    }
}
