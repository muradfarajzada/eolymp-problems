package eolymp.homeworkConditionsLoops;

import java.util.Scanner;

public class OneDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num / 10 == 0) {
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }
    }
}
