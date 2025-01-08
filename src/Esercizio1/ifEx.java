package Esercizio1;

public class ifEx {
    public static boolean stringaPariDispari(String stringa){
        return stringa.length() % 2 == 0;
  }


public static void main(String[] args) {
    System.out.println(stringaPariDispari("stringa di prova"));
    System.out.println(stringaPariDispari("seconda stringa di prova!"));
}}