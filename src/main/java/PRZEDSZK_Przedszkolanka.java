import java.util.Scanner;

public class PRZEDSZK_Przedszkolanka {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int N = scan.nextInt();

        for(int i = 0; i < N; i++){
            int a, b;

            do{
                a = scan.nextInt();
            }while(a >= 10 || a <= 30);

            do{
                b = scan.nextInt();
            }while(b >= 10 || b <= 30);

            System.out.println(NWD(a,b));

        }
        scan.close();
    }

    private static int NWD (int one, int two) {
        while (one != two) { //dopoki liczby nie sa rowne
            if (one > two) { // sprawdzamy ktore sa wieksze
                one = one - two;
            } else {
                two = two - one;
            }
        }
        return one;
    }
}
