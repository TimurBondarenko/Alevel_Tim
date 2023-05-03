package com.bondarenko.hw10;

public class Student {

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
