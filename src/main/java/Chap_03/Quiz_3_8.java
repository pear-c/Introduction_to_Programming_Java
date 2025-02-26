package Chap_03;

import java.util.*;

public class Quiz_3_8 {
    // 문제 1. 배열의 합과 평균
    static void Problem01() {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int[] numbers = new int[sc.nextInt()];

        System.out.print("배열의 크기만큼 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // TODO: 배열 요소들의 합을 계산해 출력하세요.
        System.out.println("합계: " + Arrays.stream(numbers).sum());
        System.out.println("평균: " + Arrays.stream(numbers).average().getAsDouble());
    }

    // 문제 2. 최댓값과 최솟값 찾기
    static void Problem02() {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int[] numbers = new int[sc.nextInt()];

        System.out.print("배열의 크기만큼 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // TODO: 최소값, 최대값을 찾아 출력하세요.
        System.out.println("최소값: " + Arrays.stream(numbers).min().getAsInt());
        System.out.println("최대값: " + Arrays.stream(numbers).max().getAsInt());
    }

    // 문제 3. 배열 역순 출력
    static void Problem03() {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int[] numbers = new int[sc.nextInt()];

        System.out.print("배열의 크기만큼 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // TODO: 역순으로 출력하세요.
        for(int i=numbers.length-1; i>=0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }

    // 문제 4. 배열에서 특정 값 찾기
    static void Problem04() {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int[] numbers = new int[sc.nextInt()];

        System.out.print("배열의 크기만큼 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("배열에서 찾을 값을 입력하세요: ");
        int target = sc.nextInt();

        // TODO: 정수 배열에서 target을 찾아 출력하세요.
        int index = Arrays.binarySearch(numbers, target);
        if(index != -1)
            System.out.println(target + "은 인덱스 " + index + "에 존재합니다.");
        else
            System.out.println("존재하지 않음");
    }

    // 문제 5. 배열에서 중복된 값 찾기
    static void Problem05() {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int[] numbers = new int[sc.nextInt()];

        System.out.print("배열의 크기만큼 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // TODO: 중복된 값을 출력합니다.
        System.out.print("중복된 값: ");
        int max = Arrays.stream(numbers).max().getAsInt();
        boolean[] check = new boolean[max+1];
        for(int i : numbers) {
            if(!check[i])
                check[i] = true;
            else {
                System.out.print(i + " ");
            }
        }
    }

    // 문제 6. 배열에서 특정 값 제거
    static void Problem06() {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int[] numbers = new int[sc.nextInt()];

        System.out.print("배열의 크기만큼 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("배열에서 제거할 값을  입력하세요: ");
        int target = sc.nextInt();

        // TODO: 배열에서 특정 값을 제외하여, 새로운 배열을 생성합니다.
        // 배열의 길이는 유효한 요소수와 같습니다.
        System.out.print("결과 값: ");
        List<Integer> list = new ArrayList<>();
        for(int i : numbers) {
            if(i != target)
                list.add(i);
        }
        for(int i : list) System.out.print(i + " ");
    }

    // 문제 7. 2차원 배열의 합 계산
    static void Problem07() {
        Scanner sc = new Scanner(System.in);

        System.out.print("2차원 배열의 크기를 입력하세요: ");
        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] matrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            System.out.print((i + 1) + "번째 행의 정수를 입력하세요: ");
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // TODO: 2차원 배열의 합을 출력하세요.
        int sum = 0;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("배열의 합: " + sum);
    }

    // 문제 8. 행별 합계 계산
    static void Problem08() {
        Scanner sc = new Scanner(System.in);

        System.out.print("2차원 배열의 크기를 입력하세요: ");
        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] matrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            System.out.print((i + 1) + "번째 행의 정수를 입력하세요: ");
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // TODO: 각 행의 합을 구해서 출력하세요.
        for(int i=0; i < row; i++) {
            int colSum = 0;
            for(int j=0; j < column; j++) {
                colSum += matrix[i][j];
            }
            System.out.println((i+1) + "행의 합: " + colSum);
        }
    }

    // 문제 9. 열별 합계 계산
    static void Problem09() {
        Scanner sc = new Scanner(System.in);

        System.out.print("2차원 배열의 크기를 입력하세요: ");
        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] matrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            System.out.print((i + 1) + "번째 열의 정수를 입력하세요: ");
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //TODO: 각 열의 합을 계산해 출력하세요.
        for(int i=0; i < column; i++) {
            int rowSum = 0;
            for(int j=0; j < row; j++) {
                rowSum += matrix[j][i];
            }
            System.out.println((i+1) + "열의 합: " + rowSum);
        }
    }

    // 문제 10. 대각선 합 계산
    static void Problem10() {
        Scanner sc = new Scanner(System.in);

        System.out.print("2차원 배열의 크기를 입력하세요: ");
        int rowColumn = sc.nextInt();

        int[][] matrix = new int[rowColumn][rowColumn];

        for (int i = 0; i < rowColumn; i++) {
            System.out.print((i + 1) + "번째 열의 정수를 입력하세요: ");
            for (int j = 0; j < rowColumn; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // TODO: 두 대각선의 합을 계산해 출력하세요.
        int rightDiagonalSum = 0;
        int leftDiagonalSum = 0;

        for(int i=0; i < rowColumn; i++) {
            for(int j=0; j < rowColumn; j++) {
                if(j == i)
                    leftDiagonalSum += matrix[i][j];
                if(j == (rowColumn-1 - i))
                    rightDiagonalSum += matrix[i][j];
            }
        }
        System.out.println("주 대각선의 합: " + rightDiagonalSum);
        System.out.println("부 대각선의 합: " + leftDiagonalSum);
    }

    // 문제 11. 배열 요소의 이동
    static void Problem11() {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.print("배열의 요소를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("회전수를 입력하세요: ");
        int rotate = sc.nextInt();

        //TODO: 배열의 요소를 주어진 횟수만큼 오른쪽으로 회전시켜 출력하세요.
        System.out.print("회전 결과: ");
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i : numbers) {
            deque.addLast(i);
        }
        for(int i=0; i<rotate % size; i++) {
            deque.addFirst(deque.pollLast());
        }
        for(int i : deque)
            System.out.print(i + " ");
    }


    public static void main(String[] args) {
        Problem11();
    }
}
