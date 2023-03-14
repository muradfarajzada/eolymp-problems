package eolymp.homeworkConditionsLoops;

import java.util.Scanner;

public class ConditionStatement2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        int firstStatement = (x * x * x) + (5 * x);
        int secondStatement = (x * x) - (2 * x) + 4;

        if (x >= 10) {
            System.out.println(firstStatement);
            
        } else if (x<10) {
            System.out.println(secondStatement);
        }
    }
}
