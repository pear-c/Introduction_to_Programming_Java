package Chap_08;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Roma {
    private final int number;
    private final String roman;

    private static final Map<Character, Integer> romanToIntMap = new LinkedHashMap<>();
    static {
        romanToIntMap.put('M', 1000);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('I', 1);
    }

    private static final Map<Integer, String> intToRomanMap = new LinkedHashMap<>();
    static {
        intToRomanMap.put(1000, "M");
        intToRomanMap.put(900, "CM");
        intToRomanMap.put(500, "D");
        intToRomanMap.put(400, "CD");
        intToRomanMap.put(100, "C");
        intToRomanMap.put(90, "XC");
        intToRomanMap.put(50, "L");
        intToRomanMap.put(40, "XL");
        intToRomanMap.put(10, "X");
        intToRomanMap.put(9, "IX");
        intToRomanMap.put(5, "V");
        intToRomanMap.put(4, "IV");
        intToRomanMap.put(1, "I");
    }

    public Roma(int number) {
        if(number < 1 || number > 3999) {
            throw new IllegalArgumentException("숫자는 1에서 3999 사이여야 합니다.");
        }
        this.number = number;
        this.roman = intToRoman(number);
    }

    public Roma(String roman) {
        if(!isValidRoman(roman)) {
            throw new IllegalArgumentException("올바른 로마 숫자가 아님.");
        }
        this.roman = roman;
        this.number = romanToInt(roman);
    }

    private int romanToInt(String roman) {
        int sum = 0;
        int prevValue = 0;

        for(int i=roman.length()-1; i>=0; i--) {
            int value = romanToIntMap.get(roman.charAt(i));

            if(value < prevValue) {
                sum -= value;
            }
            else {
                sum += value;
            }

            prevValue = value;
        }
        return sum;
    }

    private String intToRoman(int number) {
        StringBuilder sb = new StringBuilder();

        for(Map.Entry<Integer, String> entry : intToRomanMap.entrySet()) {
            while(number >= entry.getKey()) {
                sb.append(entry.getValue());
                number -= entry.getKey();
            }
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return roman;
    }

    public int toInt() {
        return number;
    }

    private boolean isValidRoman(String roman) {
        return roman.matches("M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})");
    }
}
