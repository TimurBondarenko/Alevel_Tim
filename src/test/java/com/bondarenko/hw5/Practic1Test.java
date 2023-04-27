package com.bondarenko.hw5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Practic1Test {

    @Test
    public void calcSumConditionally() {

        double[] arrey = {200.20, 1000.01, 1100.55, 10};

        double resolt = Practic1.calcSumConditionally(arrey);

        assertEquals(2100.56, resolt);

    }

}
