import java.util.Scanner;

public class JPESEL_Pesel {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        if(t > 0 && t <= 100){
            for(int i = 0; i < t; i++){
            int sum = 0;
                int p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11;

                String pesel = scan.next();
                char[] peselArr = pesel.toCharArray();

                p1 = (int) peselArr[0];
                p2 = (int) peselArr[1];
                p3 = (int) peselArr[2];
                p4 = (int) peselArr[3];
                p5 = (int) peselArr[4];
                p6 = (int) peselArr[5];
                p7 = (int) peselArr[6];
                p8 = (int) peselArr[7];
                p9 = (int) peselArr[8];
                p10 = (int) peselArr[9];
                p11 = (int) peselArr[10];

                sum += p1;
                sum += p2 * 3;
                sum += p3 * 7;
                sum += p4 * 9;
                sum += p5;
                sum += p6 * 3;
                sum += p7 * 7;
                sum += p8 * 9;
                sum += p9;
                sum += p10 * 3;
                sum += p11;

                if(sum > 0){
                    String stringSum = Integer.toString(sum);
                    char[] sumCheck0 = stringSum.toCharArray();
                    if(sumCheck0[sumCheck0.length-1] == '0'){
                        System.out.println("D");
                    }else {
                        System.out.println("N");
                    }
                }else{
                    System.out.println("N");
                }
            }
        }
    }
}

// https://pl.spoj.com/problems/JPESEL/
//accepted
