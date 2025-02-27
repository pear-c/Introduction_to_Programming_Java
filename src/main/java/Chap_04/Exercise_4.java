package Chap_04;

import java.util.Arrays;
import java.util.HexFormat;
import java.util.Scanner;

public class Exercise_4 {
    // 연습 문제 4.1 : 문자열 내 각 단어의 첫 글자를 대문자로 변경하는 함수 생성
    static void printCapitalized(String str) {
        String[] inputs = str.split(" ");
        for(String s : inputs) {
            char c = s.charAt(0);
            if(Character.isLetter(c) && Character.isLowerCase(c)) {}
                s = s.replace(c, Character.toUpperCase(c));
            System.out.print(s + " ");
        }

    }

    // 연습 문제 4.2 : 주어진 문자에 대한 16진수 값을 switch 문을 사용하여 찾는 hexValue 함수 생성
    static int hexValue(char c) {
        return switch (c) {
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> c - '0';
            case 'A', 'a' -> 10;
            case 'B', 'b' -> 11;
            case 'C', 'c' -> 12;
            case 'D', 'd' -> 13;
            case 'E', 'e' -> 14;
            case 'F', 'f' -> 15;
            default -> -1;
        };
    }
    static void Problem02() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        String s = sc.nextLine();

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int n = hexValue(s.charAt(i));
            if(n == -1) {
                System.out.println("올바른 16진수 표기가 아닙니다.");
            }
            result = 16 * result + n;
        }
        System.out.println(result);
    }

    // 연습 문제 4.3 : 목표로 하는 숫자가 나올때까지 주사위 굴린 횟수 반환
    static int rollDice(int target) {
        if(target < 2 || target > 12) {
            throw new IllegalArgumentException("올바르지 않은 주사위 값입니다.");
        }

        int count = 0;
        while(true) {
            int dice1 = (int)(Math.random() * 6) + 1;
            int dice2 = (int)(Math.random() * 6) + 1;

            int sum = dice1 + dice2;
            if(sum == target) {
                return count;
            }
            count++;
        }
    }
    static void Problem03() {
        System.out.println("Snake eyes가 나올때까지 주사위를 굴린 횟수: " + rollDice(2));
    }

    // 연습 문제 4.4 : 목표 숫자가 나올때까지의 평균 굴림 횟수는 얼마인지 구하는 함수 (10000번)
    static void Problem04() {
        System.out.println("Total On Dice      Average Number of Rolls");
        System.out.println("-------------      -----------------------");

        for(int i=2; i<=12; i++) {
            int totalCount = 0;
            for(int j=0; j<10000; j++) {
                totalCount += rollDice(i);
            }

            double average = (double)totalCount / (double)10000;
            System.out.printf("     %2d                  %f\n", i, average);
        }
    }

    // 연습 문제 4.5 : 람다표현식 연습
    interface ArrayProcessor {
        double apply(double[] array);
    }
    // 배열 값의 합
    static ArrayProcessor sum() {
        return array -> Arrays.stream(array).sum();
    }
    // 배열 값의 평균
    static ArrayProcessor average() {
        return array -> Arrays.stream(array).sum() / array.length;
    }
    // 배열 내 최대값
    static ArrayProcessor findMax() {
        return array -> Arrays.stream(array).max().getAsDouble();
    }
    // 배열 내 최솟값
    static ArrayProcessor findMin() {
        return array -> Arrays.stream(array).min().getAsDouble();
    }
    // 배열 내 해당 value 값 개수 찾기
    static ArrayProcessor counter(double value) {
        return array -> {
            int count = 0;
            for(int i=0; i<array.length; i++) {
                if(array[i] == value) {
                    count++;
                }
            }
            return count;
        };
    }

    // 연습문제 4.8 : 간단한 덧셈 퀴즈 프로그램. 10개의 질문과 사용자의 대답을 받고,
    // 모든 대답을 마친 후 정답과 점수 출력
    // 3가지 함수(퀴즈 생성, 퀴즈 진행, 퀴즈 채점)
    static int[] number1 = new int[10];
    static int[] number2 = new int[10];
    static int[] answer = new int[10];

    static void makeQuiz(int i) {
        int num1 = (int)(Math.random() * 100) + 1;
        int num2 = (int)(Math.random() * 100) + 1;

        System.out.print((i+1) + "번째 문제 -> " + num1 + " + " + num2 + " = ");

        number1[i] = num1;
        number2[i] = num2;
    }

    static void playQuiz() {
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<10; i++) {
            makeQuiz(i);

            int number = sc.nextInt();
            answer[i] = number;
        }

        checkAnswer();
    }

    static void checkAnswer() {
        System.out.println("--------------채점을 시작합니다.----------------");
        int count = 0;
        for(int i=0; i<10; i++) {
            System.out.print((i+1) + "번째 문제 -> " + number1[i] + " + " + number2[i] + " = " + answer[i] + " / ");
            if((number1[i] + number2[i]) == answer[i]) {
                System.out.println("정답입니다 !");
                count++;
            } else {
                System.out.println("오답입니다. (정답: " + (number1[i] + number2[i]) + ")");
            }
        }
        System.out.println("--------------------------------------------");
        System.out.println("사용자의 점수: " + count + " / 10");
    }


    public static void main(String[] args) {
        playQuiz();
    }
}
