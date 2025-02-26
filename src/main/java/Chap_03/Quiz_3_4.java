package Chap_03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Quiz_3_4 {
    // 문제 1. For 루프 사용
    static void Problem01() {
        for(int i=1; i<=10; i++) {
            System.out.print(i + " ");
        }
    }

    // 문제 2. 역순 출력
    static void Problem02() {
        for(int i=10; i>=1; i++) {
            System.out.print(i + " ");
        }
    }

    // 문제 3. 특정 범위의 짝수 출력
    static void Problem03() {
        for(int i=2; i<=20; i+=2) {
            System.out.print(i + " ");
        }
    }

    // 문제 4. 합 계산
    static void Problem04() {
        int sum = 0;
        for(int i=1; i<=100; i++) {
            sum += i;
        }
        System.out.println("합: " + sum);
    }

    // 문제 5. 약수 찾기
    static void Problem05() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int n = sc.nextInt();

        System.out.print("12의 약수: ");
        for(int i=1; i<=n; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // 문제 6. 약수 개수 세기
    static void Problem06() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int n = sc.nextInt();

        int count = 0;
        for(int i=1; i<=n; i++) {

            if(n % i == 0) {
                count++;
            }
        }
        System.out.println("약수 개수: " + count);
    }

    // 문제 7. 곱셈표 출력
    static void Problem07() {
        for(int i=1; i<=12; i++) {
            for(int j=1; j<=12; j++) {
                System.out.printf("%4d", (i*j));
            }
            System.out.println();
        }
    }

    // 문제 8. 문자열 처리 : 문자 나열
    static void Problem08() {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력: ");
        String s = sc.next();

        for(int i=0; i<s.length(); i++) {
            System.out.print(s.charAt(i));
        }
    }

    // 문제 9. 알파벳 출력
    static void Problem09() {
        for(int i=65; i<=90; i++) {
            System.out.print((char)i + " ");
        }
    }

    // 문제 10. 특정 문자 포함 여부 확인
    static void Problem10() {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력: ");
        String s = sc.next();

        System.out.print("문자 입력: ");
        char c = sc.next().charAt(0);

        if(s.contains(String.valueOf(c))) {
            System.out.println("포함되어 있습니다.");
        } else {
            System.out.println("포함되어 있지 않습니다.");
        }
    }

    // 문제 11. 패턴 출력
    static void Problem11() {
        for(int i=0; i<5; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    // 문제 12. 두 문자열의 공통 문자 찾기
    static void Problem12() {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 1: ");
        String s1 = sc.next();

        System.out.print("문자열 2: ");
        String s2 = sc.next();

        System.out.print("공통 문자: ");

        Set<Character> set = new HashSet<>();
        for(int i=0; i<s1.length(); i++) {
            if(s2.contains(String.valueOf(s1.charAt(i)))) {
                set.add(s1.charAt(i));
            }
        }

        for(char ch : set) {
            System.out.print(ch + " ");
        }
    }

    // 문제 13. 팩토리얼 계산
    static int factorial(int n) {
        if(n == 1) return 1;
        return n * factorial(n - 1);
    }

    static void Problem13() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int n = sc.nextInt();

        System.out.println("팩토리얼: " + factorial(n));
    }

    // 문제 14. 소수 판별
    static void Problem14() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int n = sc.nextInt();

        if(n < 2) {
            System.out.println("소수가 아닙니다.");
            return;
        }

        for(int i=2; i<n; i++) {
            if(n % i == 0) {
                System.out.println("소수가 아닙니다.");
                return;
            }
        }
        System.out.println("소수입니다.");
    }

    // 문제 15. 구구단 출력
    static void Problem15() {
        Scanner sc = new Scanner(System.in);

        System.out.print("단 입력: ");
        int n = sc.nextInt();

        for(int i=1; i<10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n*i);
        }
    }

    // 문제 16. 리스트 합 계산
    static void Problem16() {
        int[] arr = {3, 7, 10, 5};
        System.out.println("합: " + Arrays.stream(arr).sum());
    }

    // 문제 17. 역삼각형 패턴 출력
    static void Problem17() {
        for(int i=0; i<5; i++) {
            for(int j=5; j>i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    // 문제 18. 문자열 뒤집기
    static void Problem18() {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력: ");
        String s = sc.next();

        StringBuilder sb = new StringBuilder(s).reverse();
        System.out.println("뒤집힌 문자열: " + sb);
    }

    // 문제 19. 등차수열 생성
    static void Problem19() {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 항 (a): ");
        int a = sc.nextInt();

        System.out.print("공차 (d): ");
        int d = sc.nextInt();

        System.out.print("항의 갯수 (n): ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            System.out.print((a) + " ");
            a += d;
        }
    }

    // 문제 20. 중첩 루프 피라미드 패턴
    static void Problem20() {
        for(int i=0; i<5; i++) {
            for(int j=5; j>i; j--) {
                System.out.print(' ');
            }
            for(int j=0; j<=i; j++) {
                System.out.print('*');
            }
            for(int j=0; j<i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Problem20();
    }
}
