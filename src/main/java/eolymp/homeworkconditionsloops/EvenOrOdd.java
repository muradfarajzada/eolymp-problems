package eolymp.homeworkconditionsloops;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if(n%2 == 0){
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }
    }
}
