package backjoon.bruteForce;

import java.util.Scanner;

public class WeightKey {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] nArray = new int[2][n];

        for (int i = 0; i < n; i++) {
            String[] strings = scanner.nextLine().split(" ");
            nArray [0][i] = Integer.parseInt(strings[0]);
            nArray [1][i] = Integer.parseInt(strings[1]);
        }

        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if( nArray[0][i] < nArray[0][j] && nArray[1][i] < nArray[1][j]) {
                    cnt++;
                }
            }
            System.out.print(cnt + " ");
        }
    }
}
