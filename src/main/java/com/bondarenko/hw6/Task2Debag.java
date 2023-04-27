package com.bondarenko.hw6;

public class Task2Debag {

    public static void main(String[] args) {
        int[][] triangle = new int[5][0];
        triangle[0] = new int[1];
        triangle[1] = new int[2];
        triangle[2] = new int[3];
        triangle[3] = new int[4];
        triangle[4] = new int[5];

        for (int i = 0; i < triangle.length; i++) {
            System.out.println(triangle.length + "!");
            System.out.println("i = " + i);
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.println(triangle[i].length);
                triangle[i][j] = 0;
            }
        }

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.println(triangle[i][j] + " Ошибка исправленна, программа работает");
            }
            System.out.println();
        }
    }
}

/*
* Я запустил дебагер со страницы 22. Дебаг указал что при вызове массива на строке 24
* i был равен 0, j равен 1. Компелятор вывел java.lang.IndexOutOfBoundsException:
* Invalid index 0, size is 0 - указывает, что вы пытаетесь обратиться к элементу
* массива которого не существует. Вы пытаетесь заменить элемент с индексом 0, но его ещё не существует.
*
* Ошибка на строке 23. Было i < triangle[i].length; А нужно j < triangle[i].length;
*
* */

