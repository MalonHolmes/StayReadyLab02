package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class DisplayModeTest {
    
    @Test
    public void switchDisplayModeTest(){
        // Given
        DisplayMode dm = new DisplayMode();

        // When 
        String expected = "decimal";  
        dm.switchDisplayMode();
        dm.switchDisplayMode();

        String actual = dm.whichMode;

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void switchDisplayModeTest2(){
        // Given
        DisplayMode dm = new DisplayMode();

        // When
        String expected = "octal";
        String actual = dm.switchDisplayMode("octal");

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getModeTest(){
        // Given
        DisplayMode dm = new DisplayMode();

        // When
        String expected = "binary";
        String actual = dm.getMode();

        // Then
        Assert.assertEquals(expected, actual);
    }
    
}