package Array;

import java.util.Scanner;

public class basic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // datatype arr_name[] =new datatype[now]; --> array declaration
        int noe = sc.nextInt();
        int arr[] = new int[noe];
        for (int ind = 0; ind < noe; ind++) {
            arr[ind] = sc.nextInt();
        }
        for (int ind = 0; ind < noe; ind++) {
            System.out.print(arr[ind] + " ");
        }
    }
}