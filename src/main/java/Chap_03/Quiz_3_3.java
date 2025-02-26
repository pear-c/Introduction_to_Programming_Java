package Chap_03;

import java.util.Scanner;

public class Quiz_3_3 {
    // 문제 1: 평균 계산 프로그램
    static void Problem01() {
        Scanner sc = new Scanner(System.in);

        System.out.print("양의 정수를 입력하세요 (0을 입력하면 종료): ");

        int sum = 0;
        int count = 0;
        while(true) {
            int n = sc.nextInt();
            if (n == 0) break;
            sum += n;
            count++;
        }
        System.out.println("평균: " + (double)sum/(double)count);
    }

    // 문제 2: While 루프에서 최소값, 최대값 찾기
    static void Problem02() {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 (0을 입력하면 종료): ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while(true) {
            int n = sc.nextInt();
            if (n == 0) break;
            if (n > max) max = n;
            if (n < min) min = n;
        }
        System.out.println("최솟값: " + min);
        System.out.println("최댓값: " + max);
    }

    // 문제 3: 숫자 뒤집기
    static void Problem03() {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력: ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s).reverse();
        System.out.println("뒤집힌 숫자: " + sb);
    }

    static void Problem08() {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 1: ");
        String s1 = sc.nextLine();
        System.out.print("문자열 2: ");
        String s2 = sc.nextLine();

        a: for(int i=0; i<s1.length(); i++) {
            char c = s1.charAt(i);
            for(int j=0; j<s2.length(); j++) {
                if(c == s2.charAt(j)) {
                    System.out.println("공통 문자: " + c);
                    break a;
                }
            }
        }
    }

    static void Problem09() {
        Scanner sc = new Scanner(System.in);

        int answer = (int)(Math.random() * 100);

        System.out.println("1부터 100 사이의 숫자를 맞춰보세요!");
        while(true) {
            System.out.print("숫자 입력: ");
            int n = sc.nextInt();

            if(n == answer) break;

            if(n < answer)
                System.out.println("더 큰 숫자를 입력하세요.");
            else
                System.out.println("더 작은 숫자를 입력하세요.");
        }
    }

    static void Problem10() {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("입력: ");
            String s = sc.nextLine();

            if(s.equals("exit")) {
                System.out.println("프로그램 종료");
                break;
            } else
                System.out.println("입력한 값: " + s);
        }
    }

    static void Problem11() {
        int i=2, j=1;

        while(i<10) {
            while(j < 10) {
                System.out.printf("%d x %d = %d\n", i, j, (i*j));
                j++;
            }
            i++;
            j=1;
        }
    }

    static void Problem12() {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("1에서 10 사이의 숫자를 입력하세요.: ");
            int n = sc.nextInt();
            if(1 <= n && n <= 10) {
                System.out.println("유효한 입력: " + n);
                break;
            }
        }
    }

    static void Problem13() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        int n = sc.nextInt();

        if(n < 2) {
            System.out.println("소수가 아닙니다");
            return;
        }

        if(n == 2) {
            System.out.println("소수입니다.");
            return;
        }

        for(int i=2; i<n; i++) {
            if(n%i == 0) {
                System.out.println("소수가 아닙니다.");
                return;
            }
        }
        System.out.println("소수입니다.");
    }

    static void Problem14() {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요 (종료: 'end'): ");
        while(true) {
            String s = sc.nextLine();
            if(sc.nextLine().equals("end")) break;

            if(s.length() > 3)
                continue;
            System.out.println("짧은 문자열: " + s);
        }
    }

    static void Problem15() {
        int i=0, j=0;
        while(i < 4) {
            while(j <= i) {
                System.out.print('*');
                j++;
            }
            System.out.println();
            j=0;
            i++;
        }
    }

    static void Problem16() {
        int seedMoney = 100;

        while(seedMoney > 0) {
            // 묵 : 0, 찌 : 1, 빠 : 2
            int player = (int)(Math.random() * 3);
            int banker = (int)(Math.random() * 3);

            if(player == 0) {
                if(banker == 1) seedMoney += 10;
                else if(banker == 2) seedMoney -= 10;
            } else if(player == 1) {
                if(banker == 0) seedMoney -= 10;
                else if(banker == 2) seedMoney += 10;
            } else {
                if(banker == 0) seedMoney += 10;
                else if(banker == 1) seedMoney -= 10;
            }

            System.out.println("현재 금액: " + seedMoney);
        }
    }

    static void Problem17() {
        Scanner sc = new Scanner(System.in);

        String password = "12345";
        while(true) {
            System.out.print("비밀번호를 입력하세요: ");
            String s = sc.nextLine();
            if(s.equals(password)) {
                System.out.println("로그인 성공!");
                break;
            }
        }
    }

    static void Problem19() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int value = scanner.nextInt();
            // TODO : 코드를 작성하세요.
            if(value == 0) break;

            if(value % 2 != 0)
                continue;

            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        Problem19();
    }
}
