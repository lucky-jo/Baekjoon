package backjoon.javaString;

import java.util.Scanner;

public class CroatiaString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String strings = scanner.nextLine();
        scanner.close();
        int cnt = strings.length();
//        System.out.println(cnt);

        for (int i = 0; i < strings.length() ; i++) {
            if( strings.charAt(i) == '=' ) {
                if( i >= 2 && strings.charAt(i-1) == 'z' && strings.charAt(i-2) == 'd' ) {
//                    System.out.println("= 2감소");
                    cnt--;
                    cnt--;
                } else {
//                    System.out.println("= 감소");
                    cnt--;
                }
            } else if ( strings.charAt(i) == '-') {
//                System.out.println("- 감소");
                cnt--;
            } else if ( strings.charAt(i) == 'j') {
                if ( i >= 1 && (strings.charAt(i-1) == 'l' || strings.charAt(i-1) == 'n')) {
//                    System.out.println("j 감소");
                    cnt--;
                }
            }
        }
        System.out.println(cnt);
    }
}
