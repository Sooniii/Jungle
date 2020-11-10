package com.company.creatures;

import com.company.senses.Smelling;
import com.company.senses.Vision;

public class Predator extends Animal {

    private int nbLifePoints;
    private int nbLifePointsMax;
    private static final int nbLifePointsMaxAll = 100;

    private int age;
    private int maxAge;
    private static final int maxAgeAll = 42;

    Smelling smelling;

    private Prey huntingPrey;

    public Predator(){
        huntingPrey = null;
    }

    public void hunt(Prey prey){
        huntingPrey = prey;
        vision = new Vision();
    }

    public void mate(Predator predator){

    }


    public void eat(Prey prey){

    }

}
