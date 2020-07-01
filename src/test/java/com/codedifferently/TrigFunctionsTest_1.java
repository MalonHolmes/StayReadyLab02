package com.codedifferently;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class TrigFunctionsTest_1 {
    

    TrigFunctions tf;
    SciCalculator sc;

    @Before
    public void setup(){
        tf = new TrigFunctions();
        sc = new SciCalculator();
    }

    @Test
    public void sineTest(){
        // Given
        sc.setCurrentValue(0);

        // When
        double expected = 0.0;
        double actual = tf.sine();

        // Then
        Assert.assertEquals(expected, actual, 0.0);

    }

    @Test
    public void cosineTest(){
        // Given
        sc.setCurrentValue(0);

        // When
        double expected = 1.0;
        double actual = tf.cosine();

        // Then
        Assert.assertEquals(expected, actual, 0.0);

    }

    @Test
    public void tangentTest(){
        // Given
        sc.setCurrentValue(0);

        // When
        double expected = 0.0;
        double actual = tf.tangent();

        // Then
        Assert.assertEquals(expected, actual, 0.0);

    }

    @Test
    public void inverseSineTest(){
        // Given
        sc.setCurrentValue(0);

        // When
        double expected = 0.0;
        double actual = tf.inverseSine();

        // Then
        Assert.assertEquals(expected, actual, 0.0);

    }

    @Test
    public void inverseCosineTest(){
        // Given
        sc.setCurrentValue(1.0);

        // When
        double expected = 0.0;
        double actual = tf.inverseCosine();

        // Then
        Assert.assertEquals(expected, actual, 0.0);

    }

    @Test
    public void inverseTangentTest(){
        // Given
        sc.setCurrentValue(0);

        // When
        double expected = 0.0;
        double actual = tf.inverseTangent();

        // Then
        Assert.assertEquals(expected, actual, 0.0);

    }
}