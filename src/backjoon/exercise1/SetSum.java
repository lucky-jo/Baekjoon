package exercise1;

import java.util.Scanner;

public class SetSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] temp = new int[5];
        int minSet1 = 20001;
        int minSet2 = 20001;
        for (int i = 0; i < temp.length; i++ ) {
            temp[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < 3; i++ ) {
            if( temp[i] < minSet1) {
                minSet1 = temp[i];
            }
        }
        for (int i = 3; i < 5; i++ ) {
            if( temp[i] < minSet2) {
                minSet2 = temp[i];
            }
        }
        System.out.println(minSet1+minSet2-50);
    }
}
