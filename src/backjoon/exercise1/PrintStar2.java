package exercise1;

import java.util.Scanner;

public class PrintStar2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < 2 * n - 1; i++) {
            if (i < n) {
                for (int k = i; k > 0; k--) {
                    System.out.print(" ");
                }
                for (int j = 2 * n - 1 - (i * 2); j > 0; j--) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for( int k = 2 * n - 1 - i-1; k > 0; k-- ) {
                    System.out.print(" ");
                }
                for (int j = (i-n)*2+3; j > 0; j--  ) {
                    System.out.print("*");
                }
                System.out.println();

            }
        }
    }
}