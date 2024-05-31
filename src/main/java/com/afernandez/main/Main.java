package com.afernandez.main;

import com.afernandez.utils.Utils;

public class Main {
    public static void main(String[] args) {
        int[][] table = Utils.initBoard();
        for(int i = 0; i < table.length; i++) {
            for(int j = 0; j < table[i].length; j++) {
                System.out.println(table[i][j]);
            }
        }
    }
}