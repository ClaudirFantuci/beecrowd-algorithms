import java.util.Scanner;
import java.text.DecimalFormat;

public class Beecrowd_1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double R, A;
        R = sc.nextDouble();
        A = 3.14159 * R * R; // Calculate the area of the circle
        DecimalFormat df = new DecimalFormat("0.0000"); // Format to four decimal places
        System.out.println("A=" + df.format(A)); // Print the result with four decimal places
        sc.close();
    }
}
