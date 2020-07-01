package com.codedifferently;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SciCalculatorTest 
{

    SciCalculator sc;

    @Before
    public void setup(){
        this.sc = new SciCalculator();
    }

    @Test
    public void getCurrentValueTest(){
        // Given

        // When
        double expected = 0.0;
        double actual = sc.getCurrentValue();

        // Then
        Assert.assertEquals(expected, actual, 0.0);

    }

    @Test
    public void setCurrentValueTest(){
        // Given 

        // When
        double expected = 1.0;
        sc.setCurrentValue(1.0);
        double actual = sc.getCurrentValue();

        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void getDisplayTest(){
        // Given 

        // When
        DisplayMode expected = sc.getDisplay();
        DisplayMode actual = sc.getDisplay();

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getCoreFeaturesTest(){
        // Given

        // When
        CoreFeatures expected = sc.getCoreFeatures();
        CoreFeatures actual = sc.getCoreFeatures();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMemoryTest(){
        // Given 

        // When
        Memory expected = sc.getMemory();
        Memory actual = sc.getMemory();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTrigUnitsTest(){
        // Given

        // When
        TrigUnits expected = sc.getTrigUnits();
        TrigUnits actual = sc.getTrigUnits();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTrigFunctionsTest(){
        // Given

        // When 
        TrigFunctions expected = sc.geTrigFunctions();
        TrigFunctions actual = sc.geTrigFunctions();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearDisplayTest(){
        // Given

        // When
        sc.clearDisplay();
        double expected = 0.0;
        double actual = sc.getCurrentValue();
        
        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

}
