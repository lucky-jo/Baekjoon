package bruteForce;

import java.util.Scanner;

public class BlackJek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nm = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        String[] strings = scanner.nextLine().split(" ");
        int max = 0;
        int[] black = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            black[i] = Integer.parseInt(strings[i]);
        }

        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    int temp = black[i]+black[j]+black[k];
                    if( temp <= m && temp > max ) {
                        max = temp;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
