package com.calc;

import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.List;

public class ArithmeticCalculator extends Calculator{

    private List<Double> resultList;

    public ArithmeticCalculator(List<Double> resultList) {
        this.resultList = resultList;
    }
    @Override
    List<Double> getResultList() {
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

    public double calculate(int number1, int number2, char symbol) {
        double result = 0;
        switch (symbol) {
            case '+': result = number1 + number2; break;
            case '-': result = number1 - number2; break;
            case '*': result = number1 * number2; break;
            case '/': {
                if (number2 == 0 ) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    throw new ArithmeticException();
                } else {
                    result = number1 / number2 ;
                    break;
                }
            }
            default:
                try {
                    throw new InvalidPropertiesFormatException("연산기호가 잘못 되었습니다.");
                } catch (InvalidPropertiesFormatException e) {
                    throw new RuntimeException(e);
                }

        }
        /* return 연산 결과 */

        resultList.add(result);

        return result;
    }
}
