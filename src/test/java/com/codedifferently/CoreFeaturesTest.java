package com.codedifferently;

import static org.junit.Assert.assertEquals;

import java.util.function.DoublePredicate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoreFeaturesTest {

    CoreFeatures cf;

    @Before
    public void setup(){
        this.cf = new CoreFeatures();
    }

    @Test
    public void addTest(){
        
        // Given
        SciCalculator.setCurrentValue(0.0);

        // When
        double expected = 1.0;
        double actual = cf.add(1.0);

        // Then
        Assert.assertEquals(expected, actual, 0.0);

    }

    @Test
    public void subtractTest(){

        // Given
        SciCalculator.setCurrentValue(1.0);

        // When
        double expected = 0.0;
        double actual = cf.subtract(1.0);

        // Then
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void multiplyTest(){
        // Given
        SciCalculator.setCurrentValue(1.0);

        // When 
        double expected = 5.0;
        double actual = cf.multiply(5.0);

        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void divideTest(){
        // Given 
        SciCalculator.setCurrentValue(3.0);

        // When
        double expected = 3.0;
        double actual = cf.divide(1.0);

        // Then
        Assert.assertEquals(expected, actual, 0.0);

    }

    @Test
    public void ExpTest(){
        // Given: Setup the test
        SciCalculator.setCurrentValue(2.0);

        // When: Using the method we're testing
        double expected = 4.0;
        double actual = cf.Exp(2.0);

        // Then: Did the result match what we expected it to?
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void squareTest(){
        // Given
        SciCalculator.setCurrentValue(2.0);

        // When
        double expected = 4.0;
        double actual = cf.square();

        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void sqrtTest(){
        // Given
        SciCalculator.setCurrentValue(4.0);

        // When
        double expected = 2.0;
        double actual = cf.sqrt();

        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void inverseTest(){
        // Given
        SciCalculator.setCurrentValue(2.0);

        // When 
        double expected = 0.5; 
        double actual = cf.inverse();

        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void invertSignTest(){
        // Given
        SciCalculator.setCurrentValue(1);

        // When
        double expected = -1;
        double actual = cf.invertSign();
        
        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }
}