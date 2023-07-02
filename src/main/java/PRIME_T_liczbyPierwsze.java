import java.util.Scanner;

public class PRIME_T_liczbyPierwsze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); //liczba testow


        for (int i = 1; i <= n; i++) { // i to nasza liczba

            if (i < 2) {
                System.out.println(i + "NIE");
            } else {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        System.out.println(i + "NIE");
                        break;
                    } else {
                        System.out.println(i + "TAK");
                        break;
                    }
                }
            }
        }
    }
}

