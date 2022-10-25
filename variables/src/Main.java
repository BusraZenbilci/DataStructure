/**
 * author: Busra Zenbilci
 * student ID: 20170808054
 *  date: 26.09.2022
 *  Write a short method in any language that counts the number of a,e,i,u characters in a given character string.
 *
 */


public class Main {

    public static void main(String[] args) {

        String word = "asdxasifdusds";
        System.out.println("Counts the number a,e,i,u characters " +
                "in a given character string: " + countCharacters(word));

    }

    public static int countCharacters(String word) {

        if (word == null || word.length() == 0) {
            return 0;
        }


        int count = 0;

        for (int i = 0; i < word.length(); i++) {

                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' ||
                    word.charAt(i) == 'i' || word.charAt(i) == 'u') {
                count++;
            }

        }
        return count;
    }
}