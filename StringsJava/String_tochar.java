package StringsJava;

import java.util.Arrays;

public class String_tochar {
    public static void main(String args[]) {
        String s = "hello world";
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
        System.out.println(Arrays.toString(ch));
    }
}
