package com.bondarenko.hw10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test {

    @Test
    public void getScholarship(){
        Student student = new Student();

        String textUp = "Сумма стипендии равна 100грн ";

        String resolt = student.getScholarship(5);

        assertEquals(textUp, resolt);
    }
}
