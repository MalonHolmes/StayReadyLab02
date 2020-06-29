package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class CoreFeaturesTest {
    
    @Test
    public void addTest(){
        // Given
        CoreFeatures cf = new CoreFeatures();

        // When
        Double actual = cf.add(1.0);
        Double expected = 1.0;

        // Then
        Assert.assertEquals(expected, actual);

    }
}