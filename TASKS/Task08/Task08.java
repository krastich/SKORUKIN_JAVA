package ru.itpark;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        int array[] = {44, 23, 14, 61, 19, 53, 93, 79, 16};
        int x;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array.length ; j++) {
                if(array[j]>array[i]){
                    x = array [j];
                    array[j]=array[i];
                    array[i]=x;
                }
            }
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}