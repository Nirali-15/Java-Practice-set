package StringsJava;

import java.util.Scanner;

public class Encode_to_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) ((ch - 'a' + 3) % 26 + 'a');
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ((ch - 'A' + 3) % 26 + 'A');
            }

            result += ch;
        }

        System.out.println("Encoded: " + result);
    }
}
