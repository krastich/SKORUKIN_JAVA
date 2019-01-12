package ru.itpark;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        int array[] = {44, 23, 14, 61, 19, 53, 93, 79, 16};
        reverse(array);
    }
    public static void reverse(int[] input) {
        System.out.println("original array : " + Arrays.toString(input));
        if (input == null || input.length <= 1) {
            return;
        }
        for (int i = 0; i < input.length / 2; i++) {
            int temp = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = temp;
        }
        System.out.println("reversed array : " + Arrays.toString(input));
    }
}