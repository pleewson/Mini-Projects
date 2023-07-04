import java.util.Scanner;

public class PRZEDSZK_Przedszkolanka {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            int a, b;

            a = scan.nextInt();
            b = scan.nextInt();

            if (a >= 10 && a <= 30 && b >= 10 && b <= 30) {

                int gcd = GCD(a, b);
                System.out.println(LCD(a, b, gcd));

            }
        }
        scan.close();
    }


    private static int GCD (int one, int two) { //NWD - GCD - greates common division
        while (one != two) { //dopoki liczby nie sa rowne
            if (one > two) { // sprawdzamy ktore sa wieksze
                one = one - two;
            } else {
                two = two - one;
            }
        }
        return one;
    }

    private static int LCD (int one, int two, int gcd){ //lowest common division
        return (one * two) / gcd;
    }
}

//https://pl.spoj.com/problems/PRZEDSZK/