package Chap_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_7 {
    // 연습문제 7.1 : 설정한 최댓값 까지의 랜덤한 정수를 가지는 ArrayList 반환 메소드
    static ArrayList<Integer> Problem01(int count, int max) {
        if(count > max) {
            throw new IllegalArgumentException("Can't have " + count +
                    " different integers in the range 1 to " + max);
        }
        ArrayList<Integer> result = new ArrayList<>();
        while(result.size() < count) {
            int n = (int)(Math.random() * max) + 1;
            if(!result.contains(n))
                result.add(n);
        }
        return result;
    }

    // 연습문제 7.2 : 전치행렬 반환하는 메소드
    static int[][] Problem02(int[][] M) {
        int[][] result = new int[M[0].length][M.length];

        for(int i = 0; i < M.length; i++) {
            for(int j = 0; j < M[0].length; j++) {
                result[j][i] = M[i][j];
            }
        }
        return result;
    }

    // 연습문제 7.3 : Arrays.sort() vs 선택 정렬 비교
    static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }
    static void swap(int[] arr, int i ,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void Problem03() {
        // 큰 배열 생성
        int[] testArraySort = new int[10000];
        int[] testSelectionSort = new int[10000];

        for(int i = 0; i < 10000; i++) {
            int n = (int)(Math.random() * 10000) + 1;
            testArraySort[i] = n;
            testSelectionSort[i] = n;
        }

        // Arrays.sort() 테스트
        long startTime = System.nanoTime();
        Arrays.sort(testArraySort);
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000000.0;
        System.out.println("Arrays.sort() duration: "  + duration + " 초");

        // Selection Sort 테스트
        startTime = System.nanoTime();
        selectionSort(testSelectionSort);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000000.0;
        System.out.println("Selection Sort duration: " + duration + " 초");
    }

    // 연습문제 7.5 : 정수 입력을 동적으로 입력받고, 정렬 (Arrays.sort() 사용 x)
    static void Problem04() {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<100; i++) {
            System.out.print("정수 입력: ");
            int n = sc.nextInt();
            if(n == 0) {
                System.out.println("입력 종료. 정렬 시작");
                break;
            }
            arr.add(n);
        }

        for(int i=0; i<arr.size() -1 ; i++) {
            for(int j=0; j<arr.size()-i-1; j++) {
                if(arr.get(j) > arr.get(j+1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }
            }
        }

        for(int i : arr) {
            System.out.print(i + " ");
        }
    }



    public static void main(String[] args) {
        Problem04();
    }
}
