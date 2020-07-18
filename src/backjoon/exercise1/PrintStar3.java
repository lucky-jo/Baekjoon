package exercise1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrintStar3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n*2; i++ ) {
            if ( n == 1 ) {
                System.out.print("*");
                return;
            } else {
                if ( i % 2 == 0) {
                    for (int j =0; j < n; j++) {
                       if ( j % 2 ==0) {
                           System.out.print("*");
                       } else {
                           System.out.print(" ");
                       }
                    }
                } else {
                    for (int j =0; j < n; j++) {
                        if ( j % 2 ==0) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
