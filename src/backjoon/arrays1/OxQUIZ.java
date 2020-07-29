package backjoon.arrays1;

import java.util.Scanner;

public class OxQUIZ {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] string = scanner.nextLine().split("");
            int cnt = 0;
            int sum = 0;
            for (int j = 0; j < string.length; j++) {
                if ( string[j].equals("O") ) {
                    ++cnt;
                    sum += cnt;
                } else {
                    cnt = 0;
                }
            }
            System.out.println(sum);
        }
        scanner.close();
    }
}
