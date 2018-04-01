package edu.quinnipiac.ser210.ls19_unittest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by relkharboutly on 3/16/2018.
 */
public class CalculatorTest {
    private Calculator mCaclulator;

    @Before
    public void setUp() throws Exception {
        mCaclulator = new Calculator();
    }

    @Test
    public void sum() throws Exception {
        assertEquals(mCaclulator.sum(1,5),6, 0);
    }

    @Test
    public void subtract() throws Exception {
        assertEquals(mCaclulator.subtract(5,1),4, 0);

    }

    @Test
    public void divide() throws Exception {
        assertEquals(mCaclulator.divide(10,5),0, 0);

    }

    @Test
    public void multiply() throws Exception {
        assertEquals(mCaclulator.multiply(2,5),10, 0);

    }

}