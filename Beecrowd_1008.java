import java.io.IOException;
import java.util.Scanner;

public class Beecrowd_1008 {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int v1 = s.nextInt();
        int v2 = s.nextInt();
        double v3 = s.nextDouble();
        double salary = v2 * v3;

        System.out.println("NUMBER = " + v1);
        System.out.printf("SALARY = U$ %.2f%n", salary);

        s.close();

    }

}