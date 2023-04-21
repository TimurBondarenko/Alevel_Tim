package com.bondarenko.hw2;

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] argt) {

        evenNumber();

    }

    public static void evenNumber() {

        int num;
        System.out.println("Введите число: ");

        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        if (num % 2 == 0)
            System.out.println("Число четное");
        else
            System.out.println("Число нечетное");

    }

}
