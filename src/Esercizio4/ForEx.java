package Esercizio4;

public class ForEx {
    public static void countdown (int numero) {
        //fai un ciclo for a partire dal numero inserito con i--//


        for (int i = numero; i > 0; i--) {
            System.out.println(i);

        }}


        public static void main (String[] args) {
            countdown(5);
            countdown(65);
        }

    }