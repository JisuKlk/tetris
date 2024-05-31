package com.afernandez.main;

import com.afernandez.utils.Utils;

public class Main {
    public static void main(String[] args) {
        int[][] form = {{0, 0}, {1, 0}, {1, 0}, {1, 1}};
        
        for(int i = 0; i < form.length; i++) {
            for(int j = 0; j < form[i].length; j++) {
                System.out.println(form[i][j]);
            }
            System.out.println();
        }
    }
}