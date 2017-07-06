package com.realdolmen;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {


    @Test
    public void oneNumberReturnsNumber() {
        assertEquals(7, new Calculator().eval("7"));
    }


    @Test
    public void twoNumberReturnNumber() {
        assertEquals(12, new Calculator().eval("7 5"));
    }

    @Test
    public void twoNumbersReturnSum () {

    }

}





