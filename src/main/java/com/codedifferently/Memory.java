package com.codedifferently;

public class Memory { 

    protected double memoryValue; // protected so SciCalc can access it

    public Memory(){
        resetMemory();
    }

    public void addToMemory(){
        memoryValue += SciCalculator.getCurrentValue();
    }

    public void resetMemory(){
        memoryValue = 0.0;
    }

    public void recallMemory() { //sets the display of the calculator the the memory value
        SciCalculator.setCurrentValue(memoryValue);
    }

}