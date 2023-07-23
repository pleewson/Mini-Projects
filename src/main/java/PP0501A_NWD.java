import java.util.Scanner;

public class PP0501A_NWD {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt(); //liczba testow

        for(int i = 0; i < t; i++){

            int a = scan.nextInt();
            int b = scan.nextInt();

            if(a >= 0 && a <= 1000000 && b >= 0 && b <= 1000000){
                int result = nwd(a,b);
                System.out.println(result);
            }
        }


    }

    public static int nwd(int a, int b){
        while(a != b){
            if(a > b){
                a = a -b;
            }else{
                b = b - a;
            }
        }

        return a;
    }
}

//accepted
//https://pl.spoj.com/problems/PP0501A/
