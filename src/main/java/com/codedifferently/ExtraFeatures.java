package com.codedifferently;

public class ExtraFeatures {
    
    public double absValue(){
        double currentValueAbs = Math.abs(SciCalculator.getCurrentValue());
        SciCalculator.setCurrentValue(currentValueAbs);
        return SciCalculator.getCurrentValue();
    }

    public double round(){
        double currentValueRound = 
            Math.round(SciCalculator.getCurrentValue());
        SciCalculator.setCurrentValue(currentValueRound);
        return SciCalculator.getCurrentValue();
    }

}