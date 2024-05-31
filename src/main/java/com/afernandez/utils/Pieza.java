package com.afernandez.utils;

import java.util.concurrent.ThreadLocalRandom;

public class Pieza {    

    private int[][] form;

    public Pieza(int[][] form) {
        this.form = form;
    }

    public void createPieza() {

        int randomNum = ThreadLocalRandom.current().nextInt(1, 7 + 1);
        
        switch (randomNum) {
            case 1:
            int[][] form = {{0, 0}, {1, 0}, {1, 0}, {1, 1}};
                Pieza pieza1 = new Pieza(form);
                System.out.println(pieza1);
                break;
        
            default:
                break;
        }
    }


    
}
