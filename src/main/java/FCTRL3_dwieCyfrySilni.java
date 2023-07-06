import java.util.Scanner;

public class FCTRL3_dwieCyfrySilni {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        if(scan.hasNextInt()) {
            int D = scan.nextInt(); //number of tests

            if (D >= 1 && D <= 30) {
                for (int i = 1; i <= D; i++) {  //tests
                    long sum = 1;

                    long n = scan.nextLong();  //factorial num
                    if (n > 1 && n <= 1_000_000_000) {

                        for (int s = 1; s <= n; s++) {
                            sum *= s;
                        }
                    }

                    System.out.println(decimalNumber(sum) + " " + lastDigit(sum));
                }
            }
        }
        scan.close();

        int ab = 1_000_000_000;
        int ba = 1000000001;

        System.out.println(ab == ba);


    }
    private static long decimalNumber(long value){
            return value /10;
        }


    private static long lastDigit(long value){
            return value%10;
        }
    }


    //https://pl.spoj.com/problems/FCTRL3/
//need to optimize it
//tryied some things from people in java group