import java.util.Scanner;

public class PP0502B_Tablice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt(); // liczba testow
        //int[] tab = new int[t];

        for (int i = 0; i < t; i++) { //testy

            int arrLength = scan.nextInt();
            int[] tab = new int[arrLength];


            for(int y = 0; y < tab.length; y++){
                int n = scan.nextInt();
                tab[y] = n;
            }

            //print reversed array
            for (int j = tab.length - 1; j >= 0; j--) {
                System.out.print(tab[j] + " ");
            }
        }
        scan.close();
    }
}

//https://pl.spoj.com/problems/PP0502B/