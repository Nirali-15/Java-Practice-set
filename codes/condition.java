import java.util.Scanner;

public class condition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks:");
        int marks = sc.nextInt();
        if (marks >= 80) {
            System.out.println("A+ Batch");
        } else if (marks >= 70 && marks <= 80) {
            System.out.println("A Batch");
        } else if (marks >= 60 && marks <= 70) {
            System.out.println("B Batch");
        } else {
            System.out.println("C Batch");
        }
    }
}
