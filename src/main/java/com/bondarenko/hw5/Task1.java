package com.bondarenko.hw5;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[][] array = new int[4][4];

        System.out.println(Arrays.deepToString(plusMinusString(array)));

    }

    public static int[][] plusMinusString(int[][] array) {
        int a = 0;
        int k = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = a + 1; //Заполнение массива
                a++;
                if (i % 2 != 0)
                    array[i][j] = k * (-1);
                k++;
            }
        }return array;
    }
}