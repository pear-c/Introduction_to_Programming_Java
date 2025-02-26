package Chap_03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Quiz_3_5 {
    // 문제 1. 두 수 비교
    static void Problem01() {
        Scanner sc = new Scanner(System.in);

        System.out.print("두 정수를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("큰 값: " + ((a > b) ? a : b));
    }

    // 문제 2. 세 수 중 가장 큰 수
    static void Problem02() {
        Scanner sc = new Scanner(System.in);

        System.out.print("세 정수를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("가장 큰 값: " + Math.max(a, (Math.max(b, c))));
    }

    // 문제 3. 양수/음수 판별
    static void Problem03() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요");
        int n = sc.nextInt();

        if(n == 0) System.out.println(0);
        else if(n > 0) System.out.println("양수입니다.");
        else System.out.println("음수입니다.");
    }

    // 문제 4. 짝수/홀수 판별
    static void Problem04() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요");
        int n = sc.nextInt();

        System.out.println((n % 2 == 0) ? "짝수입니다." : "홀수입니다.");
    }

    // 문제 5. 성적 판별
    static void Problem05() {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수를 입력하세요: ");
        int n = sc.nextInt();

        System.out.print("성적: ");
        if(90 <= n && n <= 100) System.out.println("A");
        else if(80 <= n && n < 90) System.out.println("B");
        else if(70 <= n && n < 80) System.out.println("C");
        else if(60 <= n && n < 70) System.out.println("D");
        else if(0 <= n && n < 60) System.out.println("F");
    }

    // 문제 6. 계절 출력
    static void Problem06() {
        Scanner sc = new Scanner(System.in);

        System.out.print("월을 입력하세요 (1~12): ");
        int n = sc.nextInt();

        System.out.print("계절: ");
        if(3 <= n && n <= 5) System.out.println("봄");
        else if(6 <= n && n <= 8) System.out.println("여름");
        else if(9 <= n && n <= 11) System.out.println("가을");
        else if(n == 12 || n == 1 || n == 2) System.out.println("겨울");
    }

    // 문제 7. 세 숫자 정렬
    static void Problem07() {
        Scanner sc = new Scanner(System.in);

        System.out.print("세 숫자를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        List<Integer> list = Arrays.asList(a, b, c);
        list.sort(Integer::compareTo);

        for(int i : list) System.out.print(i + " ");
    }

    // 문제 8. 두 문자 비교
    static void Problem08() {
        Scanner sc = new Scanner(System.in);

        System.out.print("두 문자를 입력하세요: ");
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);

        List<Character> list = Arrays.asList(a, b);
        list.sort(Character::compareTo);

        for(char c : list) System.out.print(c + " ");
    }

    // 문제 9. 숫자 양수/음수 판별 및 절댓값 출력
    static void Problem09() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int n = sc.nextInt();

        if(n < 0) System.out.println("음수입니다.");
        else if(n > 0) System.out.println("양수입니다.");
        else System.out.println("0 입니다.");

        System.out.println("절댓값: " + Math.abs(n));
    }

    // 문제 10. 배수 확인
    static void Problem10() {
        Scanner sc = new Scanner(System.in);

        System.out.print("두 정수를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a % b == 0)
            System.out.println(a + "은 " + b + "의 배수입니다.");
        else
            System.out.println(a + "은 " + b + "의 배수가 아닙니다.");
    }

    // 문제 11. 숫자 범위 확인
    static void Problem11() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int n = sc.nextInt();

        if(1 <= n && n <= 100)
            System.out.println(n + "은 범위 안에 있습니다.");
        else
            System.out.println(n + "은 범위 밖에 있습니다.");
    }

    // 문제 13. 특정 숫자 포함 여부
    static void Problem13() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a % b == 0 || a % c == 0)
            System.out.println(a + "은 " + b + " 또는 " + c + "의 배수입니다.");
        else
            System.out.println(a + "은 " + b + " 또는 " + c + "의 배수가 아닙니다.");
    }

    // 문제 14. 입력값 비교
    static void Problem14() {
        Scanner sc = new Scanner(System.in);

        System.out.print("두 정수를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("작은 값: " + Math.min(a, b));
    }

    // 문제 16. 네 자리 수 판별
    static void Problem16() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int n = sc.nextInt();

        if(n / 1000 != 0)
            System.out.println("네 자리 수 입니다.");
    }

    // 문제 17. 윤년 판별
    static void Problem17() {
        Scanner sc = new Scanner(System.in);

        System.out.print("연도 입력: ");
        int n = sc.nextInt();

        if((n % 4 == 0) && (n % 100 != 0) && (n % 400 == 0))
            System.out.println("윤년 입니다.");
        else if(n % 4 == 0)
            System.out.println("윤년 입니다.");
        else
            System.out.println("윤년이 아닙니다.");
    }

    public static void main(String[] args) {
        Problem17();
    }
}
