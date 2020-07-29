package backjoon.javaString;

import java.util.Scanner;

public class StringSumNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = Integer.parseInt(scanner.nextLine());
        String[] stringNum = scanner.nextLine().split("");
        int sum = 0;
        for (String temp : stringNum ) {
            sum += Integer.parseInt(temp);
        }
        System.out.println(sum);
    }
}
