package com.calc;

import com.operator.*;

public class ArithmeticCalculator<T> extends Calculator{

    private final AddOperator addOperator;
    private final SubtractOperator subtractOperator;
    private final MultiplyOperator multiplyOperator;
    private final DivideOperator divideOperator;
    private final ModOperator modOperator;

    public ArithmeticCalculator() {
        addOperator = new AddOperator();
        subtractOperator = new SubtractOperator();
        multiplyOperator = new MultiplyOperator();
        divideOperator = new DivideOperator();
        modOperator = new ModOperator();
    }

    public double calculate(double number1, double number2, char symbol) {
        Operator operator;
        switch (symbol) {
            case '+': operator = addOperator; break;
            case '-': operator = subtractOperator; break;
            case '*': operator = multiplyOperator; break;
            case '/': operator = divideOperator; break;
            case '%': operator = modOperator; break;
            default: throw new IllegalArgumentException("잘못된 입력입니다.");

        }
        /* return 연산 결과 */

        return operator.operate(number1,number2);
    }
}
