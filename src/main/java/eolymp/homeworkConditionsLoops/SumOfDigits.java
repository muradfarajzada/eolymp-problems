package eolymp.homeworkConditionsLoops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int ilk = number / 1000;
        int axirinci = number % 10;
        System.out.println(ilk + axirinci);
    }
}
