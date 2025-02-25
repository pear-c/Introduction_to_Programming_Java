package Chap_02;

import java.sql.Time;
import java.util.Random;
import java.util.Scanner;

public class Quiz_2_3 {
    static void Problem01() {
        int a = 15, b = 4;

        //TODO: Math에 정의된 서브루틴을 이용해 합, 차, 곱, 몫, 나머지를 구하세요.
        int addResult = Math.addExact(a, b);
        int subtractResult = Math.subtractExact(a, b);
        int multiplyResult = Math.multiplyExact(a, b);
        int floorDivResult = Math.floorDiv(a, b);
        int floorModResult = Math.floorMod(a, b);

        System.out.println("합: " + addResult); // 합
        System.out.println("차: " + subtractResult); // 차
        System.out.println("곱: " + multiplyResult); // 곱
        System.out.println("몫: " + floorDivResult); // 몫
        System.out.println("나머지: " + floorModResult); // 나머지
    }

    static void Problem02() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 변의 길이를 입력하세요: ");
        // 첫 번째 변의 길이(a) 받기
        int a = scanner.nextInt();
        System.out.print("두 번째 변의 길이를 입력하세요: ");
        // 두 번째 변의 길이(b) 받기
        int b = scanner.nextInt();

        // TODO: 빗변 길이 계산하기
        double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        // 빗변 길이 출력
        System.out.println("빗변의 길이: " + hypotenuse);

        scanner.close();
    }

    static void Problem03() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        // 문자열 입력 받기
        String line = scanner.nextLine();

        // TODO: 입력 받은 문자열 길이 출력하기
        System.out.println("문자열의 길이: " + line.length());

        scanner.close();
    }

    // 문제 4: 문자열 대소문자 변환
    static void Problem04() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        // TODO: 문자열을 입력 받습니다.(앞 문제 참조)
        String line = scanner.nextLine();

        // TODO: 문자열을 모든 문자를 대문자로 변환하세요.
        String upperCase = line.toUpperCase();

        // TODO: 문자열의 모든 문자를 소문자로 변환하세요.
        String lowerCase = line.toLowerCase();

        System.out.println("대문자: " + upperCase);
        System.out.println("소문자: " + lowerCase);

        scanner.close();
    }

    // 문제 5: 특정 문자 검색
    static void Problem05() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        // TODO: 문자열 한줄을 입력 받습니다.
        String line = scanner.nextLine();

        System.out.print("검색할 문자를 입력하세요: ");
        // TODO: 검색할 문자를 입력 받습니다.
        char target = scanner.next().charAt(0);

        // TODO: 문자열에서 주어진 문자를 찾습니다.
        int position = line.indexOf(target);

        if (position != -1) {
            System.out.println("문자 '" + target + "'의 위치: " + position);
        } else {
            System.out.println("문자 '" + target + "'는 문자열에 없습니다.");
        }

        scanner.close();
    }

    // 문제 6: 난수 생성 및 범위 지정
    static void Problem06() {
        // TODO: randomNumber가 0이상 100이하가 되도록 설정합니다.
        int randomNumber = (int)(Math.random() * 100);


        System.out.println("생성된 난수: " + randomNumber);
    }

    // 문제 7: 열거형 사용
    enum Season { SPRING, SUMMER, FALL, WINTER }

    static void Problem07() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("계절을 입력하세요 (SPRING, SUMMER, FALL, WINTER): ");
        // TODO: 계절을 입력 받습니다.
        String input = scanner.nextLine();

        try {
            // TODO: 입력된 계절에 맞는 열거형을 찾습니다.
            String season = Season.valueOf(input).name();

            System.out.println("입력한 계절은: " + season);
        } catch (IllegalArgumentException e) {
            // TODO: 입력된 계절이 없을 경우, IllegalArgumentException을 발생시킵니다.
            System.out.println("잘못된 계절입니다.");
        }

        scanner.close();
    }

    // 문제 8: 문자열 연결
    static void Problem08() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        //TODO: 이름을 문자열로 입력 받습니다.
        String name = scanner.nextLine();

        System.out.print("나이를 입력하세요: ");
        //TODO: 나이를 정수로 입력 받습니다.
        int age = scanner.nextInt();

        //TODO: 출력을 위한 문자열을 생성합니다.
        String message = "Hello, " + name + ". You are " + age + " years old.";
        System.out.println(message);

        //TODO: 내년에 몇살이 되는지 출력합니다.
        // message나 별도의 변수 선언을 하지 않습니다.
        System.out.println("내년에는 " + (age+1) + "살이 되는군요.");

        scanner.close();
    }

    // 문제 9: 문자열 자르기
    static void Problem09() {
        Scanner sc = new Scanner(System.in);

        System.out.print("문장을 입력하세요: ");
        String line = sc.nextLine();

        System.out.print("시작 위치를 입력하세요: ");
        int start = sc.nextInt();

        System.out.print("끝 위치를 입력하세요: ");
        int end = sc.nextInt();

        String substring = line.substring(start, end);
        System.out.println("부분 문자열: " + substring);
    }

    // 문제 10: 작업 시간 측정
    static void Problem10() {
        // TODO: 시작 시간 저장
        long startT = System.nanoTime();

        // 작업: 1부터 100까지 출력
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        // TODO: 종료 시간 저장
        long endT = System.nanoTime();

        // TODO: 소요 시간 계산
        long delay = endT - startT;

        // TODO: 소요 시간 출력
        System.out.println("작업 소요 시간(초): " + ((double)delay / 1_000_000_000));
    }



    public static void main(String[] args) {
        Problem10();

    }
}
