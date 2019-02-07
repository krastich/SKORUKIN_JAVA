package ru.itpark;

import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        char text[] = scanner.nextLine().toCharArray();
        int arrayToInt = 0;
        for (int i = 0; i < text.length; i++) {
            int charToDigit = (int) text[i] - '0';
            //System.out.println(charToDigit);
            arrayToInt = arrayToInt*10 + charToDigit;
        }
        System.out.println("number to array" + ":" + Arrays.toString(text));
        System.out.println("Array to int" + ":" + " " + arrayToInt);
    }
}