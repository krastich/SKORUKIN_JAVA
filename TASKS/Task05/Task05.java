package ru.itpark;

public class Task05 {
    public static void main(String[] args) {
        int array[] = {44, 23, 14, 61, 19, 53, 93, 79, 16};
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[indexOfMax]) {
                indexOfMax = i;
            } else if (array[i] < array[indexOfMin]) {
                indexOfMin = i;
            }
        }

        System.out.println("Max = " + array[indexOfMax] + " " + "Min = " + array[indexOfMin]);
    }
}
