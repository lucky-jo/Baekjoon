package math_1;

import java.util.*;

public class FlyMe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCast = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < testCast; i++) {
            String[] strings = scanner.nextLine().split(" ");
            int x = Integer.parseInt( strings[0] );
            int y = Integer.parseInt( strings[1] );
            int distance = y - x;
            int cnt = 1;
            int total = 0;
            while (true) {
                if (distance - cnt <= 0 ) {
                    total++;
                    System.out.println(total);
                    break;
                } else {
                    distance -= cnt;
                    total ++;
                }
                if (distance - cnt <= 0 ) {
                    total++;
                    System.out.println(total);
                    break;
                } else {
                    distance -= cnt;
                    total++;
                }
                cnt++;
            }
        }
        scanner.close();
    }
}