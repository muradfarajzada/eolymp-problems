package eolymp.homeworkconditionsloops;

import java.util.Scanner;

public class PreviousOddInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 2 == 0) {
            System.out.println(n - 1);
        } else {
            System.out.println(n - 2);
        }
    }
}
