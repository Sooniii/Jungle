package com.company;

import com.company.environment.Ecosystem;

public class Main {

    public static void main(String[] args) {
        Ecosystem ecosystem = Ecosystem.getInstance();
        ecosystem.startLifeCycle();
    }
}
