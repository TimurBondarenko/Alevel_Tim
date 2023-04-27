package com.bondarenko.hw3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        wordCount();

    }

    public static void wordCount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова одной строкой через пробел");
        String sc1 = sc.nextLine();

        String input = sc1.trim().replaceAll(" +", " ");
        System.out.println(input);

        int count = 1;

        if(input.length() == 0){
            System.out.println("Ничего нет ");
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') { //Выявляет пробелы
                count++;
            }
        }
        System.out.println(count);
    }
}
