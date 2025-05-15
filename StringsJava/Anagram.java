// 

package StringsJava;

import java.util.*;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2); // This returns true or false directly
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String s = sc.nextLine();
        System.out.println("Enter second string:");
        String t = sc.nextLine();

        Anagram a = new Anagram();
        if (a.isAnagram(s, t)) {
            System.out.println("✅ The strings are anagrams.");
        } else {
            System.out.println("❌ The strings are not anagrams.");
        }
    }
}
