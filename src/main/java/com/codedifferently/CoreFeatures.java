package com.codedifferently;

public class CoreFeatures {
    
    private double memory;
    
    public CoreFeatures(){
        this.memory = 0.0;
    }

    public Double add(Double d) {
        memory += d;
        return memory;
    }

    public Double subtract(Double d) {
        memory -= d;
        return memory;
    }

    public Double divide(Double d) {
        return null;
    }

    public Double multiply(Double d) {
        return null;
    }

    public Double Exp(Double d) {
        return null;
    }

    public Double square(Double d) {
        return null;
    }

    public Double sqrt(Double d) {
        return null;
    }

    public Double inverse(Double d) {
        return null;
    }

    public Double invertSign(Double d) {
        return null;
    }

}