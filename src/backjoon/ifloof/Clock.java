package backjoon.ifloof;

import java.util.Scanner;

public class Clock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b < 45 ) {
            b = 60 + b - 45;
            if( a == 0 ) {
                a = 23;
                System.out.println(a + " " + b);
            } else {
                --a;
                System.out.println(a + " " + b);
            }
        } else {
            System.out.println(a + " " + (b-45));
        }
        sc.close();

    }
}
