import java.util.Scanner;

public class Tabtab {
    public static void main(String[] args){
        String[] tab = new String[5];

        Scanner odczyt = new Scanner(System.in);
        //pobranie danych
        for(int i=0; i<5; i++)
            tab[i] = odczyt.nextLine();
        //wyświetlenie
        for(int i=0; i<5; i++)
            System.out.println("Cześć "+tab[i]);
    }
}

