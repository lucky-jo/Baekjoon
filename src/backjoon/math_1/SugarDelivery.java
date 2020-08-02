package backjoon.math_1;

import java.util.Scanner;

public class SugarDelivery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = 0;
        int b = 0;
        if( n % 5 == 0 ) {
            a = n / 5;
        } else if ( n % 5 == 4 ) {
            a = n / 5;
            --a;
            b = 3;
        } else if ( n % 5 == 3 ) {
            a = n / 5;
            b = 1;
        } else if ( n % 5 == 2 ) {
            a = n / 5;
            --a;
            --a;
            b = 4;
        } else if ( n % 5 == 1 ) {
            a = n / 5;
            --a;
            b = 2;
        } else {
            a = n / 5 ;
        }
        if( a < 0 ) {
            System.out.println(-1);
        } else {
            System.out.println(a+b);
        }
    }
}
