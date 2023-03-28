package com.bondarenko.hw4;

public class Task1 {

    public static void main(String[] args){

       mathThings();

    }

    public static void mathThings(){

        //Блок Рандом
        long[] array = new long[400];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + (int) (Math.random() * 10);
        }
        //

        //Среднее арифметическое элементов массива.
        double average = 0;
        if (array.length > 0)
        {
            double sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j];
            }
            average = sum / array.length;
        }
        System.out.println("Среднее арифметическое элементов массива " + average);
        //

        //Среднее геометрическое элементов массива.
        double average2 = 0;
        if (array.length > 0) {

            double sum = 1.0;
            for (int j = 0; j < array.length; j++) {
                sum *= array[j];
            }
            sum = Math.pow(sum, 1.0 / (double) array.length);
            average2 = sum;
        }
        System.out.println("Среднее геометрическое элементов массива " + average2);
        //

    }

}
