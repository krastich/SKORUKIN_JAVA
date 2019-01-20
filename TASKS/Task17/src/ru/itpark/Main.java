package ru.itpark;

import java.util.Random;

public class Main {


    public static void main(String[] args) {

        Random random = new Random();
        int number = 0;
        int matrix[][] = new int[random.nextInt(4) + 2][random.nextInt(10) + 1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                number = random.nextInt(20);
                matrix[i][j] = number;
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