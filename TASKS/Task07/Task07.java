package ru.itpark;

import java.util.Arrays;

public class Task07 {
    public static void main(String[] args) {
        int array[] = {44, 23, 14, 61, 19, 53, 93, 79, 16};
        int sum = 0;

        for (int i = 1; i <array.length-1 ; i++) {
            if (array[i-1]<array[i] && array[i] > array[i+1]){
                sum++;
            }
        }
        System.out.println(sum);
    }
}