package backjoon.javaString;

import java.util.Scanner;

public class GroupWordChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = Integer.parseInt(scanner.nextLine());
        int cnt = 0;
        for (int j = 0; j < testCase; j++) {

            String strings = scanner.nextLine();
            boolean[] checkAphabet = new boolean[26];
            for (int i = 0; i < strings.length(); i++) {
                if (i < strings.length() - 1 && strings.charAt(i) != strings.charAt(i + 1)) {
                    if (!checkAphabet[(int) strings.charAt(i) - 97]) {
                        checkAphabet[(int) strings.charAt(i) - 97] = true;
                    } else {
                        break;
                    }
                } else if (i == strings.length() - 1 && !checkAphabet[(int)strings.charAt(i) - 97]) {
                    cnt++;
                }

            }
        }
        System.out.println(cnt);
    }
}
