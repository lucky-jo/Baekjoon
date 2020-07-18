package exercise1;

import java.util.Scanner;

public class SumAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] student = new int[5];
        int sum = 0;
        for (int i = 0; i < student.length; i++ ) {
            student[i] = Integer.parseInt(scanner.nextLine());
            if ( student[i] < 40 ) {
                sum += 40;
//                System.out.println(sum);
            } else {
                sum += student[i];
//                System.out.println(sum);
            }
        }
        System.out.println(sum/student.length);
    }
}
