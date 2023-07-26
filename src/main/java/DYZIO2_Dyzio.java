import java.util.Scanner;

public class DYZIO2_Dyzio {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); // amout of tests

        if(N >= 1 && N <= 20000){
            for(int i = 0; i < N; i++){
                int sumPrime = 0;

                int a = scan.nextInt(); //begin
            int b = scan.nextInt(); //end

              if(a >= 2 && a <= b && b <= 1_000_000) {
                for(int h = a; h <= b; h++){
                    if(isPrime(h)){
                        sumPrime++;
                    }
                }
              }
                  System.out.println(sumPrime);
            }
        }
        scan.close();
    }



    public static boolean isPrime(int number){
         if(number <= 1){
            return false;
         }
        for(int i=2; i<number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}


//https://pl.spoj.com/problems/DYZIO2/
//seems okey but not accepted