package backjoon.math_1;

import java.util.Scanner;

public class BeeRoom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int cnt = 1;

        while (true) {
            if( n == 1 ) {
                break;
            } else if ( (n-1) - ((cnt*cnt+cnt)/2)*6 <= 0 ) {
                cnt++;
                break;
            } else {
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
