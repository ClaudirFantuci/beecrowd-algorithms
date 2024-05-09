import java.util.Scanner;
import java.text.DecimalFormat;

public class Beecrowd_1006 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        double media = ((a * 2) + (b * 3) + (c * 5)) / 10;
        DecimalFormat f = new DecimalFormat("0.0");
        System.out.println("MEDIA = " + f.format(media));
        s.close();
    }
}