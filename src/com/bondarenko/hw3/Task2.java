package com.bondarenko.hw3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Task2.wordCount();

    }

    public static void wordCount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова одной строкой через пробел");
        String sc1 = new String("" + sc.nextLine());

        String input = sc1.trim();
        int count = 0;

        if (input.length() != 0) {
            count++;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        System.out.println("Вы ввели " + count + " слов");
    }
}

