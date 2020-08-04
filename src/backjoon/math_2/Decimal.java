package math_2;

import java.util.Scanner;

public class Decimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int min = 10001;
        int sum = 0;

        for (int i = m; i <= n; i++) {
            if (i == 1 ) {
                continue;
            }
            if( checkDecimal(i) && min > i ) {
//                System.out.println(i);
                min = i;
                sum += i;
            } else if ( checkDecimal(i)) {
//                System.out.println(i);
                sum += i;
            }
        }
        if ( sum == 0 ) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    public static boolean checkDecimal ( int n ) {
        for (int j = 2; j < n; j++) {
            if( n % j == 0 ) {
                return false;
            }
        }
        return true;
    }
}
