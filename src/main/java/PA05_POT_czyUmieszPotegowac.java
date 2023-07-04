import java.math.BigInteger;
import java.util.Scanner;

public class PA05_POT_czyUmieszPotegowac {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int D = scan.nextInt(); // liczba testów
        for (int i = 0; i < D; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();


            BigInteger result = BigInteger.valueOf(a).pow(b);

            String resultString = String.valueOf(result);
            char lastDigit = resultString.charAt(resultString.length() - 1);
            System.out.println(lastDigit);
        }

        scan.close();
    }
}

//not accepted task.
//https://pl.spoj.com/problems/PA05_POT/
