package backjoon.javaString;

import java.util.Scanner;

public class AsciiCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println((int)string.charAt(0));
    }
}
