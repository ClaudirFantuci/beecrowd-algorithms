import java.util.Scanner;

public class Beecrowd_1007 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        int D = s.nextInt();
        int dif = ((A * B) - (C * D));
        System.out.println("DIFERENCA = " + dif);
        s.close();
    }

}