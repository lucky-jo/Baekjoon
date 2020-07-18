package backjoon.arrays1;

import java.util.Scanner;

public class CountInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[10];
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        int temp = n1*n2*n3;
        String[] countString = Integer.toString(temp).split("");
        for (int i = 0; i < countString.length; i++) {
            intArray[Integer.parseInt(countString[i])]++;
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
