package Chap_03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise_3 {
    // 연습문제 3.1 : 주사위 2개 모두 1나올때 까지 굴리기
    static void Problem01() {
        int count = 0;

        while(true) {
            int dice1 = (int)(Math.random() * 6) + 1;
            int dice2 = (int)(Math.random() * 6) + 1;

            if(dice1 == 1 && dice2 == 1) {
                System.out.println("[" + dice1 + ", " + dice2 + "]");
                System.out.println("굴린 횟수: " + count);
                break;
            }
            System.out.println("[" + dice1 + ", " + dice2 + "]");
            count++;
        }
    }

    // 연습문제 3.2 : 1~10000 까지 정수 중, 가장 많은 약수를 가진 정수와 약수 갯수 구하기
    static int findDivisor(int n) {
        int count = 0;
        if(n == 1) {
            return 1;
        }
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        return count;
    }
    static void Problem02() {
        int maxDivisor = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=1; i<=10000; i++) {
            int n = findDivisor(i);
            if(n > maxDivisor) {
                maxDivisor = n;
                max = i;
            }
        }
        System.out.println("가장 많은 약수를 가진 정수: " + max);
        System.out.println("약수 갯수: " + (maxDivisor+1));
    }

    // 연습문제 3.3 : 사용자가 입력한 수식을 계산하는 프로그램 (첫 번째 숫자로 0 입력 시 종료)
    static void Problem03() {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("연산 입력 (예시: 2 * 2) : ");
            double a = sc.nextDouble();
            char operator = sc.next().charAt(0);
            double b = sc.nextDouble();

            if(a == 0) {
                System.out.println("프로그램 종료!");
                break;
            }

            switch(operator) {
                case '+':
                    System.out.println("결과: " + (a + b));
                    break;
                case '-':
                    System.out.println("결과: " + (a - b));
                    break;
                case '*':
                    System.out.println("결과: " + (a * b));
                    break;
                case '/':
                    System.out.println("결과: " + (a / b));
                    break;
            }
        }
    }

    // 연습문제 3.4 : 텍스트 한줄을 읽고, 단어가 아닌 문자는 제외하고 한줄 씩 출력
    static void Problem04() {
        Scanner sc = new Scanner(System.in);

        System.out.print("문장 입력: ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);

        for(int i=0; i<s.length(); i++) {
            if(!Character.isAlphabetic(s.charAt(i)) && s.charAt(i) != ' ') {
                sb.replace(i, i+1, " ");
            }
        }
        // 다중 공백 제거 후 문자열 배열에 저장
        String[] result = sb.toString().replaceAll("\\s+", " ").split(" ");
        for(String str : result) {
            System.out.println(str);
        }
    }

    // 연습문제 3.5 : 파일에서 도시 데이터를 읽어와, 모든 도시의 판매 총액 계산. + 데이터를 사용할 수 없던 도시의 개수 출력
    static void Problem05() {
        try (Scanner sc = new Scanner(new File("sales.dat"))){
            int count = 0;
            double total = 0;

            while(sc.hasNextLine()) {
                String[] inputs = sc.nextLine().split(":");
                String city = inputs[0];
                try {
                    double price = Double.parseDouble(inputs[1]);
                    total += price;
                } catch (NumberFormatException e) {
                    count++;
                }
            }
            System.out.println("모든 도시의 판매 총액: " + total);
            System.out.println("데이터를 사용하지 못한 도시의 개수: " + count);
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다." + e.getMessage());
        }
    }

    // 연습문제 3.6 : (3.2 문제)를 수정하여 최대 약수 개수를 가진 모든 숫자를 출력
    // 약수 찾는 함수 findDivisor()는 위쪽에서 작성됨
    static void Problem06() {
        int maxDivisor = Integer.MIN_VALUE;
        List<Integer> maxNums = new ArrayList<>();

        for(int i=1; i<=10000; i++) {
            int n = findDivisor(i);
            if(n > maxDivisor) {
                maxDivisor = n;
            }
        }
        // 최대 약수 개수와 동일한 개수를 가지는 정수 찾기
        for(int i=1; i<=10000; i++) {
            int n = findDivisor(i);
            if(n == maxDivisor) {
                maxNums.add(i);
            }
        }
        System.out.println("최대 약수 갯수: " + (maxDivisor+1));
        System.out.println("최대 약수 갯수를 가진 정수들:");
        for(int i : maxNums) {
            System.out.printf("%6d\n", i);
        }
    }

    public static void main(String[] args) {
        Problem06();
    }
}
