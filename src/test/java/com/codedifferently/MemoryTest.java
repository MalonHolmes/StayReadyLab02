package com.codedifferently;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MemoryTest {


    SciCalculator sc;

    @Before
    public void setup(){
        sc = new SciCalculator();
    }

    @Test
    public void constructorTest(){
        // Given
        double expected = 0.0;

        // When
        double actual = sc.memory.memoryValue;

        // Then
        Assert.assertEquals(expected, actual, 0.0);

    }

    @Test
    public void recallMemoryTest(){
        // Given: check @Before
        double expected = 10.0;

        // When
        sc.memory.memoryValue = 10.0;
        sc.memory.recallMemory();
        double actual = sc.getCurrentValue();

        // Then
        Assert.assertEquals(expected, actual, 0.0);

    }

    @Test
    public void addToMemoryTest(){
        // Given: check @Before
        double expected = 10;

        // When
        sc.setCurrentValue(10.0);
        sc.memory.addToMemory();
        double actual = sc.getCurrentValue();

        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void resetMemoryTest(){
        // Given
        double expected = 0.0;

        // When
        sc.setCurrentValue(10.0);
        sc.memory.addToMemory();
        sc.memory.resetMemory();
        double actual = sc.memory.memoryValue;

        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }
}