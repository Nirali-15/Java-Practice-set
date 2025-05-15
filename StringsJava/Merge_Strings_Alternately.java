//
package StringsJava;

import java.util.Scanner;

public class Merge_Strings_Alternately {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;

        // Loop through both strings
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                merged.append(word1.charAt(i));
                i++;
            }
            if (j < word2.length()) {
                merged.append(word2.charAt(j));
                j++;
            }
        }

        return merged.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the first string: ");
        String word1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String word2 = sc.nextLine();

        // Call the method and print result
        String result = mergeAlternately(word1, word2);
        System.out.println("Merged string: " + result);

        sc.close();
    }
}
