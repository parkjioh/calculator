package com.calc;

import java.util.List;

public class CircleCalculator extends Calculator{

    private final List<Double> resultList;
    private final double pi = 3.14;

    public CircleCalculator(List<Double> resultList){
        this.resultList = resultList;
    }
    @Override
    public List<Double> getResultList() {
        return resultList;
    }

    @Override
    public void removeResult() {
        resultList.remove(0);
    }

    @Override
    public void inquiryResult() {
        for (Double v : resultList) {
            System.out.print(v + " ");
        }
    }

    public double calculateCirecleArea(int radious) {
        double result=  0;

        result = Math.round(2 * radious * pi * 100) / 100.0;

        resultList.add(result);
        return result;
    }
}
