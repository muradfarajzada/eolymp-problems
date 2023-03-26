package eolymp.homeworkconditionsloops;

import java.util.Scanner;

public class ExactlyOneConditionOutOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num % 2 == 0) {
            if (num < 0 && num % 3 == 0) {
                System.out.println("YES");
            }
        } else {
            System.out.println("NO");

        }
    }
}
