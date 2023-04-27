package com.bondarenko.hw10;

public class Task1 {

    public static void main(String[] args) {

        Student student = new Student();

        Aspirant aspirant = new Aspirant();

        Student[] arrObject = new Student[]{student, aspirant};
        for (int i = 0; i < arrObject.length; i++) {

            System.out.println(arrObject[i].getScholarship(5));

        }

    }
}

class Student {

    String fitsName;
    String lastName;
    int group;
    double averageMark; //Средняя оценка

    public String getScholarship(int averageMark) {

        if (averageMark <= 0 || averageMark > 5) {
            return "Не верно указан средний бал. Укажите бал по 5 бальной системе. ";
        } else if (averageMark == 5) {
            return "Сумма стипендии равна 100грн ";
        }
        return "Сумма стипендии равна 80грн ";
    }

}

class Aspirant extends Student {

    String scientificWork;

    public String getScholarship(int averageMark) {

        if (averageMark <= 0 || averageMark > 5) {
            return "Не верно указан средний бал. Укажите бал по 5 бальной системе. ";
        } else if (averageMark == 5) {
            return "Сумма стипендии равна 200грн ";
        }
        return "Сумма стипендии равна 180грн ";
    }

}

