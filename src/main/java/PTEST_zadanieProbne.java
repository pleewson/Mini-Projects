import java.util.Scanner;

public class PTEST_zadanieProbne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();

        if(A < 200 && B < 200){
            System.out.println(A + B);
        }

    }
}

//https://pl.spoj.com/problems/PTEST/
//accepted