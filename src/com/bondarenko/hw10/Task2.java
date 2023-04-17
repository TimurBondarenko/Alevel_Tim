package com.bondarenko.hw10;

public class Task2 {

    public static void main(String[] args) {


        Pow operation = (int x, int y) -> {
            int num = 1;
            for (int i = 1; i <= y; i ++){
                num *= x;
            }
            return num;
        };


        System.out.println(operation.pow(5, 5));
    }
}

@FunctionalInterface
interface Pow {

    int pow(int number, int pow);

}
