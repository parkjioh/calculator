package com.calc;

import java.util.ArrayList;
import java.util.Deque;
import java.util.InvalidPropertiesFormatException;
import java.util.List;

public class ArithmeticCalculator extends Calculator{

    private final AddOperator addOperator;
    private final SubtractOperator subtractOperator;
    private final MultiplyOperator multiplyOperator;
    private final DivideOperator divideOperator;

    public ArithmeticCalculator() {
        addOperator = new AddOperator();
        subtractOperator = new SubtractOperator();
        multiplyOperator = new MultiplyOperator();
        divideOperator = new DivideOperator();
    }

    public double calculate(int number1, int number2, char symbol) {
        double result = 0;
        switch (symbol) {
            case '+': result = addOperator.operate(number1, number2); break;
            case '-': result = subtractOperator.operate(number1,number2); break;
            case '*': result = multiplyOperator.opretate(number1,number2); break;
            case '/': result = divideOperator.operate(number1,number2); break;
            default: throw new IllegalArgumentException("잘못된 입력입니다.");

        }
        /* return 연산 결과 */

        return result;
    }
}
