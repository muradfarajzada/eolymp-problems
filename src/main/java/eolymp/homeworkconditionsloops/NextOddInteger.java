package eolymp.homeworkconditionsloops;

import java.util.Scanner;

public class NextOddInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + 1);
        } else {
            System.out.println(n + 2);
        }
    }
}