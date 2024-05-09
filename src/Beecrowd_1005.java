import java.io.IOException;
import java.util.Scanner;

public class Beecrowd_1005 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        a *= 3.5;
        b *= 7.5;
        double result = (a + b) / 11;
        System.out.printf("MEDIA = %.5f%n", result);
        sc.close();

    }

}