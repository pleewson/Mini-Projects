import java.util.Scanner;

public class VSR_predkoscSrednia {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt(); //number of tests


        if(t >= 1 && t <= 1000){

            int averageSpeed = 0;

            for(int i = 0; i < t; i++){
                int v1 = scan.nextInt(); // speed1
                int v2 = scan.nextInt(); // speed2

                if(v1 >= 1 && v1 <= 10000   &&  v2 >= 1 && v2 <= 10000) {
                    averageSpeed = (2 * v1*v2 ) / (v1+v2);
                    System.out.println(averageSpeed);

                }
            }
        }
    }
}


//https://pl.spoj.com/problems/VSR/
//not accepted but everything is working as it should.