package com.bondarenko.hw2;

import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {

        modulNum();

    }

    public static void modulNum() {

        int a = -10;
        int b = -1;
        int c = -11;

        System.out.println("Числа без модуля " + a + ", " + b + ", " + c);

        int num1 = a > 0 ? a : -a;
        System.out.println(num1);

        int num2 = b > 0 ? b : -b;
        System.out.println(num2);

        int num3 = c > 0 ? c : -c;
        System.out.println(num3);

        if (num1 < num2 && num1 < num3) {
            System.out.println("Наиментшее число по модулю " + num1);
            return;
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("Наиментшее число по модулю " + num2);
            return;
        }
        System.out.println("Наиментшее число по модулю " + num3);

    }

}


