package backjoon.arrays1;

import java.util.Scanner;

public class MaxIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 1;
        int max = 0;
        int temp = 0;
        for (int i = 0; i < 9; i++ ) {
            temp = Integer.parseInt(scanner.nextLine());
            if( max < temp) {
                max = temp;
                index = i+1;
            }
        }
        System.out.println(max + "\n" + index);
    }
}