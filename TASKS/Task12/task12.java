package ru.itpark;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        // считывание переменной n
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // создание и заполнения массива
        int[] f = new int[n];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i < n; ++i) {
            f[i] = f[i - 1] + f[i - 2];
        }

        // вывод первых n чисел Фибоначчи
        for (int i = 0; i < n; ++i) {
            System.out.println(f[i]);
        }
    }
}