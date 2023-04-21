package com.bondarenko.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {

    //Если число четное то arr[i] = 0; Все четные заменить на 0.

    public static void main(String[] args) {

        zoroMet();

    }

    public static void zoroMet() {

        int[] arr = new int[2000];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(30);
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
