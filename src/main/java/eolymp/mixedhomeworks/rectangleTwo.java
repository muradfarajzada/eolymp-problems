package eolymp.mixedhomeworks;

import java.util.Scanner;

public class rectangleTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < 4; i++) {
            for (int y = 0; y < n; y++) {
                System.out.println("#");
            }
            System.out.println();
        }
    }
}
