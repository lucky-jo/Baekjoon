package whileloop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class PlusCycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] temp = new String[3];
        String cycle = scanner.nextLine();
        String origin = cycle;
        int cnt = 0;
//        System.out.println(cycle);

        try {
            while (true) {
//                System.out.println("cnt : " + cnt);

                if (cnt == 0) {
                    cnt++;
                    if (cycle.length() == 1) {
                        temp[0] = "0";
//                        System.out.println("길이가 1 일 때, temp[0] : " + temp[0]);
                        temp[1] = cycle;
//                        System.out.println("길이가 1 일 때, temp[1] : " + temp[1]);
                        origin = temp[0]+temp[1];
                    } else {
                        temp[0] = cycle.substring(0,1);
//                        System.out.println(temp[0]);
                        temp[1] = cycle.substring(1,2);
//                        System.out.println(temp[1]);
                    }
                } else {
                    cnt++;
                    temp[0] = temp[2].substring(0,1);
//                    System.out.println(temp[0]);
                    temp[1] = temp[2].substring(1);
//                    System.out.println(temp[1]);

                }
//                System.out.println(temp[0]);
//                System.out.println(temp[1]);
                String s = (Integer.toString(Integer.parseInt(temp[0]) + Integer.parseInt(temp[1])));
//                System.out.println("s = " + s.toString());
                temp[2] = temp[1] + s.substring(s.length()-1);
//                System.out.println(temp[2]);
                if (origin.equals(temp[2])) {
                    break;
                }
            }
            System.out.println(cnt);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}