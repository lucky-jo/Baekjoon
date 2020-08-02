package backjoon.math_1;

import java.util.Scanner;

public class FindFractionalNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayNum = 2;
        int cnt = 0;
        int secondNum;
        int x = scanner.nextInt();

        while (true) {
            secondNum = arrayNum-1;
            for ( int i = 1; i < arrayNum; i++) {
                cnt++;
                if ( x == cnt ) {
                    if (arrayNum % 2 == 0 ) {
                        System.out.println(secondNum+"/"+i);
                        return;
                    } else {
                        System.out.println(i+"/"+secondNum);
                        return;
                    }

                }
                secondNum--;
            }
            arrayNum++;
        }
    }
}
