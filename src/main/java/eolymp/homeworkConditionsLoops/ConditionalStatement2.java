package eolymp.homeworkConditionsLoops;

import java.util.Scanner;

public class ConditionalStatement2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        long y;
        if (x >= 10) {
            y = (x * x * x) + (5 * x);
        } else {
            y = (x * x) - (2 * x) + 4;
        }
        System.out.println(y);
    }
}
