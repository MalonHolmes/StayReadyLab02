package com.codedifferently;

public class SciCalculator 
{
    protected static double currentValue;
    private DisplayMode displayMode;
    private TrigFunctions trigFunctions;
    private CoreFeatures coreFeatures;
    private TrigUnits trigUnits;
    protected Memory memory;

    public SciCalculator(){
        displayMode = new DisplayMode();
        trigFunctions = new TrigFunctions();
        coreFeatures = new CoreFeatures();
        trigUnits = new TrigUnits();
        memory = new Memory();
    }

    public static void setCurrentValue(double value){
        currentValue = value;
    }

    public static double getCurrentValue(){
        return currentValue;
    }

    public void clearDisplay(){
        setCurrentValue(0.0);
    }

    public DisplayMode getDisplay(){
        return displayMode;
    }

    public CoreFeatures getCoreFeatures(){
        return coreFeatures;
    }

    public Memory getMemory(){
        return memory;
    }

    public TrigUnits getTrigUnits(){
        return trigUnits;
    }

    public TrigFunctions geTrigFunctions(){
        return trigFunctions;
    }

    public static void main(String[] args){
        double x = 9.991;
        int y = (int) x;

        System.out.println("y is " + y);

        boolean z = 8==9;
        System.out.println("z is " + z);
    }

}
