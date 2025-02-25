package Chap_02;

import java.util.*;

public class Quiz_2_5 {
    // 문제 01: 산술 연산
    static void Problem01() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("첫 번째 정수를 입력하세요: ");
            int a = scanner.nextInt();
            System.out.print("두 번째 정수를 입력하세요: ");
            int b = scanner.nextInt();

            // TODO : 입력된 두 정수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산 결과를 출력합니다.
            System.out.println("덧셈 결과: " + (a+b));
            System.out.println("뺄셈 결과: " + (a-b));
            System.out.println("곱셈 결과: " + (a*b));
            System.out.println("나눗셈 결과: " + (a/b));
            System.out.println("나머지 연산 결과: " + (a%b));

        } catch (InputMismatchException e) {
            System.out.println("올바르지 않은 정수가 입력되었습니다: null");
        }

        scanner.close();
    }

    // 문제 2: 나눗셈 결과의 타입 변환
    static void Problem02() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요: ");
        // TODO: 첫 번째 정수를 입력 받습니다.
        int a = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        // TODO: 두 번째 정수를 입력 받습니다.
        int b = scanner.nextInt();

        // TODO: 두 정수간 나누셈을 출력합니다.
        try {
            System.out.println("정수 나눗셈 결과: " + (a/b));

            // TODO: 정수를 실수로 변환하여 나누셈을 출력합니다.
            System.out.println("실수 나눗셈 결과: " + ((double)a / (double)b));
        } catch (ArithmeticException e) {
            System.out.println("연산에 오류가 발생하였습니다: / by zero");
        }

        scanner.close();
    }

    // 문제 3: 증가 및 감소 연산자
    static void Problem03() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        // TODO: 정수를 입력 받습니다.
        int num = scanner.nextInt();

        System.out.println("입력값: " + num);
        // TODO: ++연산자로 1증가 후 출력
        System.out.println("증가 연산 후: " + (++num));

        // TODO: --연산자로 1감소 후 출력
        System.out.println("감소 연산 후: " + (--num));

        scanner.close();
    }

    // 문제 4: 관계 연산자
    static void Problem04() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요: ");
        int a = scanner.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int b = scanner.nextInt();

        System.out.println("첫 번째 값이 두 번째 값보다 큰가? " + (a > b));
        System.out.println("첫 번째 값이 두 번째 값보다 작은가? " + (a < b));
        System.out.println("두 값이 같은가? " + (a == b));
    }

    // 문제 5: Boolean 연산자
    static void Problem05() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요: ");
        int a = scanner.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int b = scanner.nextInt();

        System.out.println("두 값이 모두 양수인가? " + ((a > 0) && (b > 0)));
        System.out.println("두 값 중 하나라도 양수인가? " + ((a > 0) || (b > 0)));
    }

    // 문제 6: 조건 연산자
    static void Problem06() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int num = scanner.nextInt();
        String answer = (num % 2) == 0 ? "짝수" : "홀수";

        System.out.println("입력한 숫자는 " + answer + "입니다.");
    }

    // 문제 7: 타입 변환과 캐스팅
    static void Problem07() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("실수를 입력하세요: ");
        double num = scanner.nextDouble();

        System.out.print("정수로 타입 변환된 값: " + (int)num);
    }

    // 문제 8: String과 숫자 변환
    static void Problem08() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열로 숫자를 입력하세요: ");
        String input = scanner.next();

        System.out.println("정수 값: " + Integer.parseInt(input));
        System.out.println("실수 값: " + Double.parseDouble(input));
    }

    // 문제 9: 할당 연산자
    static void Problem09() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요: ");
        int a = scanner.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int b = scanner.nextInt();

        System.out.println("원래 a 값: " + a);

        System.out.println("a += b: " + (a += b));
        System.out.println("a -= b: " + (a -= b));
        System.out.println("a *= b: " + (a *= b));
        System.out.println("a /= b: " + (a /= b));
    }


    public static void main(String[] args) {
        Problem09();

    }
}
