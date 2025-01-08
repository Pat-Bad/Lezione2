package Esercizio1b;

public class ifEx2 {
    public static boolean annoBisestile (int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
    System.out.println(annoBisestile(2024));
    System.out.println(annoBisestile(1989));}

}