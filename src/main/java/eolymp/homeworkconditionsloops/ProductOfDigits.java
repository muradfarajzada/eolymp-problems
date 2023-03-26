package eolymp.homeworkconditionsloops;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int birinci = number / 100;
        int ikinci = (number / 10) % 10;
        int axirinci = number % 10;

        System.out.println(birinci * ikinci * axirinci);
    }
}
