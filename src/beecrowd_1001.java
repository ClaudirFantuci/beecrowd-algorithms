import java.io.IOException;

import java.util.Scanner;

public class Beecrowd_1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;
        System.out.println("X = " + c);
        sc.close();
    }
}