package ru.itpark;

public class Main {
     public static void main(String[] args) {
            int n = 4;
            int l = n/2;
            int matrix[][] = new int[n][n];
            int number = 1;
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < matrix[i].length; j++) {
                 matrix[i][j] = number++;
                 System.out.print(matrix[i][j] + " ");
                 System.out.println();
             }

             for (int j = 1; j < matrix[i].length-1; j++) {
                 matrix[i + j][matrix.length - 1 - i] = number++;
                 System.out.print(matrix[i][j] + " ");
                 System.out.println();
             }
             for (int j = n - 2; j > -1; j--) {
                 matrix[matrix.length - 1 - i][i + j] = number++;
                 System.out.print(matrix[i][j] + " ");
                 System.out.println();
             }
             for (int j = n - 2; j > 0; j--) {
                 matrix[i + j][i] = number++;
                 System.out.print(matrix[i][j] + " ");
                 System.out.println();
             }
             n -= 2;
         }

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }


        }
    }