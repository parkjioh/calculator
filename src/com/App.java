package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    static void main() {
        List<Integer> results = new ArrayList<>();
        List<Double> circleAreas = new ArrayList<>();
        Calculator calculator = new Calculator(results,circleAreas);
        int result = 0;
        double circleAreasresult = 0;

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("사칙 연산을 할 경우 1, 원의 넓이를 구할 경우 2 : ");
            int choice = sc.nextInt();
            if(choice == 1) {
                System.out.print("첫 번째 숫자를 입력하세요. : ");
                // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
                int number1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요. : ");
                // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

                int number2 = sc.nextInt();
                System.out.print("사칙연산 기호를 입력하세요( + , - , *, /) : ");
                // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
                char symbols = sc.next().charAt(0);

                result = calculator.calculate(number1,number2,symbols);
                System.out.println("결과 : " + result);
            } else if (choice == 2 ) {
                System.out.print("원의 반지름을 입력하세요. : ");
                int radious = sc.nextInt();
                circleAreasresult = calculator.calculateCirecleArea(radious);
                System.out.println("결과 : " + circleAreasresult);
            } else {
                System.out.println("사칙 연산의 경우 1, 원의 넓이를 구할 경우 2입니다. 다시 입력하세요.");
                continue;
            }






            sc.nextLine();
            System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제) : ");
            String remove = sc.nextLine();
            if (remove.equals("remove")) {
                calculator.removeResult();
            }

            System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) : ");
            String inquiry = sc.nextLine();
            if (inquiry.equals("inquiry")) {
                calculator.inquiryResult();
                System.out.println();
        }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
            String exit = sc.nextLine();
            if (exit.equals("exit")) break;
        }

    }
}