package eolymp.homeworkarrays;

import java.util.Scanner;

public class MinumumAndMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(Math.min(a, b) + " " + Math.max(a, b));
    }
}
