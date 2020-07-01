package com.codedifferently;

public class ExtraFeatures {
    
    public double absValue(){
        return Math.abs(SciCalculator.getCurrentValue());
    }

    public double round(){
        return Math.round(SciCalculator.getCurrentValue());
    }

}