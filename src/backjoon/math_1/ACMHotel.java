package math_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ACMHotel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int testCase = Integer.parseInt(scanner.nextLine());
        int h = 0;
        int w = 0;
        int n = 0;

        for (int i = 0; i < testCase; i++) {
            String[] strings = scanner.nextLine().split(" ");
            h = Integer.parseInt(strings[0]);
            w = Integer.parseInt(strings[1]);
            n = Integer.parseInt(strings[2]);

            if(n % h == 0 ) {
                list.add( h*100 + (n/h) );
            } else {
                list.add( (n%h)*100 + (n/h+1) );
            }
        }
        for (Integer x: list  ) {
            System.out.println(x);
        }
    }
}
