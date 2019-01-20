package ru.itpark;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt((5) + 2);
        int b = a;
        int matrixA [][] = new int[a][b];
        int matrixB [][] = new int[b][a];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixA[i][j] = random.nextInt(30);
            }
        }
        System.out.println("Матрица 1:");
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                matrixB[i][j] = random.nextInt(20);
            }
        }
        System.out.println("Матрица 2:");
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                System.out.print(matrixB[i][j] + " ");
            }
            System.out.println();
        }

    }
}