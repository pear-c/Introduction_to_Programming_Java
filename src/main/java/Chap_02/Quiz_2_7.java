package Chap_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Quiz_2_7 {
    // 연습 문제 2.2
    static void Problem02() {
        int dice1 = (int)(Math.random() * 6) + 1;
        System.out.println("첫 번째 주사위 결과: " + dice1);

        int dice2 = (int)(Math.random() * 6) + 1;
        System.out.println("두 번째 주사위 결과: " + dice2);
        System.out.println("총합: " + (dice1 + dice2));
    }

    // 연습 문제 2.3
    static void Problem03() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력해주세요: ");
        String name = sc.nextLine();

        System.out.println("Hello, " + name.toUpperCase() + ", nice to meet you!");
    }

    // 연습 문제 2.5
    static void Problem05() {
        Scanner sc = new Scanner(System.in);

        System.out.print("계란 개수를 입력해주세요: ");
        int N = sc.nextInt();

        int gross = (N / 144);
        int dozen = (N % 144 / 12);
        int mod = (N % 144 % 12);

        System.out.printf("당신의 계란 수는 %d gross, %d dozen, %d입니다.", gross, dozen, mod);
    }

    // 연습 문제 2.6
    static void Problem06() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름과 성을 공백으로 구분하여 입력하세요: ");
        String[] name = sc.nextLine().split(" ");

        System.out.printf("이름은 %s이며, %d개의 문자로 구성됩니다.\n", name[0], name[0].length());
        System.out.printf("성은 %s이며, %d개의 문자로 구성됩니다.\n", name[1], name[1].length());

        String initial = name[0].charAt(0) + "" + name[1].charAt(0);
        System.out.println("이니셜은 " + (initial) + "입니다.");
    }

    // 연습 문제 2.7
    static void Problem07() {
        Scanner sc = new Scanner(System.in);

        String fileName = "testdata.txt";

        try(Scanner fileScanner = new Scanner(new File(fileName))) {
            String name = fileScanner.nextLine();
            int a = fileScanner.nextInt();
            int b = fileScanner.nextInt();
            int c = fileScanner.nextInt();

            System.out.println("학생 이름: " + name);
            System.out.println("평균: " + (double)((a+b+c) / 3));
        } catch (FileNotFoundException e) {
            System.out.println("올바르지 않은 파일 형식입니다.");
        }
    }

    public static void main(String[] args) {
        Problem07();

    }
}
