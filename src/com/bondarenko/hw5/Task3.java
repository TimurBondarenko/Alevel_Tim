package com.bondarenko.hw5;

import java.io.IOException;

public class Task3 {

    public static void main(String args[]) throws IOException
    {
        int arr[][] = { { 1, 2, 3 }, { 3, 2, 1 } };


        System.out.println("Первоначальный массив: ");
        printMatrix(arr);

        int K = 1, L = 2;
        interchangeColumns(arr, K, L);

        int K1 = 1, L1 = 2;
        interchangeRows(arr, K1, L1);


    }

    public static void printMatrix(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    //Переставить столбцы
    public static void interchangeColumns(int[][] arr, int K, int L)
    {
        for (int i = 0; i < arr.length; i++) {

            int temp = arr[i][K - 1];
            arr[i][K - 1] = arr[i][L - 1];
            arr[i][L - 1] = temp;
        }
        System.out.println("После перестоновки столбцов "+ K + " и "+ L+ " :");

        printMatrix(arr);
    }

    //Переставить строки
    public static void interchangeRows(int[][] arr, int x, int y)
    {
        for (int i = 0; i < arr[0].length; i++) {

            int temp = arr[x - 1][i];
            arr[x - 1][i] = arr[y - 1][i];
            arr[y - 1][i] = temp;
        }
        System.out.println("После перестановки строк "+ x + " и "+ y + " :");

        printMatrix(arr);
    }
}

