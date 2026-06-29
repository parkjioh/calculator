package com;

import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.List;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    private List<Integer> resultList;
    private List<Double> circleAreas;
    private final double pi = 3.14;

    public Calculator(List<Integer> resultList, List<Double> circleAreas) {
        this.resultList = new ArrayList<>() ;
        this.circleAreas = new ArrayList<>();
    }
    /* Getter 메서드 구현 */
    public List<Integer> getResultList() {
        return resultList;
    }
    /* Setter 메서드 구현 */
    public void setResultList() {
        this.resultList = resultList;
    }

    public int calculate(int number1, int number2, char symbol) {
        int result = 0;
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

    public void removeResult() {
        resultList.remove(0);
    }

    public void inquiryResult() {
        for (Integer i : resultList) {
            System.out.print(i + " ");
        }
    }


    public double calculateCirecleArea(int radious) {
        double result=  0;

        result = 2 * radious * pi;
        return result;
    }

    public List<Double> getCircleAreas() {
        return circleAreas;
    }

    public void setCircleAreas(List<Double> circleAreas) {
        this.circleAreas = circleAreas;
    }

    public void setResultList(List<Integer> resultList) {
        this.resultList = resultList;
    }
}

// 연산자 잘못 들어왔을 때 연산자만 다시 받는 걸로 돌리고 싶은데 흠
// 가장 간단한 방법 -> while & if문해서 연산자 받을 때 검사 안 맞느면 다시하기
