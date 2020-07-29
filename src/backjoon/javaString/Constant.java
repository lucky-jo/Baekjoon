package backjoon.javaString;

import java.util.Scanner;

public class Constant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int reverseFirstNum = 0;
        int reverseSecondNum = 0;

        for (int i = 2; i > -1; i--) {
            reverseFirstNum += (firstNum % 10)*Math.pow(10,i);
            firstNum /= 10;
            reverseSecondNum += (secondNum % 10)*Math.pow(10,i);
            secondNum /= 10;
        }
        System.out.println( reverseFirstNum > reverseSecondNum ? reverseFirstNum : reverseSecondNum);
    }
}
