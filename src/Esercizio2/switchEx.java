package Esercizio2;

import java.util.Scanner;

public class switchEx {
    public static void stampInLetters(int numero) {
        switch (numero) {
            case 1:
                System.out.println("one");
                break;

            case 2:
                System.out.println("two");
                break;

            case 3:
               System.out.println("three");
               break;

            default:
                System.out.println("Oops, something went wrong!");
        }

    }



    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Inserisci un numero");
        int numero = myScanner.nextInt();

        stampInLetters(numero);
        myScanner.close();
        ;
    }
}