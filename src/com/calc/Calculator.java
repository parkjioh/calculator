package com.calc;

import java.util.ArrayList;
import java.util.List;

public abstract class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    private final List<Double> resultList = new ArrayList<>();

    public void addResultList(double result ) {
        resultList.add(result);
    }

    List<Double> getResultList() {
        return resultList;
    }

    public void removeResult() {
        resultList.remove(0);
    }

    public void inquiryResult() {
        for (Double v : resultList) {
            System.out.print(v + " ");
        }
    }
}

// 연산자 잘못 들어왔을 때 연산자만 다시 받는 걸로 돌리고 싶은데 흠
// 가장 간단한 방법 -> while & if문해서 연산자 받을 때 검사 안 맞느면 다시하기
// 2-8에서 고민한 것 -> 추상화로 바꾸면 calculate는 어떻게 처리하지에 관한 문제
/*
    고민한 이유 -> 매개변수의 값이 다르니까 그 값을 처리하는 과정에서 어떻게 해야할지 감이 안옴
    추상화에 대해서 다시 생각해보니까 추상 클래스에서 굳이 calculate의 값을 부모가 가져야할까란 의문
    -> 이건 값이 다르니까 차라리 자식클래스에서 갖고 있는 게 맞는 것 같다는 결론...
 */