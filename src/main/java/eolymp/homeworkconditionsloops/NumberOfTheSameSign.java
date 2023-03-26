package eolymp.homeworkconditionsloops;

import java.util.Scanner;

public class NumberOfTheSameSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num2 = scanner.nextInt();
        if ((num > 0 && num2 > 0) || (num < 0 && num2 < 0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
