package com.company;

public class Ecosystem {
    private static final int MAX_ARRAY_ELEMENT = 100;
    private int width;
    private int height;

    private static Ecosystem ecosystemInstance = null;

    private WaterSpot waterSpot;
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
        width = 30;
        height = 120;
        waterSpot = new WaterSpot(1500,
                width/4,
                height/4);

        predatorArray = new Predator[MAX_ARRAY_ELEMENT];
        preyArray = new Prey[MAX_ARRAY_ELEMENT];
        plantArray = new Plant[MAX_ARRAY_ELEMENT];

        for (int i = 0; i < MAX_ARRAY_ELEMENT; i++){
            predatorArray[i] = new Predator();
            preyArray[i] = new Prey();
            plantArray[i] = new Plant();
        }
    }

    public void startLifeCycle(){
        while (true){

            waterSpot.update();

            for (Predator pred : predatorArray) {
                pred.update();
            }

            for (Prey prey : preyArray){
                prey.update();
            }

            for (Plant plant : plantArray){
                plant.update();
            }

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public WaterSpot getWaterSpot() {
        return waterSpot;
    }
}
