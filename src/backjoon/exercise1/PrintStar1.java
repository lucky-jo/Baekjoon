package exercise1;

import java.util.Scanner;

public class PrintStar1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < 2*n-1; i++ ) {
            if(i < n ) {
                for (int j = 0; j < i+1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 2*n-1-i; j > 0; j-- ) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
