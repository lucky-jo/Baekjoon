package whileloop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class while_1 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String[] n = new String[2];
            while (true) {
                n = bufferedReader.readLine().split(" ");
                if( n[0].equals("0") && n[1].equals("0")) {
                    break;
                } else {
                    bufferedWriter.write(Integer.parseInt(n[0])+Integer.parseInt(n[1])+"\n");
                }
            }
            bufferedWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
