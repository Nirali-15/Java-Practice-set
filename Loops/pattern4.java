import java.util.*;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int totalspace = (num * 2) - 2;
        // line =1 2<=5 2
        for (int line = 1; line <= num; line++, System.out.println()) {
            for (int star = 1; star <= line; star++)// 6<=5
            {
                System.out.print("*");// *****
            }
            for (int space = 1; space <= totalspace; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= line; star++)// 6<=5
            {
                System.out.print("*");// *****
            }
            totalspace -= 2;

        }
        int total = 0;
        for (int line = 5; line >= 1; line--, System.out.println()) {
            for (int star = 1; star <= line; star++)// 6<=5
            {
                System.out.print("*");// *****
            }
            for (int space = 1; space <= total; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= line; star++)// 6<=5
            {
                System.out.print("*");// *****
            }
            total += 2;

        }

    }
}

/*
 * 
 * E
 * D E
 * C D E
 * B C D E
 * A B C D E
 **********
 **** 
 * 
 * 
 * 
 * 
 * 
 * ****
 *** ***
 ** **
 * *
 * 
 * line star space star
 * 1 5 0 5
 * 2 4 2 4
 * 3 3 4 3
 * 4 2 6 2
 * 5 1 8 1
 *****
 * 
 * *
 * *
 * *
 *****
 * 
 * 
 * * * * *
 * 
 * *
 *
 * 
 * 
 * * * * *
 * *
 * *
 * 
 * 
 * line space star space star
 * 1 0 5 0 0
 * 2 1 1 2 1
 * 3 2 1 1 2
 * 4 3 1 0 0
 *
 **
 ***
 ****
 *****
 * 
 * 
 * 
 * 
 * N= 5
 * line space star
 * 1 4 1
 * 2 3 2
 * 3 2 3
 * 4 1 4
 * 5 0 5
 ***** 
 ****
 ***
 **
 *
 * 
 * 
 * 
 * 
 * line space star
 * 5 0 5
 * 4 1 4
 * 3 2 3
 * 2 3 2
 * 1 4 1
 * 
 * *
 ** **
 *** ***
 **** ****
 **********
 **********
 **** ****
 *** ***
 ** **
 * *
 * line star space star
 * 1 1 8 1
 * 2 2 6 2
 * 3 3 4 3
 * 4 4 2 4
 * 5 5 0 5
 * 
 * totalspace = (5*2)-2 = 8
 * (2*num) - (2*line)
 * 2*num-line-1
 * 
 * 
 * 
 * 
 */