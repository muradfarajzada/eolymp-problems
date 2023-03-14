package eolymp.homeworkBasic;

import java.util.Scanner;

public class DivideTheApples2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int n = scan.nextInt();
        System.out.println(n % k);
    }
}
