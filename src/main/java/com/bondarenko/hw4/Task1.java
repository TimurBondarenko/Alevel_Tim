package com.bondarenko.hw4;

public class Task1 {

    public static void main(String[] args){

        int[] array = new int[400];

        mathThings(array);

        average(array);

        geometricMean(array);

    }

    public static void mathThings(int[] array){

        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + (int) (Math.random() * 10);
        }
    }

    public static double average(int[] array){
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
        //System.out.println("Среднее арифметическое элементов массива " + );
        return average;
    }

    public static double geometricMean(int[] array){
        //Среднее геометрическое
        double geometric = 0;
        if (array.length > 0) {

            double sum = 1.0;
            for (int j = 0; j < array.length; j++) {
                sum *= array[j];
            }
            sum = Math.pow(sum, 1.0 / (double) array.length);
            geometric = sum;
        }
        //System.out.println("Среднее геометрическое элементов массива " + );
        return geometric;
    }
}
