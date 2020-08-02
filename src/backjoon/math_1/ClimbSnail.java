package backjoon.math_1;

import java.util.Scanner;

public class ClimbSnail {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split(" ");
        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[1]);
        int v = Integer.parseInt(strings[2]);
        int cnt = 0;
        int sum = 0;

        int temp = v-a;
        if ( temp <= 0 ) {
            System.out.println(1);
            return;
        }
        if ( temp % (a-b) == 0 ) {
            System.out.println( (temp / (a-b))+1 );
        } else {
            System.out.println( (temp / (a-b))+2 );
        }

//        while (true) {
//            sum += a;
//            cnt++;
//            if( v == sum ) {
//                break;
//            } else {
//                sum -= b;
//            }
//        }
//        System.out.println(cnt);



    }
}
