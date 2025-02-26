package Chap_03;

import java.util.Scanner;

public class Quiz_3_6 {
    // 문제 1. 요일 출력
    static void Problem01() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1~7 사이의 숫자를 입력하세요: ");
        int day = scanner.nextInt();

        switch (day) {
            // TODO: 숫자별로 요일을 출력하세요.
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            case 4:
                System.out.println("목요일");
                break;
            case 5:
                System.out.println("금요일");
                break;
            case 6:
                System.out.println("토요일");
                break;
            case 7:
                System.out.println("일요일");
                break;
        }
    }

    // 문제 2. 달의 일수 계산
    static void Problem02() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("월(1~12)을 입력하세요: ");
        int month = scanner.nextInt();

        switch (month) {
            // TODO: 각 월에 해당하는 일수를 출력하세요.
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31일");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30일");
                break;
            case 2:
                System.out.println("28 또는 29일");
                break;
        }
    }

    // 문제 3. 학점 계산
    static void Problem03() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int score = scanner.nextInt();

        switch (score / 10) {
            //TODO: 점수에 맞는 학점을 출력하세요.
            case 10:
            case 9:
                System.out.println("학점: A");
                break;
            case 8:
                System.out.println("학점: B");
                break;
            case 7:
                System.out.println("학점: C");
                break;
            case 6:
                System.out.println("학점 D");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("학점: F");
                break;
        }
    }

    // 문제 4. 자동차 유형구분
    static void Problem04() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("자동차 번호 4자리를 입력하세요: ");
        int number = scanner.nextInt();

        switch (number / 1000) {
            case 1:
                System.out.println("승용차");
                break;
            case 2:
                System.out.println("승합차");
                break;
            case 3:
                System.out.println("화물차");
                break;
            case 4:
                System.out.println("특수차");
                break;
        }
    }

    // 문제 8. 물건 가격 계산
    static void Problem08() {
        Scanner sc = new Scanner(System.in);

        System.out.print("물건 종류(1~3)와 개수를 입력하세요: ");
        int item = sc.nextInt();
        int count = sc.nextInt();

        switch (item) {
            case 1:
                System.out.println("총 가격: " + (count*500));
                break;
            case 2:
                System.out.println("총 가격: " + (count*1000));
                break;
            case 3:
                System.out.println("총 가격: " + (count*2000));
                break;
        }
    }

    // 문제 11. 복권 번호 검사
    static void Problem11() {
        Scanner sc = new Scanner(System.in);

        System.out.print("복권 번호를 입력하세요(3자리): ");
        int number = sc.nextInt();

        switch (number) {
            case 777:
                System.out.println("1등 당첨");
                break;
            case 555:
                System.out.println("2등 당첨");
                break;
            case 123:
                System.out.println("3등 당첨");
                break;
            default:
                System.out.println("꽝");
                break;
        }
    }

    // 문제 13. 간단 계산기
    static void Problem13() {
        Scanner sc = new Scanner(System.in);

        System.out.print("두 수와 연산자를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("결과: " + (a+b));
                break;
            case '-':
                System.out.println("결과: " + (a-b));
                break;
            case '*':
                System.out.println("결과: " + (a*b));
                break;
            case '/':
                if(b == 0) System.out.println("0으로 나눌 수 없습니다.");
                else System.out.println("결과: " + ((double)a / (double)b));
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                break;
        }
    }

    // 문제 22. 사분면 판별
    static void Problem22() {
        Scanner sc = new Scanner(System.in);

        System.out.print("x와 y 좌표를 입력하세요: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x > 0) {
            if(y > 0) System.out.println("1사분면");
            else if(y < 0) System.out.println("4사분면");
            else System.out.println("축 위에 있습니다.");
        } else if(x < 0) {
            if(y > 0) System.out.println("2사분면");
            else if(y < 0) System.out.println("3사분면");
            else System.out.println("축 위에 있습니다.");
        } else {
            System.out.println("축 위에 있습니다.");
        }
    }

    public static void main(String[] args) {
        Problem13();
    }
}
