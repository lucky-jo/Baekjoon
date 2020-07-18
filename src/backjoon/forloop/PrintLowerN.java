package backjoon.forloop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PrintLowerN {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String[] n = bufferedReader.readLine().split(" ");
            String[] array = bufferedReader.readLine().split(" ");
            for (int i = 0; i < array.length; i++ ) {
                if( Integer.parseInt(n[1]) > Integer.parseInt(array[i]) ) {
                    bufferedWriter.write(array[i]+" ");
                }
            }
            bufferedWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
