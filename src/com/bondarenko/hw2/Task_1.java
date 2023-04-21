package com.bondarenko.hw2;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        areaOfTriangle();

    }

    public static void areaOfTriangle() {

        Scanner o = new Scanner(System.in);

        System.out.print("Введите координаты для точки А: ");
        double x1 = o.nextDouble();
        double y1 = o.nextDouble();
        System.out.println("Введите координаты для точки В: ");
        double x2 = o.nextDouble();
        double y2 = o.nextDouble();
        System.out.println("Введите координаты для точки С: ");
        double x3 = o.nextDouble();
        double y3 = o.nextDouble();

        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        if (a + b <= c || a + c <= b) {
            System.out.println("Треугольник не существует");
        } else {
            double p = (a + b + c) / 2.0;
            double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Площадь: " + square);
        }

    }
}


