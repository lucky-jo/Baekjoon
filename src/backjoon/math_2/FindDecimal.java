package math_2;

import java.util.Scanner;

public class FindDecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = Integer.parseInt(scanner.nextLine());
        int cnt = 0;
        String[] strings = scanner.nextLine().split(" ");
        for (int i = 0; i < testCase; i++) {
            if( Integer.parseInt(strings[i]) == 1 ) {
                continue;
            }
            for (int j = 2; j < Integer.parseInt(strings[i]); j++) {
                if ( Integer.parseInt(strings[i]) % j == 0) {
                    cnt--;
                    break;
                }
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
