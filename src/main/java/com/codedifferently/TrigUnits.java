package com.codedifferently;

public class TrigUnits {
    
    private String currentTrigUnit = "Degrees";

    public void switchUnitsMode(){
        if (getMode() == "Degrees") {
            currentTrigUnit = "Radians";
        } else {
            currentTrigUnit = "Degrees";
        }
    }

    public String switchUnitsMode(String mode){
        currentTrigUnit = mode;
        return currentTrigUnit;
    }

    public String getMode(){
        return currentTrigUnit;
    }

}