package Chap_08;

import com.sun.security.jgss.GSSUtil;

import java.math.BigInteger;
import java.util.Comparator;
import java.util.Scanner;

public class Exercise_8 {
    static Scanner sc = new Scanner(System.in);

    // 연습문제 8.1 : 아래 서브루틴을 사용하여 방정식 출력하는 프로그램
    static public double root (double A, double B, double C) throws IllegalArgumentException {
        if(A == 0) {
            throw new IllegalArgumentException("A can't be zero");
        }
        else {
            double disc = B*B - 4*A*C;
            if(disc < 0) {
                throw new IllegalArgumentException("Discriminant < zero.");
            }
            return (-B + Math.sqrt(disc)) / (2*A);
        }
    }
    static void Problem01() {
        boolean again = true;
        while(again) {
            System.out.print("정수 3개 입력: ");
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            try {
                System.out.println("근: " + root (A, B, C));
            } catch(IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            System.out.print("계속 할까요? (true/false): ");
            again = sc.nextBoolean();
        }
    }

    // 연습문제 8.2: BigInteger를 이용해서 3N+1 수열을 출력하는 프로그램 작성
    static void Problem02() {

        while(true) {
            System.out.print("시작할 숫자 입력: ");
            String line = sc.nextLine();
            if(line.isEmpty()) {
                System.out.println("프로그램 종료");
                break;
            }

            BigInteger N = new BigInteger(line);
            int count = 0;
            System.out.print("3N+1 수열 시작: ");
            if(N.signum() < 1) {
                throw new IllegalArgumentException("N can't be negative");
            }
            while(!N.equals(BigInteger.ONE)) {
                System.out.print(N + " -> ");
                // N % 2 == 0
                if(N.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                    N = N.divide(BigInteger.TWO);
                }
                else {  // N = 3N + 1
                    N = N.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE);
                }
                count++;
            }
            System.out.println(N + " 총 개수 : " + count+1);
        }
    }

    // 연습문제 8.3: 로마 변환기 클래스 생성
    static void Problem03() {
        System.out.print("숫자(1~3999) or 로마 숫자 입력: ");
        String input = sc.nextLine();

        try {
            if(input.matches("\\d+")) {
                int num = Integer.parseInt(input);
                Roma roma = new Roma(num);
                System.out.println("로마 숫자: " + roma);
            }
            else {
                Roma roma = new Roma(input);
                System.out.println("아라비아 숫자: " + roma.toInt());
            }
        } catch(IllegalArgumentException e) {
            System.out.println("오류: " + e.getMessage());
        }
    }

    // 연습문제 8.4: Expr 클래스를 활용해서 결과 출력
    static void Problem04() {

    }

    public static void main(String[] args) {
        Problem04();
    }
}
