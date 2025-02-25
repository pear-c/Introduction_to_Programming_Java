package Chap_02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz_2_4 {
    // 문제 1: 서식 지정 출력
    static void Problem01() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        // TODO: 정수를 입력 받습니다.
        int n = scanner.nextInt();

        // TODO: 요구 조건에 맞도록 출력합니다. 10자리, 오른쪽 정렬
        System.out.print("입력된 숫자는: [");
        System.out.printf("%10d", n);
        System.out.println("%]");
        scanner.close();
    }

    // 문제 2: 금액 출력
    static void Problem02() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("금액을 입력하세요: ");
        // TODO: 금액을 실수로 입력 받습니다.
        float price = scanner.nextFloat();

        // TODO: 쉼표와 소수점 둘째 자리까지만 출력합니다.
        System.out.printf("입력된 금액은: $%,.2f", price);
        scanner.close();
    }

    // 문제 3: 텍스트 입력 및 출력
    static void Problem03() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        // TODO: 문자열을 한줄 입력받습니다.
        String input = scanner.next();

        for (int i = 0; i < input.length(); i++) {
            // TODO: 문자열에서 해당 위치의 문자를 얻어와 출력합니다.
            char c = input.charAt(i);
            System.out.println(c);
        }

        scanner.close();
    }

    // 문제 4: 두 개의 정수 입력
    static void Problem04() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두 정수를 입력하세요 (공백으로 구분): ");
        // TODO: 두 수를 입력 받습니다.
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // TODO: 두 수의 합을 출력합니다.
        System.out.println("합: " + (a+b));

        // TODO: 두 수의 곱을 출력합니다.
        System.out.println("곱: + " + a*b);

        scanner.close();
    }

    // 문제 5: 파일에 텍스트 쓰기
    static void Problem05() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        // TODO: 이름을 문자열로 입력 받습니다.
        String name = scanner.next();

        // TODO: "나이를 입력하세요: "를 출력하고, 나이를 숫자로 입력 받습니다.
        scanner.nextLine(); // 버퍼 비우기
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        // TODO: "좋아하는 색을 입력하세요: "를 출력하고, 색을 문자열로 입력 받습니다.
        System.out.print("좋아하는 색을 입력하세요: ");
        String color = scanner.next();

        try (FileWriter writer = new FileWriter("profile.txt")) {
            // TODO: 파일에 입력 받은 내용을 저장합니다.
            writer.write("이름: " + name + "\n");
            writer.write("나이: " + age + "\n");
            writer.write("좋아하는 색: " + color + "\n");
            System.out.println("profile.txt에 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 저장 중 오류 발생: " + e.getMessage());
        }

        scanner.close();
    }

    // 문제 6: 파일에서 데이터 읽기
    static void Problem06() {
        try (Scanner fileScanner = new Scanner(new File("numbers.txt"))) {
            int sum = 0;
            int count = 0;

            while (fileScanner.hasNextInt()) {
                // TODO: 읽을 수 있는 숫자가 있으므로, 숫자를 읽어 더합니다.
                sum += fileScanner.nextInt();
                count++;
            }

            System.out.println("합: " + sum);
            if (count > 0) {
                // TODO: numbers.txt에 숫자가 1개 이상인 경우, 평균을 계산하여 출력합니다.
                double average = (double) sum / count;
                System.out.println("평균: " + average);
            } else {
                System.out.println("평균: 계산할 수 없음 (숫자가 없습니다).");
            }

        } catch (IOException e) {
            // 파일이 존재하지 않거나, 파일에서 데이터를 읽어 오는데 문제가 있을 경우, 예외가 발생됩니다.
            System.out.println("파일 읽기 오류: " + e.getMessage());
        }
    }

    // 문제 7: 사용자 선택 파일 출력
    static void Problem07() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("파일 이름을 입력하세요: ");
        // TODO: 문자열로 파일 이름을 입력 받습니다.
        String fileName = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            // 파일의 내용을 한줄씩 읽어 출력합니다.
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (IOException e) {
            // TODO: 입력된 이름의 파일이 존재하지 않아 예외가 발생한 경우, 메시지를 출력합니다.
            System.out.println("파일을 찾을 수 없습니다: " + fileName);
        }

        scanner.close();
    }

    // 문제 8: CSV 데이터 처리
    static void Problem08() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("CSV 형식 데이터를 입력하세요: ");
        // TODO: CSV 형식의 문자열을 입력 받습니다.
        String input = scanner.nextLine();

        // TODO: 문자열의 ','를 이용해 분립합니다. 분리 후 반환되는 값의 형태에 주의합니다.
        String[] values = input.split(",");

        for (String value : values) {
            // TODO: 각 값의 좌우 공백을 제거하고 출력합니다.
            System.out.println(value.trim());
        }

        scanner.close();
    }

    // 문제 9: 실수 배열의 최대값과 최소값
    static void Problem09() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("실수 배열을 입력하세요 (공백으로 구분): ");
        String input = scanner.nextLine();

        // TODO: 공백을 기준으로 문자열을 분리합니다.
        // 다중 공백 처리
        String newStr = input.replaceAll("\\s+", " ");
        String[] parts = newStr.split(" ");

        // 분리된 문자열 갯수만큼의 숫자 배열을 생성합니다.
        double[] numbers = new double[parts.length];

        for (int i = 0; i < parts.length; i++) {
            // TODO: 문자열을 실수로 변환합니다.
            numbers[i] = Double.parseDouble(parts[i]);
        }

        // TODO: 숫자들중 최소값과 최대값을 구합니다.
        double max = Arrays.stream(numbers).max().getAsDouble();
        double min = Arrays.stream(numbers).min().getAsDouble();

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

        scanner.close();
    }

    // 문제 10: 텍스트 정렬 출력
    static void Problem10() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();

        System.out.println("텍스트를 입력하세요 (종료하려면 빈 줄을 입력):");
        int maxLength = 0;

        while (true) {
            // TODO: 문자열을 입력받습니다.
            String line = scanner.nextLine();

            // TODO: 입력된 문자열이 빈 문자열인 경우, 입력을 종료합니다.
            if (line.isEmpty()) {
                break;
            }

            // 입력된 문자열을 저장합니다.
            lines.add(line);

            //  출력 길이를 최대 길이 문자열에 맞추기 위해 길이를 계산해 둡니다.
            maxLength = Math.max(maxLength, line.length());
        }

        System.out.println("\n오른쪽 정렬된 텍스트:");
        for (String line : lines) {
            // TODO: 각 문자열을 정렬된 형태로 출력합니다.
            System.out.printf("%" + maxLength + "s\n", line);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Problem10();

    }
}
