package Chap_02;

public class Quiz_2_2 {
    static void Problem01() {
        // TODO: 투자금액
        int principal = 15000;
        // TODO: 연이율
        double rate = 0.05;

        // TODO: 이자 계산
        int interest = (int)(principal * rate);

        System.out.println("이자는: " + interest);
    }

    static void Problem02() {
        // TODO: 변수 largeNumber 출력
        int largeNumber = 1_000_000;
        System.out.println(largeNumber);
    }

    static void Problem03() {
        // TODO: 문자열 선언
        String name = "Java Programming";

        // TODO: 문자열 출력
        System.out.println(name);

        // TODO: 문자열 길이 출력
        System.out.println(name.length());
    }

    static void Problem04() {
        // TODO: double 타입 변수
        double rate = 0.07;

        // TODO: int 타입으로 변환
        int changeRate = (int)rate;

        // TODO: 변환된 정수 값을 "변환된 값: " 뒤에 출력합니다.
        System.out.println("변환된 값: " + changeRate);

    }

    static void Problem05() {
        // TODO: 초기 잔액
        double balance = 100;

        // TODO: 월 이율
        double rate = 0.05;

        for (int month = 1; month <= 12; month++) {
            // TODO: 매달 이자 추가
            balance += (balance * rate);
        }

        // TODO: 최종 balance를 "최종 잔액: " 뒤에 출력합니다.
        System.out.println("최종 잔액: " + balance);
    }

    static void Problem06() {
        // TODO: int 타입 변수 age 설정
        int age = 25;

        // TODO: float 타입 변수 height 설정
        float height = 5.9f;

        // TODO: 두 값 출력, 출력 형식: "나이: [age], 키: [height]"
        System.out.printf("나이: %d, 키: %f", age, height);
    }

    static void Problem07() {
        // TODO: 첫 번째 정수 a를 10으로 설정
        int a = 10;

        // TODO: 두 번째 정수 b를 5로 설정
        int b = 5;

        // TODO: 비교
        boolean result = a > b ? true : false;

        System.out.println("a > b: " + result);
    }

    static void Problem08() {
        char[] chars = {'A', '가', '☺'}; // 'A', '가', '☺'

        for (char ch : chars) {
            System.out.println("문자: " + ch + ", 유니코드 값: " + Integer.toHexString(ch));
        }

    }

    public static void main(String[] args) {
        Problem08();
    }
}
