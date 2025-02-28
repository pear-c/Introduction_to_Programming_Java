package Chap_08;

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

    public static void main(String[] args) {
        Problem01();

    }
}
