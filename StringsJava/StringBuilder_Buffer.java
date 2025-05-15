package StringsJava;

import java.util.Scanner;

//import java.lang.*;;
public class StringBuilder_Buffer {
    public static String Reverse(String str) {
        String[] strarr = str.split(" +"); // [the,sky,is,blue]
        StringBuilder str1 = new StringBuilder();
        int itr = strarr.length - 1;
        while (itr >= 0) {
            str1.append(strarr[itr]);// blue is the sky
            str1.append(" ");
            itr--;
        }
        return str1.toString().trim();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(Reverse(str));

    }
}
