package com.calc;

import java.util.List;

public class CircleCalculator extends Calculator{

    private final double pi = 3.14;


    public double calculateCirecleArea(int radius) {
        double result=  0;

        result = Math.round(2 * radius * pi * 100) / 100.0;

        return result;
    }
}
