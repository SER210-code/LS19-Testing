package edu.quinnipiac.ser210.ls19_unittest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by relkharboutly on 4/3/2018.
 */
public class CalculatorTest {
    private Calculator mCalculator;
    @Before
    public void setUp() throws Exception {
        mCalculator = new Calculator();
    }

    @Test
    public void sum() throws Exception {
        assertEquals(6, mCalculator.sum(5,1),0);
    }

    @Test
    public void subtract() throws Exception {
        assertEquals(1,mCalculator.subtract(5,4),0);
    }

    @Test
    public void divide() throws Exception {
        assertEquals(5,mCalculator.divide(20,4),0);

    }

    @Test
    public void multiply() throws Exception {
        assertEquals(20,mCalculator.multiply(5,4),0);

    }

}