package bruteForce;

import java.util.Scanner;

public class Decomposition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int size = Integer.parseInt(String.valueOf(String.valueOf(n).length()));

        for (int i = 1; i <= n; i++) {
            int temp = i;
            int sum = i;
            for (int j = 0; j < size; j++) {
                sum += temp %10;
                temp /= 10;
            }
            if (n == sum) {
                System.out.print(i);
                return;
            }
        }
        System.out.print(0);
    }
}
