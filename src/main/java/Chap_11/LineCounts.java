package Chap_11;

import java.io.*;
import java.util.Scanner;

public class LineCounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] files = input.split(" ");

        for (String file : files) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                int count = 0;
                while (br.readLine() != null) {
                    count++;
                }
                System.out.println(file + ": " + count);
            } catch (IOException e) {
                System.out.println(file + ": " + e.getMessage());
            }
        }
    }
}
