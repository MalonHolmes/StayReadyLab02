package com.codedifferently;

public class CoreFeatures {

    public Double add(Double d) {
        return SciCalculator.getCurrentValue() + d;
    }
    
    public Double subtract(Double d) {
        return SciCalculator.getCurrentValue() - d;
    }

    public Double divide(Double d) {
        if (d == 0) {
            System.out.println("That's a no no...can't divide by zero");
            SciCalculator.setCurrentValue(value);
            return null;
        } 
        return (SciCalculator.getCurrentValue()/d);
    }

    public Double multiply(Double d) {
        return SciCalculator.getCurrentValue() * d;
    }

    public Double Exp(Double d) {
        double result = 1;
        for (double power = 0; power < d; power++){
            result *= SciCalculator.getCurrentValue();
        }
        return result;
    }

    public Double square() { // Took out parameter because the function doesn't need a second number to square the currentValue
        return SciCalculator.getCurrentValue() * SciCalculator.getCurrentValue();
    }

    public Double sqrt() { // Took out parameter because the function doesn't need a second number to take the squareroot of the currentValue
        return Math.sqrt(SciCalculator.getCurrentValue());
    }

    public Double inverse() { 
        return 1/SciCalculator.getCurrentValue();
    }

    public Double invertSign() {
        return -(SciCalculator.getCurrentValue());
    }

}