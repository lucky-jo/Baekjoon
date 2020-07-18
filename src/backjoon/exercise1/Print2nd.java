package exercise1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Print2nd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] temp = scanner.nextLine().split(" ");
        int[] n = new int[3];
        for (int i = 0; i < temp.length; i++ ) {
            n[i] = Integer.parseInt(temp[i]);
        }
        Arrays.sort(n);
        System.out.println(n[1]);

    }
}
