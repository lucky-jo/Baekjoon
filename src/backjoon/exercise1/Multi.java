package backjoon.exercise1;

import java.util.Scanner;

public class Multi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int sum1 = a*(b%10);
        int sum2 = a*((b/10)%10);
        int sum3 = a*((b/100)%10);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum1+sum2*10+sum3*100);
        sc.close();

    }
}
