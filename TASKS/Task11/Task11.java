package ru.itpark;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        int left = 0;
        int right = array.length;
        int middle = left + (right - left) / 2;
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
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
        System.out.println();
        System.out.println("Найти число: ");        {
            int desiredNumber = input.nextInt();
            while (desiredNumber != array[middle]) {
                if (desiredNumber > array[middle]) {
                    left = middle;
                    middle = left + (right - left) / 2;
                } else if (desiredNumber < array[middle]) {
                    right = middle;
                    middle = left + (right - left) / 2;
                }
            }
            System.out.println("Порядковый номер: " + array[middle]);
            System.out.println("В отсортированном массиве " + middle);
        }
    }