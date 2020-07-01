package com.codedifferently;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExtraFeaturesTest {
    
    SciCalculator sc;
    ExtraFeatures ef;

    @Before
    public void setup(){
        sc = new SciCalculator();
        ef = new ExtraFeatures();
    }

    @Test
    public void absValueTest(){
        // Given
        sc.setCurrentValue(-4.0);

        // When
        double expected = 4.0;
        double actual = ef.absValue();

        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void roundTest(){
        // Given
        sc.setCurrentValue(1.5);

        // When
        double expected = 2.0;
        double actual = ef.round();

        // Then
        Assert.assertEquals(expected, actual, 0.0);

    }

}