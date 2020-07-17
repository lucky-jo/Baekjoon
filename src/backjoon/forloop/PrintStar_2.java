package backjoon.forloop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PrintStar_2 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int n = Integer.parseInt(bufferedReader.readLine());
            for (int i = 1; i <= n; i++ ) {
                for (int k = n-i; k > 0; k-- ) {
                    bufferedWriter.write(" ");
                }
                for (int j = 1; j <= i; j++ ) {
                    bufferedWriter.write("*");
                }
                bufferedWriter.write("\n");
            }
            bufferedWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
