import java.util.Scanner;

public class PRIME_T_liczbyPierwsze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); //liczba testow


        for (int i = 0; i < n; i++) {

            int num = scan.nextInt(); //liczba do sprawdzenia
            boolean isPrimeNumber = true;

            if (num < 2) {
                isPrimeNumber = false;
            } else {
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        isPrimeNumber = false;
                        break;
                    }
                }
            }
            if(isPrimeNumber == true){
                System.out.println("TAK");
            }else{
                System.out.println("NIE");
            }
        }
        scan.close();
    }
}

