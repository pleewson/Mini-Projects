import java.util.Scanner;

public class MWPZ06X_nowaDzialka {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int D = scan.nextInt();

        for(int i = 0; i < D; i++){
            int x = scan.nextInt();
            int area = x * x;

            System.out.println(area);
        }


    }
}

// https://pl.spoj.com/problems/MWPZ06X/
