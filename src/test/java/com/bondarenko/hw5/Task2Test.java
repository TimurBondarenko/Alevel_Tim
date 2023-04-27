package com.bondarenko.hw5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task2Test {

    @Test
    public void aBoolean() {

        //Dosn't work

        int[] arrey = {2, 1,};

        boolean resolt = Task2.aBoolean(arrey);

        assertEquals(true, resolt);

    }

}
