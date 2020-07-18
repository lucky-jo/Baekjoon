package exercise1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String temp1 = bufferedReader.readLine();
            String[] temp = bufferedReader.readLine().split(" ");
            int[] intArray = new int[temp.length];
            for (int i = 0; i < temp.length; i++ ) {
                intArray[i] = Integer.parseInt(temp[i]);
            }
            Arrays.sort(intArray);
            bufferedWriter.write(intArray[0] + " " + intArray[intArray.length-1]);
            bufferedWriter.flush();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
