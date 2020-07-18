package backjoon.arrays1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class VoidDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> intSet = new HashSet<>();

        int temp =0;

        for (int i = 0; i < 10; i++ ) {
            temp = Integer.parseInt(scanner.nextLine());
            intSet.add( temp % 42 );
        }
        System.out.println(intSet.size());
    }
}
