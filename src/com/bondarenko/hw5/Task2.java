package com.bondarenko.hw5;

public class Task2 {

    public static void main(String[] args) {

        int[] arr = {9, 8, 7};
        System.out.println("Ответ " + aBoolean(arr));

    }

    public static boolean aBoolean(int arr[]) {
        System.out.println("Введенные числа идут по убыванию: ");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] >= arr[i])
                return true;
        }
        return false;
    }

}
