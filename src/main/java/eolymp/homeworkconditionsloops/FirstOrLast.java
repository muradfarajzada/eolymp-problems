package eolymp.homeworkconditionsloops;

import java.util.Scanner;

public class FirstOrLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int birinci = number / 100;
        int axirinci = number % 10;

        if (birinci > axirinci){
            System.out.println(birinci);
        } else if (axirinci > birinci) {
            System.out.println(axirinci);
        }else{
            System.out.println("=");
        }
    }
}
