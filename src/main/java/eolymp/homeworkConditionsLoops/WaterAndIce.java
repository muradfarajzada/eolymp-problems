package eolymp.homeworkConditionsLoops;

import java.util.Scanner;

public class WaterAndIce {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        if(t>0){
            System.out.println("Water");
        } else if (t<= 0) {
            System.out.println("Ice");
        }
    }
}
