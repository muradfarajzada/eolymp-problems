package eolymp.homeworkconditionsloops;

import java.util.Scanner;
public class TheLevelOfEducationalAchievements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a <= 3 && a >= 1) {
            System.out.println("Initial");
        } else if (a <= 6 && a >= 4) {
            System.out.println("Average");
        } else if (a <= 9 && a >= 7) {
            System.out.println("Sufficient");
        } else if (a <= 12 && a >= 10) {
            System.out.println("High");
        }
    }
}
