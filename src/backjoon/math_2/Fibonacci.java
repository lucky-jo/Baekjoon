package math_2;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int first = 0;
        int second = 1;
        int sum = first + second;
        if ( n == 0 ) {
            System.out.println(0);
        } else if ( n == 1 ) {
            System.out.println(1);
        } else {
            for (int i = 2; i <= n ; i++) {
                sum = first + second;
                first = second;
                second = sum;
            }
            System.out.println(sum);
        }


    }
}
