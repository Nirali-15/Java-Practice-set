package StringsJava;

import java.util.*;

public class Strings {
    public static void main(Strings args[]) {
        Scanner sc = new Scanner((System.in));
        String str = new String();
        String str1 = "hello";
        String str2 = sc.nextLine();
        for (int itr = 0; itr < str.length(); itr++) {
            System.out.println(str.charAt(itr));
        }
    }
}
