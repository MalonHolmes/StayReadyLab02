package com.codedifferently;

public class CoreFeatures {

    public Double add(Double d) {
        SciCalculator.setCurrentValue(SciCalculator.getCurrentValue() + d);
        return SciCalculator.getCurrentValue();
    }
    
    public Double subtract(Double d) {
        SciCalculator.setCurrentValue(SciCalculator.getCurrentValue() - d);
        return SciCalculator.getCurrentValue();
    }

    public Double divide(Double d) {
        if (d == 0) {
            System.out.println("That's a no no...can't divide by zero");
            // Implement an error message Err or sumn 
            return null;
        } 
        SciCalculator.setCurrentValue(SciCalculator.getCurrentValue()/d);
        return SciCalculator.getCurrentValue();
    }

    public Double multiply(Double d) {
        SciCalculator.setCurrentValue(SciCalculator.getCurrentValue() * d);
        return SciCalculator.getCurrentValue();
    }

    public Double Exp(Double d) {
        double result = 1.0;
        for (double power = 0; power < d; power++){
            result *= SciCalculator.getCurrentValue();
        }
        SciCalculator.setCurrentValue(result);
        return SciCalculator.getCurrentValue();
    }

    public Double square() { // Took out parameter because the function doesn't need a second number to square the currentValue
        SciCalculator.setCurrentValue(SciCalculator.getCurrentValue() * SciCalculator.getCurrentValue());
        return SciCalculator.getCurrentValue();
    }

    public Double sqrt() { // Took out parameter because the function doesn't need a second number to take the squareroot of the currentValue
        double currentValueSqrt = Math.sqrt(SciCalculator.getCurrentValue());
        SciCalculator.setCurrentValue(currentValueSqrt);
        return SciCalculator.getCurrentValue();
    }

    public Double inverse() { 
        SciCalculator.setCurrentValue(1/SciCalculator.getCurrentValue());
        return SciCalculator.getCurrentValue();
    }

    public Double invertSign() {
        SciCalculator.setCurrentValue(-(SciCalculator.getCurrentValue()));
        return SciCalculator.getCurrentValue();
    }

}