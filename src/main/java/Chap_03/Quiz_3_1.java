package Chap_03;

import java.util.Scanner;

public class Quiz_3_1 {
    static void Problem01() {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("두 정수를 입력하세요 (공백으로 구분): ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            // TODO: 두수의 합을 구합니다.
            {
                int result = num1 + num2;
                System.out.println("합: " + result);
            }

            // TODO: 두수의 곱을 구합니다.
            {
                int result = num1 * num2;
                System.out.println("곱: " + result);
            }
        }
    }

    // 문제 2: 빈 블록 사용
    static void Problem02() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int n = sc.nextInt();

        if(n >= 10) {

        } else {
            System.out.println("작은 수");
        }
    }

    // 문제 3: while 루프로 1부터 N까지 합 계산
    static void Problem03() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int n = sc.nextInt();

        int sum = 0;
        int i=0;
        while(i <= n) {
            sum += i;
            i++;
        }
        System.out.println("합: " + sum);
    }

    // 문제 7: 제어 흐름 다이어그램 구현
    static void Problem07() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        while(true) {
            int n = sc.nextInt();
            if(n == 0)
                break;

            if(n % 2 == 0)
                System.out.println(n);
        }
    }

    // 문제 8: Fibonacci 수열 생성
    static void Problem08() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int n = sc.nextInt();

        int prev = 0;
        int cur = 1;
        int i = 0;
        while(i < n) {
            System.out.print(cur + " ");
            int temp = prev;
            prev = cur;
            cur = temp + prev;
            i++;
        }
    }

    // 문제 13: 최대공약수 계산
    static int gcd(int a, int b) {
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }
    static void Problem13() {
        Scanner sc = new Scanner(System.in);

        System.out.print("두 정수를 입력하세요(공백으로 구분): ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("최대공약수: " + gcd(a, b));
    }
    public static void main(String[] args) {
        Problem13();
    }
}
