import java.util.Arrays;
import java.util.Scanner;
import java.math.BigInteger;

public class FCTRL3_dwieCyfrySilni {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BigInteger[] nArr = new BigInteger[0];

        if (scan.hasNextInt()) {
            int D = scan.nextInt(); //number of tests

            if (D >= 1 && D <= 30) {
                BigInteger sum = BigInteger.ONE;
                for (int i = 1; i <= D; i++) {  //tests

                    int n = scan.nextInt();  //factorial num
                    if (n >= 0 && n <= 1_000_000_000) {


                        while(n >= nArr.length){
                            nArr = increaseArray(nArr);
                            sum = sum.multiply(BigInteger.valueOf(nArr.length));
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

    private static BigInteger decimalNumber(BigInteger value) {
        return value.divide(BigInteger.TEN);
    }


    private static BigInteger lastDigit(BigInteger value) {
        return value.mod(BigInteger.TEN);
    }


    private static BigInteger[] increaseArray(BigInteger[] longArray) {
        return Arrays.copyOf(longArray, longArray.length + 1);
    }

}


    //https://pl.spoj.com/problems/FCTRL3/
//need to optimize it? but how?
//tryied some things from people in java group
//its not because variable //long, int also dont work.
//after saving values into Array time is longer than before