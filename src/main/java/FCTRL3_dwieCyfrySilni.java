import java.util.Arrays;
import java.util.Scanner;

public class FCTRL3_dwieCyfrySilni {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long[] nArr = new long[0];

        if (scan.hasNextInt()) {
            int D = scan.nextInt(); //number of tests

            if (D >= 1 && D <= 30) {
                long sum = 1;
                for (int i = 1; i <= D; i++) {  //tests

                    int n = scan.nextInt();  //factorial num
                    if (n >= 0 && n <= 1_000_000_000) {


                        while(n >= nArr.length){
                            nArr = increaseArray(nArr);
                            sum *= nArr.length;
                           nArr[nArr.length-1] = sum;
                        }

                        if(n == 0){
                            System.out.println(decimalNumber(nArr[n]) + " " + lastDigit(nArr[n]));
                        }else {
                            System.out.println(decimalNumber(nArr[n - 1]) + " " + lastDigit(nArr[n - 1]));
                        }
                    }
                }
            }
        }
        scan.close();


    }

    private static long decimalNumber(long value) {
        return value / 10;
    }


    private static long lastDigit(long value) {
        return value % 10;
    }


    private static long[] increaseArray(long[] longArray) {
        return Arrays.copyOf(longArray, longArray.length + 1);
    }
}

    //https://pl.spoj.com/problems/FCTRL3/
//need to optimize it
//tryied some things from people in java group