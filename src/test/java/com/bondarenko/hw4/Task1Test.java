package com.bondarenko.hw4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test {

    @Test
    public void average(){

        int[] arrey = {10, 7, 2};

        double resolt = Task1.average(arrey);

        assertEquals(6.333333333333333, resolt);

    }

    @Test
    public void geometricMean(){
        int[] arrey = {10, 7, 2};

        double resolt = Task1.geometricMean(arrey);

        assertEquals(5.1924941018511035, resolt);
    }

}
