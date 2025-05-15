package StringsJava;

import java.util.*;

public class Cases {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String Upper = "";
        String Lower = "";
        String digit = "";
        String Special = "";
        String Vowel = "";

        for (int itr = 0; itr < str.length(); itr++) {
            char ch = str.charAt(itr);

            if ("aeiouAEIOU".contains(Character.toString(ch))) {
                Vowel += ch;
            } else if (Character.isUpperCase(ch)) {
                Upper += ch;
            } else if (Character.isLowerCase(ch)) {
                Lower += ch;
            } else if (Character.isDigit(ch)) {
                digit += ch;
            } else {
                Special += ch;
            }
        }

        System.out.println("Upper: " + Upper);
        System.out.println("Lower: " + Lower);
        System.out.println("Digit: " + digit);
        System.out.println("Vowel: " + Vowel);
        System.out.println("Special: " + Special);
    }
}
