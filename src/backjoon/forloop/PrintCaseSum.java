package backjoon.forloop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PrintCaseSum {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int n = Integer.parseInt(bufferedReader.readLine());
            for (int i = 1; i <= n; i++ ) {
                String[] temp = bufferedReader.readLine().split(" ");
                bufferedWriter.write("Case #"+i+": "+(Integer.parseInt(temp[0])+Integer.parseInt(temp[1]))+"\n");
            }
            bufferedWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
