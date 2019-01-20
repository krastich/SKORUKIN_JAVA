package ru.itpark;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char mainString[] = scanner.nextLine().toCharArray();
        char findText[] = scanner.nextLine().toCharArray();
        int value1 = 0;
        int value2 = 0;
        int index;

        for (int i = 0; i < mainString.length; i++) {
            if (mainString[i] == findText[0]) {
                index = i;
                for (int j = 0; j < findText.length; j++) {
                    value1 = (int) mainString[i + j];
                    value2 = (int) findText[j];
                }
                if (value1 == value2) {
                    System.out.println("Вхождение в строку на " + index + "символе");
                }
            }
        }

    }
}