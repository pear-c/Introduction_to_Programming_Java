package Chap_03;

import java.util.Scanner;

public class Quiz_3_7 {
    // 문제 1. NumberFormatException 처리
    static void Problem01() {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        String input = sc.nextLine();

        // TODO: 정수 변환시 exception이 발생할 수 있으므로, try...catch문을 추가해 주세요.
        try {
            // TODO: input이 정수변환합니다.
            int age = Integer.parseInt(input);
            System.out.println("나이: " + age);
        } catch (NumberFormatException e) {
            System.out.println("숫자가 아닙니다! 유효한 나이를 입력하세요.");
        }
    }

    // 문제 2. IllegalArgumentException 처리
    static void Problem02() {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        String input = sc.nextLine();

        try {
            // TODO:  나이가 정상적으로 입력되었는지 확인하세요.
            int age = Integer.parseInt(input);
            if(age < 0) throw new IllegalArgumentException("나이는 음수일 수 없습니다.");

            System.out.println("나이: " + age);
        } catch (IllegalArgumentException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }

    // 문제 3. 여러 예외 처리
    static void Problem03() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("인덱스를 입력하세요: ");
            String input = sc.nextLine();

            int index = Integer.parseInt(input);

            int[] numbers = { 1, 2, 3 };
            System.out.println(numbers[index]); // ArrayIndexOutOfBoundsException 발생
        } catch(ArrayIndexOutOfBoundsException e) {
            // TODO: NumberFormatException과 ArrayIndexOutOfBoundsException을 처리하여 예외 메시지를 출력하기
            System.out.println("배열 인덱스가 잘못되었습니다.");

            // catch가 추가로 필요한 경우, 추가해 주세요.
        } catch(NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없는 문자열입니다.");
        }
    }

    // 문제 4. Exception 변환하기
    static void Problem04() {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        String input = sc.next();

        // TODO: input이 정수가 아닌 경우, Exception이 발생합니다.
        // 이를 IllegalArgumentException로 변경해 던집니다.
        try {
            int age = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("정수가 아닙니다");
        }
    }

    // 문제 5. finally 블록 사용
    static void Problem05() {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        try {
            int age = sc.nextInt();
            System.out.println("나이: " + age);
        } finally {
            sc.close();
        }
    }

    // 문제 6. 예외 정보 출력
    static void Problem06() {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        int age= sc.nextInt();

        try {
            /* TODO:
             * 나이가 정상적으로 입력되었는지 확인하세요.
             * 음수로 입력된 경우, IllegalArgumentException을 발생시킵니다.
             * 이때, 입력된 정보를 포함한 메시지를 추가하세요.
             */
            if(age < 0) {
                throw new IllegalArgumentException("잘못된 나이 입력 -> " + age + " (음수 입력 불가)");
            }
            System.out.println("나이: " + age);
        } catch (IllegalArgumentException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Problem06();
    }
}
