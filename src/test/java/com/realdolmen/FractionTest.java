package com.realdolmen;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by vdabcursist on 05/07/2017.
 */
public class FractionTest {

    @Test
    public void fractionIsOK (){
        Fraction fraction= new Fraction(1,2);
        assertEquals(1,fraction.numinator());
        assertEquals(2,fraction.denomintor());
    }

    @Test
    public void testToStringFraction (){
        Fraction fraction = new Fraction(1,2);
        assertThat(fraction.toString(),containsString("1/2"));
    }
    @Test
    public void fractionIsSimplified(){
        Fraction fraction = new Fraction(5,10);
        assertEquals(1,fraction.numinator());
        assertEquals(2,fraction.denomintor());

    }





}
