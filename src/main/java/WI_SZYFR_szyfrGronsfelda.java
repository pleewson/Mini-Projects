import java.util.Scanner;

public class WI_SZYFR_szyfrGronsfelda {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String enter1 = scan.next();

        int key;
        String word;
        char[] alphabet = new char[26];

        alphabet [0] = 'A';
        alphabet [1] = 'B';
        alphabet [2] = 'C';
        alphabet [3] = 'D';
        alphabet [4] = 'E';
        alphabet [5] = 'F';
        alphabet [6] = 'G';
        alphabet [7] = 'H';
        alphabet [8] = 'I';
        alphabet [9] = 'J';
        alphabet [10] = 'K';
        alphabet [11] = 'L';
        alphabet [12] = 'M';
        alphabet [13] = 'N';
        alphabet [14] = 'O';
        alphabet [15] = 'P';
        alphabet [16] = 'Q';
        alphabet [17] = 'R';
        alphabet [18] = 'S';
        alphabet [19] = 'T';
        alphabet [20] = 'U';
        alphabet [21] = 'V';
        alphabet [22] = 'W';
        alphabet [23] = 'X';
        alphabet [24] = 'Y';
        alphabet [25] = 'Z';

        if(enter1.equals("SZYFRUJ")) {

            key = scan.nextInt();
            char[] keyArr = ("" + key).toCharArray();

            char[] convertedKey = new char[keyArr.length];

            if(key >= 0 && key <= 1_000_000_000){
                word = scan.next();
                word = word.toUpperCase();

                char[] wordArr = word.toCharArray();

                for(int i = 0; i < wordArr.length; i++){
                    //convertedKey[i] =  <- tu skonczylem.
                }



            }

        }else if(enter1.equals("DESZYFRUJ")){
            key = scan.nextInt();

            if(key >= 0 && key <= 1_000_000_000){
                //to do 2
            }

        }else{
            System.out.println("incorrect enter1");
        }
    }
}


//first learn hash map / array list and then to that.
// https://pl.spoj.com/problems/WI_SZYFR/