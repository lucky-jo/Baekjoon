package backjoon.javaString;

import java.util.Scanner;

public class Dial {

    public static void main(String[] args){

        int[] a1 = new int[15];
        int[] a2 = new int[15];
        int cnt=3;
        int init =0;
        int x=0;
        int result =0;
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        for(int i=0; i<a.length(); i++) {
            a1[i] = a.charAt(i);
            for(int j=65; j<=90; j++) {
                if(x==cnt) {
                    x=0;
                    init++;
                    if(init==5) {
                        cnt=cnt+1;
                    }else if(init==6) {
                        cnt=cnt-1;
                    }else if(init==7) {
                        cnt=cnt+1;
                    }
                }
                if(a1[i]==j) {
                    a2[i]=init+3;
                }
                x++;
            }
            cnt=3;
            init=0;
            x=0;
        }
        for(int i=0; i<a.length(); i++) {
            result +=a2[i];
        }
        System.out.println(result);
    }
}
