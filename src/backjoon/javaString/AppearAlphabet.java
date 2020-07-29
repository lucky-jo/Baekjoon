package backjoon.javaString;

import java.util.Scanner;

public class AppearAlphabet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alphabet = scanner.nextLine();
        int[] appearAlphabet = new int[26];
        for (int i = 0; i < appearAlphabet.length; i++) {
            appearAlphabet[i] = -1;
        }

        for (int i = 0; i < alphabet.length(); i++) {
            int temp = (int)alphabet.charAt(i)-97;
            if ( appearAlphabet[temp] == -1 ) {
                appearAlphabet[temp] = i;
            }
        }
        for (int i = 0; i < appearAlphabet.length; i++) {
            System.out.print(appearAlphabet[i] + " ");
        }
    }
}
