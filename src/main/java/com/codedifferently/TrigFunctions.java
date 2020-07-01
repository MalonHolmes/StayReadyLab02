package com.codedifferently;

public class TrigFunctions {
    
    public double sine(){
        return Math.sin(SciCalculator.getCurrentValue());
    }

    public double cosine(){
        return Math.cos(SciCalculator.getCurrentValue());
    }

    public double tangent(){
        return Math.tan(SciCalculator.getCurrentValue());
    }

    public double inverseSine(){
        return Math.asin(SciCalculator.getCurrentValue());
    }

    public double inverseCosine(){
        return Math.acos(SciCalculator.getCurrentValue());
    }

    public double inverseTangent(){
        return Math.atan(SciCalculator.getCurrentValue());
    }
}