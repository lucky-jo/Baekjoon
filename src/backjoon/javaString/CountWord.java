package backjoon.javaString;

import java.util.Scanner;

public class CountWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        String strings = scanner.nextLine().trim();
            if (strings.isEmpty() ) {
            } else {
                cnt++;
            }
        for (int i = 0; i < strings.length(); i++) {
            if ( strings.charAt(i) == ' ' ) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
