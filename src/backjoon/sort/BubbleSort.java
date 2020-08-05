package sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BubbleSort {

    public static void main(String[] args) {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(bufferedReader.readLine());
            int[] nArray = new int[n];
            int temp;

            for (int i = 0; i < n; i++) {
                nArray[i] = Integer.parseInt(bufferedReader.readLine());
            }
            for (int i = 0; i <n-1 ; i++) {
                for (int j = i+1; j < n; j++) {
                    if ( nArray[j] < nArray[i] ) {
                        temp = nArray[j];
                        nArray[j] = nArray[i];
                        nArray[i] = temp;
                    }
                }
            }
            for (int x: nArray ) {
                bufferedWriter.write(x + "\n");
            }
            bufferedWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
