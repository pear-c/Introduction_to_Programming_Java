package Chap_10;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Exercise_10 {
    static void Problem01() {
        PhoneDirectory pd = new PhoneDirectory();

        pd.putNumber("Amy", "010-1234-1234");
        System.out.println(pd.getNumber("Amy"));
    }

    static void Problem02() {
        Scanner sc = new Scanner(System.in);

        System.out.println("집합 연산 입력 (예: [1,2,3] + [3,5,7]) ");

        while(true) {
            System.out.print("입력: ");
            String input = sc.nextLine().trim();

            if(input.equalsIgnoreCase("exit"))
                break;

            try {
                processInput(input);
            } catch (Exception e) {
                System.out.println("오류: " + e.getMessage());
            }
        }

        sc.close();
    }
    static void processInput(String input) {
        String opr = findOperator(input);
        String[] parts = input.split("[+*-]");

        if(parts.length != 2) {
            throw new IllegalArgumentException("올바른 형식이 아닙니다.");
        }

        TreeSet<Integer> setA = parseSet(parts[0]);
        TreeSet<Integer> setB = parseSet(parts[1]);

        TreeSet<Integer> result = performOperation(setA, setB, opr);

        System.out.println("결과: " + result);
    }
    static String findOperator(String input) {
        for(char c : input.toCharArray()) {
            if("+*-".indexOf(c) != -1) {
                return String.valueOf(c);
            }
        }
        throw new IllegalArgumentException("연산자가 포함되지 않은 입력입니다.");
    }
    static TreeSet<Integer> parseSet(String input) {
        input = input.trim().replace("[", "").replace("]", "");

        if(input.isEmpty()) {
            return new TreeSet<>();
        }
        return Arrays.stream(input.split(","))
                .map(String::trim)
                .map(Integer::parseInt)
                .filter(num -> num > 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }
    static TreeSet<Integer> performOperation(TreeSet<Integer> setA, TreeSet<Integer> setB, String operator) {
        TreeSet<Integer> result = new TreeSet<>(setA);

        switch(operator) {
            case "+" -> result.addAll(setB);
            case "-" -> result.removeAll(setB);
            case "*" -> result.removeAll(setA);
            default -> throw new IllegalArgumentException("지원되지 않는 연산자");
        }
        return result;
    }

    static void Problem03() {
        MyHashTable mt = new MyHashTable(10);

        System.out.println("초기 크기: " + mt.size());

        mt.put("apple", "red");
        mt.put("banana", "yellow");
        mt.put("grape", "purple");

        System.out.println("해시테이블 크기: " + mt.size());

        mt.remove("banana");

        System.out.println("해시테이블 크기: " + mt.size());

        System.out.println(mt.containsKey("apple"));
        System.out.println(mt.containsKey("banana"));
    }

    public static void main(String[] args) {
        Problem03();
    }
}
