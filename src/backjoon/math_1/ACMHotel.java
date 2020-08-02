package backjoon.math_1;

import java.util.Scanner;

public class ACMHotel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = Integer.parseInt(scanner.nextLine());
        int h = 0;
        int w = 0;
        int n = 0;

        for (int i = 0; i < testCase; i++) {
            String[] strings = scanner.nextLine().split(" ");
            h = Integer.parseInt(strings[0]);
            w = Integer.parseInt(strings[1]);
            n = Integer.parseInt(strings[2]);

            if(n % h == 0 ) {
                System.out.println( ( n%h) + "" + n/h <);
            } else {
                System.out.println( String.valueOf(n%h + "" + ((n/h)+1 < 10 ? 0+""+ (int)((n/h)+1) : (int)(n/h)+1))  );
            }
        }
    }
}
