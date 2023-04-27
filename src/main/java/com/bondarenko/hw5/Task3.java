package com.bondarenko.hw5;


import java.util.Arrays;

public class Task3 {

    public static void main(String args[]) {

        method();

    }

    public static void method(){

        int[][] arrey = {{1, 2, 3, 4},
                         {5, 6, 7, 8}};

        int a = 1;
        int b = 2;

        for (int i = 0; i < arrey.length; i++) {
            int rows = arrey[i][a - 1];
            arrey[i][a - 1] = arrey[i][b - 1];
            arrey[i][b - 1] = rows;
        }

        for (int i = 0; i < arrey[0].length; i++) {

            int temp = arrey[a - 1][i];
            arrey[a - 1][i] = arrey[b - 1][i];
            arrey[b - 1][i] = temp;

        }

        System.out.println(Arrays.deepToString(arrey));

    }

}
