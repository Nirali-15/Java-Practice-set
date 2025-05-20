package Functions.Methods;

import java.util.Scanner;

public class Function {
    public static void PrintMyName(String name) {
        System.out.println("My name is: " + name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        PrintMyName(name);
    }
}
