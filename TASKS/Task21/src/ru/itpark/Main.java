package ru.itpark;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 4;
        int l = n-1;
        int d= -1;
        int matrix[][] = new int[n][n];
        int number = 1;
        for (int i = l; i >= 0;) {
            for (int j = i; j >= 0; --j) {
                matrix[i][j] = number;
                number++;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}