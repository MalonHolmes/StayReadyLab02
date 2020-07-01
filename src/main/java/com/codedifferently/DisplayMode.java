package com.codedifferently;

public class DisplayMode {
    
    String[] displays = { "binary", "octal", "decimal", "hexadecimal" };
    int idx = 0;
    protected String whichMode = displays[idx];

    public void switchDisplayMode() {
        
        if (idx == displays.length){
            idx = 0;
        } else {
            idx++;
        }

        whichMode = displays[idx];
    }

    public String switchDisplayMode(String s){
        whichMode = s;
        return whichMode;
    }

    public String getMode(){
        return whichMode;
    }

}