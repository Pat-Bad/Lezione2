package Esercizio3;
//chiede una stringa e la ritorna in caratteri separati da una virgola//

public class whileEx {
    public static String separatedByCommas (String word) {

        char[] characters = word.toCharArray();
       return characters.toString();
    }

public static void main(String[] args) {
        System.out.println(separatedByCommas("ciao"));

}
}
