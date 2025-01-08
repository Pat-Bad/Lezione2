package Esercizio3;


public class whileEx {
    public static void main(String[] args) {

        String string = "Pasquale";
        int i = 0;


        while (i < string.length()) {
            System.out.println((string.charAt(i) + ", "));
            if (string.charAt(i) == 'q') {
                break;
            }
            i++;
        }

    }
}
