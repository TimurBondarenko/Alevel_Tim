package com.bondarenko.hw5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Practis2Test {


    @Test
    public void calcBoysAvgHeight() {
        int[] heights = {198, -176, -164, 205};

        double resolt = Practis2.calcBoysAvgHeight(heights);

        assertEquals(170, resolt);
    }

    @Test
    public void calcGirlsAvgHeight(){
        int[] heights = {198, -176, -164, 205};

        double resolt = Practis2.calcGirlsAvgHeight(heights);

        assertEquals(201.5, resolt);
    }
}
