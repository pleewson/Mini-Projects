import java.util.Scanner;

public class RNO_DOD_prosteDodawanie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt(); //amout of tests
        for(int i = 0; i < t; i++){
            int sum = 0;

            int n = scan.nextInt(); //amout of numbers to sum
            for(int j = 0; j < n; j++){
                int a = scan.nextInt(); //value of number to sum

                sum += a;
            }

            System.out.println(sum);
        }
    }
}
