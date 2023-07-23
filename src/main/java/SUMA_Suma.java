import java.util.Scanner;

public class SUMA_Suma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;

            while(scan.hasNextInt()){
                int value = scan.nextInt();

                if(value >= -100 && value <= 100) {
                    sum += value;
                    System.out.println(sum);
                }
            }
        }
    }

//accepted
//https://pl.spoj.com/problems/SUMA/
