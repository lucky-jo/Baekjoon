package backjoon.arrays1;

import java.util.Scanner;

public class NewAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max = 0;
        int[] tempArray = new int[n];
        Double[] doubleArray = new Double[n];

        String[] s = scanner.nextLine().split(" ");
        for (int i =0; i < n; i++ ) {
            tempArray[i] = Integer.parseInt(s[i]);
            if ( max < tempArray[i]) {
                max = tempArray[i];
            }
        }
        double sum = 0.0;
        for (int i = 0; i < n; i++ ) {
            doubleArray[i] = (double)tempArray[i]/(double)max*100.0;
            sum += doubleArray[i];
        }
        System.out.println(sum/(double)n);


    }
}
