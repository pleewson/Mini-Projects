import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int D = scan.nextInt(); // liczba przypadków

        for (int i = 0; i < D; i++) {
            int n = scan.nextInt(); // liczba n

            if (n >= 0 && n <= 1_000_000_000) {
                int[] result = computeFactorialDigits(n);
                System.out.println(result[0] + " " + result[1]);
            }
        }
//w
        scan.close();
    }

    private static int[] computeFactorialDigits(int n) {
        if (n <= 1) {
            return new int[] { 0, 1 };
        }

        int tensDigit = 0;
        int onesDigit = 1;

        for (int i = 2; i <= n; i++) {
            int carry = 0;

            for (int j = 0; j <= tensDigit; j++) {
                int product = (onesDigit * i) + carry;
                int digit = product % 10;
                carry = product / 10;

                onesDigit = digit;
            }

            while (carry > 0) {
                tensDigit++;
                int product = (onesDigit * carry) + carry;
                int digit = product % 10;
                carry = product / 10;

                onesDigit = digit;
            }
        }

        return new int[] { tensDigit, onesDigit };
    }
}
