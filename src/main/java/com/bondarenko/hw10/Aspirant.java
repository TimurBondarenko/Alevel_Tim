package com.bondarenko.hw10;

public class Aspirant extends Student {

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
