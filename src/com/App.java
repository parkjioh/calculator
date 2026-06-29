package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    static void main() {
        /*
        // 연산의 결과를 저장할 수 있도록 적합한 타입의 배열을 생성합니다.
        int[] resultArr = new int[10];
        // 연산의 결과를 비어있는 곳에 저장하기 위해 저장할 때마다 count 합니다.
        int count = 0;
         */

        List<Integer> resultList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("첫 번째 숫자를 입력하세요. : ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int number1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요. : ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

            int number2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요( + , - , *, /) : ");
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            sc.nextLine();
            String symbols = sc.nextLine();

            int result = 0;
            // 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.
            switch (symbols.trim()) {
                case "+": result = number1 + number2; break;
                case "-": result = number1 - number2; break;
                case "*": result = number1 * number2; break;
                case "/": {
                    if (number2 == 0 ) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        return;
                    } else {
                        result = number1 / number2 ;
                        break;
                    }
                }
                default: System.out.println("올바른 연산자를 입력하세요."); continue;

            }

            System.out.println("결과 : " + result);

            resultList.add(result);

            System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제) : ");
            String remove = sc.nextLine();
            if (remove.equals("remove")) {
                resultList.remove(0);
            }



          /*  //현재 저장된 index가 마지막(9)라면 가장 먼저 저장된 결과 값이 삭제 되고 새로운 결과 값이 마지막 index에 저장될 수 있도록 구현합니다.
            if (count == 9) {
                for (int i = 0; i < 10; i ++){
                    if (i == 9) {
                        resultArr[i] = result;
                    } else {
                        resultArr[i] = resultArr[i+1];
                    }
                }
            } else {
                // 연산의 결과를 배열에 저장합니다.
                resultArr[count] = result;
                //index를 증가시킵니다.
                count++;
            }

           */

            System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiry = sc.nextLine();
            if (inquiry.equals("inquiry")) {
                for (Integer i : resultList) {
                    System.out.print(i+  " ");
                }
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
            String exit = sc.nextLine();
            if (exit.equals("exit")) break;
        }

    }
}