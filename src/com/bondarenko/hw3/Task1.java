package com.bondarenko.hw3;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        System.out.println("Введите слово на проверку ");

        Scanner word1 = new Scanner(System.in);
        String word2 = word1.next();

        System.out.println(Task1.isPalindrome(word2));

    }

    public static String isPalindrome(String s) {

        int n = s.length();
        for (int i = 0; i < (n/2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return "Слово не палендром";
            }
        }

        return "Слово палендром";
    }

}


