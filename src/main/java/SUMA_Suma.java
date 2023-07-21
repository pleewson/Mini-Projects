import java.util.Scanner;

public class SUMA_Suma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        int sum = 0;

        if(t >= 0 && t <= 110){
            for(int i = 0; i < t; i++){
                int value = scan.nextInt();
                sum += value;
                System.out.println(sum);
            }
        }
    }
}
//not accepted
//https://pl.spoj.com/problems/SUMA/
//cd