package backjoon.forloop;

import java.io.*;

public class Forloop {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int n = Integer.parseInt(bufferedReader.readLine());
            for(int i =0; i <n; i++ ) {
                String[] temp = bufferedReader.readLine().split(" ");
                bufferedWriter.write(Integer.parseInt(temp[0])+Integer.parseInt(temp[1])+"\n");
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
