package backjoon.javaString;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StudyWord {

    public static void main(String[] args) {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabet = new int[26];
        int index = 0;
        int cnt = 0;
        int max = 0;
        try {
            String strings = bufferedReader.readLine().toUpperCase();
            for (int i = 0; i < strings.length(); i++) {
                alphabet[(int)strings.charAt(i)-65] += 1;
            }
            for (int i = 0; i < alphabet.length; i++) {
                if( alphabet[i] > max ) {
                    max = alphabet[i];
                    index = i;
                }
            }
            for (int i = 0; i < alphabet.length; i++) {
                if( alphabet[i] == max ) {
                    cnt++;
                }
            }
            if( cnt != 1 ) {
                bufferedWriter.write("?");
            } else {
                bufferedWriter.write((char)(index+65));
            }
            bufferedWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
