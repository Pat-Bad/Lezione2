package Esercizio3;
//chiede una stringa e la ritorna in caratteri separati da una virgola//

public class whileEx {
    public static void main(String[] args)
    {

        String string = "Pasquale";
        int i=0;


        System.out.println(
                "Individual characters from given string: ");

        // Iterate through the given string to
        // display the individual characters

            while (i<string.length()){System.out.println((string.charAt(i) + ", "));
                    if (string.charAt(i) == 'q') {break;}
                    i++;
        }

    }
}
