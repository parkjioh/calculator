package com.calc;

public class DivideOperator {
    public int operate(int number1, int number2) {
        if (number2 == 0 ) {
            System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            throw new ArithmeticException();
        } else {
            return number1 / number2 ;
        }
    }
}
