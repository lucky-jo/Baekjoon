package backjoon.javaString;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PrintRepeatString {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int testCast = Integer.parseInt(bufferedReader.readLine());
            for (int i = 0; i < testCast; i++) {
                String[] repeatString = bufferedReader.readLine().split(" ");
                int repeatCount = Integer.parseInt(repeatString[0]);
                String[] strings = repeatString[1].split("");
                for (int j = 0; j < strings.length; j++) {
                    for (int k = 0; k < repeatCount; k++) {
                        bufferedWriter.write(strings[j]);
                    }
                }
                bufferedWriter.write("\n");
            }
            bufferedWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
