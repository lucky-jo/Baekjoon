package math_2;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 1;
        int n = scanner.nextInt();
        for (int i = 2; i <= n ; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
