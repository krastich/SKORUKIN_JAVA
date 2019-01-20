package ru.itpark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        int left = 0;
        int right = array.length;
        int middle = left + (right - left) / 2;
        int desiredNumber;
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.print("Отсортированный массив:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] > array[i]) {
                    int x = array[j];
                    array[j] = array[i];
                    array[i] = x;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.print("Найти число: ");
        {
            while (desiredNumber != array[middle]) {
                if (desiredNumber > array[middle]) {
                    left = middle;
                    middle = left + (right - left) / 2;
                } else if (desiredNumber < array[middle]) {
                    right = middle;
                    middle = left + (right - left) / 2;
                }
            }

            System.out.println("Порядковый номер:" + array[middle] + "в отсортированном массиве " + middle);
        }
    }
}


