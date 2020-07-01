package com.codedifferently;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

public class TrigUnitsTest {
    
    TrigUnits tu;

    @Before
    public void setup(){
        tu = new TrigUnits();
    }

    @Test
    public void getModeTest(){
        // Given: in @Before

        // When
        String expected = "Degrees";
        String actual = tu.getMode();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void switchUnitsModeTest(){
        // Given: in @Before
        
        // When
        tu.switchUnitsMode();
        tu.switchUnitsMode();
        String expected = "Degrees";
        String actual = tu.getMode();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void switchUnitsModeTest2(){
        // Given: in @Before

        // When
        String expected = "Degrees";
        String actual = tu.switchUnitsMode("Degrees");

        // Then
        Assert.assertEquals(expected, actual);
        
    }

}